package ex01while문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		// -1 을 입력하면 프로그램 종료,
		final int NUM_QUIT = -1;
		int iAccumulate = 0, iNum = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 입력 : ");
			iNum = sc.nextInt();
			iAccumulate += iNum;
			System.out.println("누적결과 : " + iAccumulate);

			if (iNum == NUM_QUIT) {
				break;
			}
		}

		System.out.println("종료되었습니다.");
		sc.close();
		System.out.println("*** Finish ***");

	}

}
