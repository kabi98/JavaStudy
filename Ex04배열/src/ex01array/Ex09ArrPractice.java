package ex01array;

import java.util.Scanner;

public class Ex09ArrPractice {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 팀원 검색 프로그램
		// 문제. 키보드로부터 팀원이름을 입력 받아서 일치하는 사람이 존재한다면,
		// 강규남은 2번 위치에 존재합니다.

		// 선언
		String[] arrTeam = { "문경수", "윤상재", "남하은", "장이수", "구소현" };
		String strScan = "";
		boolean bIsExist = false;
		Scanner sc = new Scanner(System.in);

		// 팀원 자료 확인
		System.out.println("*** 팀원 ***");
		for (int i = 0; i < arrTeam.length; i++) {
			System.out.printf("%s ", arrTeam[i]);
		}
		System.out.println();
		
		// 입력부
		System.out.print("이름을 입력하세요 >> ");
		strScan = sc.next();
		
		// 검색 처리부
		bIsExist = false;
		for (int i = 0; i < arrTeam.length; i++) {
			if (strScan.equals(arrTeam[i]) == true) {
				System.out.printf("%s 님은 %d번 위치에 존재합니다.%n", strScan, i+1);
				bIsExist = true;
				break;
			}
		}

		if (bIsExist == false) {
			System.out.println("해당 팀원은 존재하지 않습니다");
		}

		System.out.println();

		sc.close();
		System.out.println("*** Finish ***");
	}

}
