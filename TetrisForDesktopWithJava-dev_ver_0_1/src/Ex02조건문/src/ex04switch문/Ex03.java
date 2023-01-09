package ex04switch문;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("*** Start ***");
		////////////////////////////////////////////////////////////////////////////
		// 월을 입력 받아서 봄, 여름, 가을, 겨울
		int iMonth = 0;
		String strSeason = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("월 입력 : ");
		iMonth = sc.nextInt();
		

		switch (iMonth) {
		case 12, 1, 2:
			strSeason = "겨울";
			break;

		case 3, 4, 5:
			strSeason = "봄";
			break;

		case 6, 7, 8:
			strSeason = "여름";
			break;

		case 9, 10, 11:
			strSeason = "가을";
			break;

		default:
			strSeason = "잘못된 월입력";
			break;
		}
		System.out.println(iMonth + "월은 "+ strSeason + " 입니다.");

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");


	}
}
