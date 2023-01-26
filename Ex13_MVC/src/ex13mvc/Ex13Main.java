package ex13mvc;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Ex13Main {

	public static void main(String[] args) {

		final int MENU_JOIN = 1, MENU_LOGIN = 2, MENU_ALL_PRINT = 3;
		final int MENU_UPDATE = 4, MENU_DELETE = 5, MENU_EXIT = 6;
		String strScanId = "", strScanPW = "", strScanName = "", strScanTel = "";
		int iRow = 0;

		MemberDAO mDAO = null;
		MemberDTO mDTO = null;
		ArrayList<MemberDTO> listDTO = null;

		Scanner sc = null;
		int choice = 0;

		sc = new Scanner(System.in);
		mDAO = new MemberDAO();

		System.out.println("===== SMHRD 회원관리 프로그램 =====");

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]전체회원목록 [4]회원정보수정 [5]회원탈퇴 [6] 종료 >> ");

			choice = sc.nextInt();

			if (choice == MENU_JOIN) {
				// 회원 가입
				System.out.printf("ID 입력 :");
				strScanId = sc.next();
				System.out.printf("PW 입력 :");
				strScanPW = sc.next();
				System.out.printf("이름 입력 :");
				strScanName = sc.next();
				System.out.printf("전화번호 입력 :");
				strScanTel = sc.next();

				mDTO = new MemberDTO(strScanId, strScanPW, strScanName, strScanTel);
				
				iRow = mDAO.Join(mDTO);
				if (iRow > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패 ㅠㅠ");
				}

			} else if (choice == MENU_LOGIN) {
				// 로그인
				System.out.printf("ID 입력 :");
				strScanId = sc.next();
				System.out.printf("PW 입력 :");
				strScanPW = sc.next();
				
				MemberDTO loginDTO = new MemberDTO();
				loginDTO.setId(strScanId);
				loginDTO.setPw(strScanPW);
				
				mDTO = mDAO.Login(loginDTO);
				if (mDTO != null) {
					System.out.println("로그인 성공");
					System.out.printf("%s 님 환영합니다 %n", mDTO.getName());
				} else {
					System.out.println("로그인 실패 ㅠㅠ, 아이디나 비밀번호를 확인해주세요.");
				}
			} else if (choice == MENU_ALL_PRINT) {
				// 전체회원목록
				listDTO = mDAO.SelectAll();
				
				String id, pw, name, tel;
				
				System.out.printf("===== 전체 회원 조회 ===== %n");
				System.out.printf("\t Id \t Pw \t Name \t Tel %n");
				for (int i = 0; i < listDTO.size(); i++) {
					id = listDTO.get(i).getId();
					pw = listDTO.get(i).getPw();
					name = listDTO.get(i).getName();
					tel = listDTO.get(i).getTel();
					
					System.out.printf("\t %s \t %s \t %s \t %s %n", id, pw, name, tel);
				}

			} else if (choice == MENU_UPDATE) {
				// 회원정보 수정
				System.out.printf("ID 입력 :");
				strScanId = sc.next();
				System.out.printf("PW 입력 :");
				strScanPW = sc.next();
				System.out.printf("이름 입력 :");
				strScanName = sc.next();
				System.out.printf("전화번호 입력 :");
				strScanTel = sc.next();
				mDTO = new MemberDTO(strScanId, strScanPW, strScanName, strScanTel);
				iRow = mDAO.Update(mDTO);
				if(iRow > 0) {
					System.out.println("회원 정보 수정 성공");
				} else {
					System.out.println("회원 정보 수정 실패 ㅠㅠ");
				}
				
			} else if (choice == MENU_DELETE) {
				// 회원 탈퇴
				System.out.printf("ID 입력 :");
				strScanId = sc.next();
				System.out.printf("PW 입력 :");
				strScanPW = sc.next();
				
				mDTO = new MemberDTO();
				mDTO.setId(strScanId);
				mDTO.setPw(strScanPW);
				
				iRow = mDAO.Delete(mDTO);
				if(iRow > 0) {
					System.out.println("회원 탈퇴 성공");
				} else {
					System.out.println("회원 탈퇴 실패 ㅠㅠ");
				}
				
			} else if (choice == MENU_EXIT) {
				// 종료
				System.out.println("===== 종료 합니다 =====");
				break;
			} else {
				// 잘못 입력
				System.out.println("없는 메뉴 입니다.");
			}

		}

		if (sc != null)
			sc.close();
	}


}
