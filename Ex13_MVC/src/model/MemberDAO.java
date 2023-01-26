package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	// DB 랑 연결해서 insert, delete, update, select 하는 코드들의 모음
	// 메소드 형태료 코드 작성.
	Connection conn = null;
	PreparedStatement psmt = null;
	Statement stmt = null;
	ResultSet rs = null;

	public void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			
			conn = DriverManager.getConnection(url, user_id, user_pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeResource() {
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
			if (stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
			if (psmt != null && !psmt.isClosed()) {
				psmt.close();
			}
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}	

	public int Join(MemberDTO mDTO) {
		System.out.println("*** Insert Start ***");

		int iRet = 0;

		getConnect();
		
		try {

			String sql = "insert into big_member values (?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mDTO.getId());
			psmt.setString(2, mDTO.getPw());
			psmt.setString(3, mDTO.getName());
			psmt.setString(4, mDTO.getTel());
			iRet = psmt.executeUpdate();

			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeResource();
		}

		System.out.println("*** Insert Finish ***");
		return iRet;

	}

	public MemberDTO Login(MemberDTO loginDTO) {
		System.out.println("*** login Start ***");
		MemberDTO mDTO = null;

		getConnect();
		
		try {
			
			String sql = "select * from big_member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, loginDTO.getId());
			psmt.setString(2, loginDTO.getPw());
			rs = psmt.executeQuery();
			if (rs.next()) {
				String uid = rs.getString("id");
				String upw = rs.getString("pw");
				String uname = rs.getString("name");
				String utel = rs.getString("tel");

				mDTO = new MemberDTO(uid, upw, uname, utel);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeResource();
		}
		System.out.println("*** login Finish ***");
		return mDTO;
	}

	public ArrayList<MemberDTO> SelectAll() {

		System.out.println("*** SelectAll Start ***");
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		String id = "", pw = "", name = "", tel = "";

		getConnect();
		try {
			String sql = "select * from big_member";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {

				do {
					id = rs.getString("id");
					pw = rs.getString("pw");
					name = rs.getString("name");
					tel = rs.getString("tel");

					MemberDTO bmSelect = new MemberDTO(id, pw, name, tel);
					list.add(bmSelect);
				} while (rs.next());

			} else {
				System.out.println("회원 자료가 없습니다. ^^");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeResource();
		}

		System.out.println("*** SelectAll Finish ***");
		return list;
	}

	public int Update(MemberDTO mDTO) {
		System.out.println("*** Update Start ***");
		int iRet = 0;

		getConnect();
		try {
			String sql = "update big_member set name = ?, tel = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mDTO.getName());
			psmt.setString(2, mDTO.getTel());
			psmt.setString(3, mDTO.getId());
			psmt.setString(4, mDTO.getPw());
			iRet = psmt.executeUpdate();
			if (iRet > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeResource();
		}
		System.out.println("*** Update Finish ***");
		return iRet;
	}

	public int Delete(MemberDTO mDTO) {
		System.out.println("*** Delete Start ***");
		int iRet = 0;

		getConnect();
		try {

//			delete big_member where id = '1234' and pw = '456';			
			String sql = "delete big_member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mDTO.getId());
			psmt.setString(2, mDTO.getPw());
			iRet = psmt.executeUpdate();
			if (iRet > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeResource();
		}
		System.out.println("*** Delete Finish ***");
		return iRet;
	}

}
