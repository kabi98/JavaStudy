package ex230125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03_Update {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 사용자한테 id, pw, 이름, 전화번호 입력 받기.
		Scanner sc = new Scanner(System.in);
		String strId, strPW, strName, strTel;

		System.out.printf("ID 입력 :");
		strId = sc.next();
		System.out.printf("PW 입력 :");
		strPW = sc.next();
		System.out.printf("이름 입력 :");
		strName = sc.next();
		System.out.printf("전화번호 입력 :");
		strTel = sc.next();

		// JDBC
		// Runtime Error : 실행 중 발생하는 에러 (문법 문제 X) --> 예외처리 필요.
		PreparedStatement psmt = null;
		Connection conn = null;

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
//			update big_member
//			  set name = '윤상재',
//			      pw = '456',
//			      tel = '4567890'
//			where id = 1234;
			
			String sql = "update big_member set name = ?, tel = ? where id = ? and pw = ?";
			// ? 인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를때 사용
			// : 지정한 데이터 공간만큼 비워 놓고 실행하기 전까지 대기

			// 4. sql문 전송(실행)
			psmt = conn.prepareStatement(sql);
			// ---> 전송하기 전에 sql문을 담아서 전송할 수 있는 형식으로 변경
			
			// ? 인자 채우는 작업 진행(!! 반드시 실행전에 진행할 것 !!)
			// 데이터 바인딩(data binding) 작업.
			psmt.setString(1, strName);
			psmt.setString(2, strTel);
			psmt.setString(3, strId);
			psmt.setString(4, strPW);
			
			// 반드시 물음표 인자를 전부 채워준 후에 실행해야 한다.
			int iRow = psmt.executeUpdate();
			// executeUpdate() : insert, update, delete DML 에만 사용.
			
			// 5. 결과를 이용한 작업처리
			// 사용자한테 어떤 결과를 보여줄지 정의
			if(iRow > 0) {
				System.out.println("회원수정 성공");
				conn.commit();
			} else {
				System.out.println("회원수정 실패 ㅠㅠ");
				conn.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
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
