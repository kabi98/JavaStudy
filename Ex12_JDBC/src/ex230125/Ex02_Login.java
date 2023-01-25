package ex230125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_Login {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		String strId, strPW, strName, strTel;
		// 로그인 프로그램
		// 1. id, pw 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.printf("ID 입력 :");
		strId = sc.next();
		System.out.printf("PW 입력 :");
		strPW = sc.next();
		
		// 2. id, pw 가 DB에 저장된 정보와 일치하는지 체크
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

		// JDBC
		// Runtime Error : 실행 중 발생하는 에러 (문법 문제 X) --> 예외처리 필요.
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

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
			String sql = "select * from big_member where id = ? and pw = ?";
					
			// ? 인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를때 사용
			// : 지정한 데이터 공간만큼 비워 놓고 실행하기 전까지 대기

			// 4. sql문 전송(실행)
			psmt = conn.prepareStatement(sql);
			// ---> 전송하기 전에 sql문을 담아서 전송할 수 있는 형식으로 변경
			
			// ? 인자 채우는 작업 진행(!! 반드시 실행전에 진행할 것 !!)
			// 데이터 바인딩(data binding) 작업.
			psmt.setString(1, strId);
			psmt.setString(2, strPW);
			
			// 반드시 물음표 인자를 전부 채워준 후에 실행해야 한다.
			rs =  psmt.executeQuery();
			// Result Set
			// 행을 카리키는 커서를 가지고 있다.
			// 처음에는 열이름을 가리킨다.
			// rs.next() : 커서를 밑으로 한행 내림.
			//             해당하는 행에 데이터가 있으면 true;
			// 만약 커서를 한 줄 내렸을때 , 데이터 있음 == 로그인 성공
			//                       , 데이터 없음 == 로그인 실패
			if( rs.next() ) {
				System.out.println("로그인 성공");

				// rs.get...(int) : 왼쪽에서 몇번째 열에서 데이터를 꺼낸다.
				String uid = rs.getString(1);
				String upw = rs.getString(2);
				
				// rs.get...("컬럼이름") : 컬럼이름을 이용해서 데이터를 꺼낸다.
				String uname = rs.getString("name");
				String utel = rs.getString("tel");
				
				System.out.println(uname + "님 환영합니다.");
			} else {
				System.out.println("로그인 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(rs != null ) {
					rs.close();
				}
				if(psmt != null ) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			
		}
		
		sc.close();
		System.out.println("*** Finish ***");
	}

}
