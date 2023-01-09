package ex03for문;

import java.util.Scanner;

public class K01StarPrint {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 24의 약수를 구하시오
		Scanner sc = new Scanner(System.in);
		int iNum = 0;
		int iX = 0, iY = 0, iCount = 0, iHalf = 0;

		System.out.print("정수를 입력하세요 >> ");

		iNum = sc.nextInt();

		System.out.printf("입력 받은 정수는 %d %n", iNum);

		iHalf = iNum / 2;
		iCount = 0;
		for (iY = 0; iY < iHalf; iY++) {
			for (iX = 0; iX < iNum; iX++) {
				if ((iHalf - iY) <= iX && iX <= (iHalf + iY))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.printf(" | x:%d, y:%d, h:%d", iX, iY, iHalf);

			System.out.println();
		}

		for (iY = iHalf; iY < iNum; iY++) {
			for (iX = 0; iX < iNum; iX++) {
				if ((iY - iHalf + 1) <= iX + 1 && iX <= (iNum - (iY-iHalf) - 1) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.printf(" | x:%d, y:%d, h:%d, n:%d", iX, iY, iHalf, iNum);
			System.out.println();
		}

		System.out.println();

		sc.close();
		System.out.println("*** Finish ***");
	}

}
