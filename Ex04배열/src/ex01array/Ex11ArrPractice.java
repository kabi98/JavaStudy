package ex01array;

import java.util.Scanner;

public class Ex11ArrPractice {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 선언 및 초기화
		final int ARR_LENGTH = 5;
		int[] arrAnswer = { 1, 4, 3, 2, 1 };
		int[] arrInput = new int[ARR_LENGTH];
		char[] arrResult = new char[ARR_LENGTH];
		int iScore = 0;

		Scanner sc = new Scanner(System.in);
		// 입력부
		System.out.println("===== 채점하기 ======");
		System.out.println("답을 입력하세요...");

		for (int i = 0; i < arrInput.length; i++) {
			System.out.printf("%d번 답>> ", i + 1);
			arrInput[i] = sc.nextInt();
		}

		// 처리부
		iScore = 0;
		for (int i = 0; i < arrInput.length; i++) {
			if (arrInput[i] == arrAnswer[i]) {
				arrResult[i] = 'O';
				iScore += 20;
			} else {
				arrResult[i] = 'X';
			}
		}

		// 출력부
		System.out.print("정답 확인 :  ");
		for (int i = 0; i < arrInput.length; i++) {
			System.out.printf("%s ", arrResult[i]);
		}

		System.out.printf("  총점 : %d ", iScore);
		System.out.println();
		sc.close();
		System.out.println("*** Finish ***");
	}

}
