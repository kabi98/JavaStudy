package ex04switch문;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("*** Start ***");
		////////////////////////////////////////////////////////////////////////////
		// 성적계산 프로그램 switch 로 만들기.
		int iTotalScore = 0, iGrade = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		iTotalScore = sc.nextInt();

		iGrade = iTotalScore / 10;

		switch (iGrade) {
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;

		case 8:
			System.out.println("B학점입니다.");
			break;

		case 7:
			System.out.println("C학점입니다.");
			break;

		default:
			System.out.println("D학점입니다.");
			break;
		}

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}
}
