package ex01array;

import java.util.Scanner;

public class Ex13ArrPractice {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 회원가입, 로그인 프로그램
		// 레퍼런스 변수 생성시 초기값이 들어간다.
		// 정수나 실수 배열인 경수 -> 0
		// char 배열인 경수 -> 빈칸 ''
		// boolean 배열인 경수 -> false
		// 레퍼런스 배열인 경수 -> null
		final int LIMIT_ARR = 3;
		int iChoice = 0;
		int iCount = 0;
		boolean bIsFind = false;
		String[] arrId = new String[LIMIT_ARR];
		String[] arrPw = new String[LIMIT_ARR];
		String strScanId = "", strScanPw = "";

		Scanner sc = new Scanner(System.in);

		iCount = 0;
		// 최대로 가입가능한 회원수는 3명
		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			iChoice = sc.nextInt();
			if (iChoice == 1) {
				if (iCount >= arrId.length) {
					System.out.println("가입 가능한 회원수를 초과했습니다.");

					System.out.printf("현재 가입회원수 %d %n", iCount);
					for (int i = 0; i < iCount; i++) {
						System.out.printf("%d : %s, ", i + 1, arrId[i]);
					}
					System.out.println();
					continue;
				}

				System.out.println("=== 회원가입 ===");
				System.out.print("아이디 입력");
				strScanId = sc.next();
				System.out.print("비밀번호 입력");
				strScanPw = sc.next();

				arrId[iCount] = strScanId;
				arrPw[iCount] = strScanPw;
				iCount++;

			} else if (iChoice == 2) {
				System.out.println("=== 로그인 ===");
				System.out.print("아이디 입력");
				strScanId = sc.next();
				System.out.print("비밀번호 입력");
				strScanPw = sc.next();

				bIsFind = false;
				for (int i = 0; i < iCount; i++) {
					if (strScanId.equals(arrId[i])) {
						if (strScanPw.equals(arrPw[i])) {
							System.out.printf("%s 회원님 로그인 환영합니다. %n", strScanId);
							bIsFind = true;
							break;
						}
					}
				}
				if (bIsFind == false) {
					System.out.printf("%s 님을 찾을 수 없습니다. %n", strScanId);
				}

			} else if (iChoice == 3) {
				System.out.println("프로그램을 종료합니다. ...");
				break;
			} else {
				System.out.println("정확한 숫자를 입력하세요.");
			}

		}

		sc.close();
		System.out.println("*** Finish ***");
	}

}
