package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.StudentMemberDAO;
import model.StudentMemberDTO;

public class StudentMain {
	static Scanner sc = new Scanner(System.in);
	
	public void StudentMain() {
		// 디자인 패턴
		// 형식 규격 지정
		// MVC패턴
		// Model ,view ,Controller
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입");
		
		while (true) {
			System.out.print("[1] 학생정보기입  [2] 전체 목록\t\n" + "[3] 정보 수정  [4] 학생정보삭제  [5] 종료 >>");

			int choice = sc.nextInt();

			if (choice == 1) {
				
				StudentJoin();

			} else if (choice == 2) {
				StudentList();
				
			} else if (choice == 3) {
				StudentUpdate();

			} else if (choice == 4) {
				// 회원탈퇴
				Studentdelect();

			} else if (choice == 5) {
				
				System.out.println("종료시킵니다.");
				System.out.println("==================");
				break;
			}
		}

	}
	public void StudentJoin() {

		System.out.print("학생ID 입력 : ");
		String STUDENTID = sc.next();

		System.out.print("학생 이름 입력 : ");
		String SNAME = sc.next();

		System.out.print("팀 이름 입력 : ");
		String TEAMNAME = sc.next();

		StudentMemberDAO dao = new StudentMemberDAO();
		int row = dao.StudentJoin(STUDENTID, SNAME, TEAMNAME);
		if (row > 0) {
			System.out.println("학생 등록 성공");
		} else {
			System.out.println("학생 등록 실패");
		}
	}

	public void StudentList() {
		StudentMemberDAO dao = new StudentMemberDAO();
		ArrayList<StudentMemberDTO> listDTO = dao.StudentSelectall();
		System.out.printf(" Id  \tPw     \tName  %n");

		for (int i = 0; i < listDTO.size(); i++) {
			StudentMemberDTO dto = listDTO.get(i);
			System.out.print(dto.getSTUDENTID() + "\t");
			System.out.print(dto.getSNAME() + "\t");
			System.out.print(dto.getTEAMNAME() + "\t");

			System.out.println();
		}
	}
	public void StudentUpdate() {
		System.out.print("학생 ID 입력 : ");
		String STUDENTID = sc.next();

		System.out.print("이름 수정하기 : ");
		String SNAME = sc.next();

		System.out.print("team 이름 수정 : ");
		String TEAMNAME = sc.next();

		StudentMemberDAO dao = new StudentMemberDAO();
		int row = dao.StudentUpdate(STUDENTID, SNAME, TEAMNAME);

		if (row > 0) {
			System.out.println("수정성공");
		} else {
			System.out.println("수정실패");
		}
	}
	public void Studentdelect() {
		// 회원탈퇴
		StudentMemberDTO dto = new StudentMemberDTO();
		System.out.print("ID 입력 : ");
		String STUDENTID = sc.next();
		dto.setSTUDENTID(STUDENTID);

		StudentMemberDAO dao = new StudentMemberDAO();
		int row = dao.StudentDelect(dto);
		if (row > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

	}
	
}