package question05;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {

		final int M_JOIN = 1, M_LOGIN = 2, M_SHOWALL = 3, M_EDIT = 4, M_END = 5;
		int iScan = 0;
		String strId = "", strPw = "", strNick = "";
		MemberDTO dtoOne = null;
		MemberDAO daoOne = null;
		ArrayList<MemberDTO> listDTO = null;

		Scanner sc = new Scanner(System.in);

		daoOne = new MemberDAO();

		while (true) {
			System.out.println("======SMHRD 회원관리 프로그램======");
			System.out.print("[1]회원가입 [2]로그인 [3]전체회원목록 [4]회원정보 수정 [5]종료 >>");
			iScan = sc.nextInt();
			if (iScan == M_END) {
				System.out.println("======프로그램 종료======");
				break;
			} else if (iScan == M_JOIN) {
				System.out.println("======회원가입======");
				System.out.print("ID 입력 : ");
				strId = sc.next();
				System.out.print("PW 입력 : ");
				strPw = sc.next();
				System.out.print("NICK 입력 : ");
				strNick = sc.next();

				dtoOne = new MemberDTO(strId, strPw, strNick);
				daoOne.Add(dtoOne);

			} else if (iScan == M_LOGIN) {
				System.out.println("======로그인======");
				System.out.print("ID 입력 : ");
				strId = sc.next();
				System.out.print("PW 입력 : ");
				strPw = sc.next();

				boolean isFind = false, isCorrect = false;
				listDTO = daoOne.SelectAll();
				for (int i = 0; i < listDTO.size(); i++) {
					dtoOne = listDTO.get(i);
					if (strId.equals(dtoOne.getId())) {
						isFind = true;
						if (strPw.equals(dtoOne.getPw())) {
							isCorrect = true;
						}
						break;
					}
				}

				if (isFind && isCorrect) {
					System.out.printf("%s님 환영합니다.%n", dtoOne.getNick());
				} else if (isFind) {
					System.out.printf("비밀번호가 일치하지 않습니다.%n");
				} else {
					System.out.printf("아이디를 찾을 수 없습니다.%n");
				}

			} else if (iScan == M_SHOWALL) {
				System.out.println("======전체회원목록======");
				listDTO = daoOne.SelectAll();
				for (int i = 0; i < listDTO.size(); i++) {
					dtoOne = listDTO.get(i);
					System.out.printf("%d번 %s %n", i + 1, dtoOne.toString());
				}
			} else if (iScan == M_EDIT) {
				System.out.println("======로그인======");
				System.out.print("ID 입력 : ");
				strId = sc.next();
				System.out.print("PW 입력 : ");
				strPw = sc.next();
				System.out.print("NICK 입력 : ");
				strNick = sc.next();

				boolean isEdit = false;
				listDTO = daoOne.SelectAll();
				for (int i = 0; i < listDTO.size(); i++) {
					dtoOne = listDTO.get(i);
					if (strId.equals(dtoOne.getId())) {
						if (strPw.equals(dtoOne.getPw())) {
							dtoOne = new MemberDTO(strId, strPw, strNick);
							daoOne.Edit(i, dtoOne);
							System.out.printf("수정 성공.%n");
							isEdit = true;
							break;
						}
						break;
					}
				}
				if(isEdit == false) {
					System.out.printf("수정 실패.%n");
				}
			} else {
				System.out.println("정확한 숫자를 입력해주세요");
			}

		}

		sc.close();
	}

}
