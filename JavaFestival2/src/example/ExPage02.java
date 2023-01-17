package example;

import java.util.Scanner;

public class ExPage02 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int ARR_LEN = 5;
		int arrScan[] = new int[ARR_LEN];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrScan.length; i++) {
			System.out.printf("%d번째 별의 수 : ", i);
			arrScan[i] = sc.nextInt();
		}

		for (int i = 0; i < arrScan.length; i++) {
			printStar(arrScan[i]);
		}

		System.out.println("*** Finish ***");
	}

	private static void printStar(int iCount) {
		System.out.printf("%d : ", iCount);
		for(int i=0; i<iCount; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

}
