package ex04switch문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		////////////////////////////////////////////////////////////////////////////
		
		int iNum = 1;
		
		switch (iNum) {
		case 1:
			System.out.println("1입니다.");
//			break;

		case 2:
			System.out.println("2입니다.");
//			break;
			
		case 3:
			System.out.println("3입니다.");
			break;
			
		case 4:
			System.out.println("4입니다.");
			break;
			
		case 5:
			System.out.println("5입니다.");
			break;
			
		default:
			System.out.println("그 외의 숫자입니다.");
			break;

		}

		Scanner sc = new Scanner(System.in);
//
//		System.out.print("점수 입력 : ");
//		iTotalScore = sc.nextInt();
//
//		if (iTotalScore >= 90) {
//			System.out.println("A학점입니다.");
//		} else if (iTotalScore >= 80) {
//			System.out.println("B학점입니다.");
//		} else if (iTotalScore >= 70) {
//			System.out.println("C학점입니다.");
//		} else {
//			System.out.println("D학점입니다.");
//		}
//
		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
