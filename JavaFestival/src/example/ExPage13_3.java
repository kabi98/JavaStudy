package example;

import java.util.Scanner;

public class ExPage13_3 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		int[][] arrNbyN = null;
		int iScanN = 0;
		int iCount = 0;
		int i = 0, j = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print(" 정수를 입력 하세요 >> ");
		iScanN = sc.nextInt();

		arrNbyN = new int[iScanN][];
		for (i = 0; i < iScanN; i++) {
			arrNbyN[i] = new int[iScanN];
		}

		iCount = 1;
		i = 0;
		j = 0;
		for (j = 0; j < arrNbyN[i].length; j++) {
			for (i = 0; i < arrNbyN.length; i++) {
				arrNbyN[i][j] = iCount;
				iCount++;
			}
			i = 0;
		}

		for (i = 0; i < arrNbyN.length; i++) {
			for (j = 0; j < arrNbyN[i].length; j++) {
				System.out.printf(" %2d", arrNbyN[i][j]);
			}
			System.out.println();
		}

		sc.close();

		System.out.println("*** Finish ***");
	}

}
