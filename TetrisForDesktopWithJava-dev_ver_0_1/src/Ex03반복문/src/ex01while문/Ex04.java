package ex01while문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int NUM_QUIT = -1;
		int iEven = 0, iOdd = 0, iNum = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 입력 : ");
			iNum = sc.nextInt();
			
			if (iNum == NUM_QUIT) {
				break;
			}

			if ((iNum % 2) == 0) {
				iEven++;
			} else {
				iOdd++;
			}
			
			System.out.println("짝수개수 : " + iEven);
			System.out.println("홀수개수 : " + iOdd);

		}
		System.out.println("종료되었습니다.");

		sc.close();
		System.out.println("*** Finish ***");

	}

}
