package example;

import java.util.Scanner;

public class ExPage16_2 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int START_NUM = 1;
		
		int iN = 0;
		
		int iCount = 0;
		int[][] arrNbyN = null;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print(" 정수를 입력하세요 >> ");
		iN = sc.nextInt();
		arrNbyN = new int[iN][];
		for (int i = 0; i < iN; i++) {
			arrNbyN[i] = new int[iN];
		}

		iCount = START_NUM;
		for (int i = 0; i < arrNbyN.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arrNbyN[i].length; j++) {
					arrNbyN[i][j] = iCount;
					iCount++;
				}
			} else {
				for (int j = arrNbyN[i].length - 1; j >= 0; j--) {
					arrNbyN[i][j] = iCount;
					iCount++;
				}
			}
		}

		for (int i=0; i<arrNbyN.length; i++) {
			for (int j=0; j< arrNbyN[i].length; j++) {
				System.out.printf("%2d ", arrNbyN[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
		System.out.println("*** Finish ***");
		
	}

}
