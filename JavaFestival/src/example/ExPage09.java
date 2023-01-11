package example;

import java.util.Scanner;

public class ExPage09 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		int iScan = 0;
		int iRound = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		iScan = sc.nextInt();

		iRound = iScan + 5;
		iRound = (iRound / 10) * 10;
		System.out.printf("반올림수 %d %n", iRound);
		sc.close();
		System.out.println();
		System.out.println("*** Finish ***");
	}

}
