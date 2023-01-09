package ex03다중if문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		////////////////////////////////////////////////////////////////////////////
		// int totalScore
		// 90점 이상 : A, 80점이상 : B, 70점이상 C, 70점 미만 D학점. 
		
		
//		int iTotalScore = 0;
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("점수 입력 : ");
//		iTotalScore = sc.nextInt();
//		
//		if (iTotalScore >= 90) {
//			System.out.println("A학점입니다!");
//		} else if (iTotalScore >= 80) {
//			System.out.println("B학점입니다!");
//		} else if (iTotalScore >= 70) {
//			System.out.println("C학점입니다!");
//		} else {
//			System.out.println("D학점입니다!");
//		}
//
//		sc.close();
		
		int iTotalScore = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		iTotalScore = sc.nextInt();

		if (iTotalScore >= 90) {
			System.out.println("A학점입니다.");
		} else if (iTotalScore >= 80) {
			System.out.println("B학점입니다.");
		} else if (iTotalScore >= 70) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("D학점입니다.");
		}

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
