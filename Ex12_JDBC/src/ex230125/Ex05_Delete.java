package ex230125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_Delete {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		Scanner sc = new Scanner(System.in);
		String strId, strPW, strName, strTel;
		ArrayList<BigMember> list = new ArrayList<BigMember>();
		Statement smt = null;
		ResultSet rs = null;
		String id="", pw="", name="", tel="";

		System.out.printf("ID 입력 :");
		strId = sc.next();
		System.out.printf("PW 입력 :");
		strPW = sc.next();

		PreparedStatement psmt = null;
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

//			delete big_member where id = '1234' and pw = '456';			
			String sql = "delete big_member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, strId);
			psmt.setString(2, strPW);
			int iRow = psmt.executeUpdate();
			if(iRow > 0) {
				System.out.println("회원 탈퇴 성공");
				conn.commit();
			} else {
				System.out.println("회원 탈퇴 실패 ㅠㅠ");
				conn.rollback();
			}
			
			sql = "select * from big_member";
			smt = conn.createStatement();
			rs = smt.executeQuery(sql);
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
			
			System.out.printf("전체 회원 리스트 %n");
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
