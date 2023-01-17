package example;

import java.util.Random;
import java.util.Scanner;

public class ExPage15 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int LIMIT_FAIL = 5;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int iRandomOne = 0, iRandomTwo = 0;
		int iScanAnswer = 0;
		int iFailCount = 0;

		do {
			iRandomOne = r.nextInt(10);
			iRandomTwo = r.nextInt(10);
			System.out.printf(" %d + %d = ", iRandomOne, iRandomTwo);
			iScanAnswer = sc.nextInt();

			if (IsCorrectAnswer(iRandomOne, iRandomTwo, iScanAnswer)) {
				System.out.println(" SUCCESS! ");
			} else {
				System.out.println(" Fail... ");
				iFailCount++;
			}
//			System.out.printf(" FailCount : %d %n", iFailCount);
		} while (iFailCount < LIMIT_FAIL);

		System.out.println(" GAME OVER ");

		sc.close();
		System.out.println("*** Finish ***");
	}

	private static boolean IsCorrectAnswer(int iRandomOne, int iRandomTwo, int iScanAnswer) {
		if (iScanAnswer == (iRandomOne + iRandomTwo)) {
			return true;
		}
		return false;
	}

}
