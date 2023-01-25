package ex230125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_SelectAll {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		ArrayList<BigMember> list = new ArrayList<BigMember>();

		Connection conn = null;
		Statement smt = null;
		ResultSet rs = null;
		String id="", pw="", name="", tel="";

		// try - catch : 예외처리 구문.
		try {
			// 1. 드라이버 동적 로딩(데이터베이스 종류 결정)
			// 동적로딩이란 ?
			// : 실행하는 순간에 자료형을 결정하는 것.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 연결 통로를 열어주는 작업
			// --> url, user_id, password;
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

			// 3. sql문 준비
			// 회원가입 >> big_member 테이블 데이터 추가
			// insert 구문.
			String sql = "select * from big_member";

			// ? 인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를때 사용
			// : 지정한 데이터 공간만큼 비워 놓고 실행하기 전까지 대기

			// 4. sql문 전송(실행)
			smt = conn.createStatement();

			// 반드시 물음표 인자를 전부 채워준 후에 실행해야 한다.
			rs = smt.executeQuery(sql);
			// Result Set
			// 행을 카리키는 커서를 가지고 있다. // 처음에는 열이름을 가리킨다.
			// rs.next() : 커서를 밑으로 한행 내림.
			// 해당하는 행에 데이터가 있으면 true;
			// 만약 커서를 한 줄 내렸을때 , 데이터 있음 == 로그인 성공
			// , 데이터 없음 == 로그인 실패
			if (rs.next()) {

				do {
					id = rs.getString("id");
					pw = rs.getString("pw");
					name = rs.getString("name");
					tel = rs.getString("tel");

					BigMember bmSelect = new BigMember(id, pw, name, tel);
					list.add(bmSelect);
				} while(rs.next());

			} else {
				System.out.println("회원 자료가 없습니다. ^^");
			}
			
			System.out.printf("\t Id \t Pw \t Name \t Tel %n");
			for (int i = 0; i < list.size(); i++) {
				id = list.get(i).getId();
				pw = list.get(i).getPw();
				name = list.get(i).getName();
				tel = list.get(i).getTel();
				
				System.out.printf("\t %s \t %s \t %s \t %s %n", id, pw, name, tel);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (smt != null) {
					smt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}

		}

		System.out.println("*** Finish ***");
	}

}
