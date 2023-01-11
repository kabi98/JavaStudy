package example;

import java.util.Scanner;

public class ExPage07 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		Scanner sc = new Scanner(System.in);
		int iNum = 0;
		int iX = 0, iY = 0;

		System.out.print("행 개수 : ");
		iNum = sc.nextInt();

		for (iY = 0; iY < iNum; iY++) {
			for (iX = 0; iX < iNum; iX++) {
				if (iX < iNum - iY) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		sc.close();

		System.out.println();

		System.out.println("*** Finish ***");
	}

}
