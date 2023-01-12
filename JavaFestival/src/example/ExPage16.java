package example;

import java.util.Scanner;

public class ExPage16 {

	public static void main(String[] args) {

		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		int iN = 0;
		int x = 0, y = 0;
		int arrNbyN[][] = null;

		Scanner sc = new Scanner(System.in);

		System.out.print(" 정수를 입력하세요 >> ");
		iN = sc.nextInt();

		arrNbyN = new int[iN][];
		for (int i = 0; i < iN; i++) {
			arrNbyN[i] = new int[iN];
		}

		for (x = 0; x < arrNbyN.length; x++) {
			for (y = 0; y < arrNbyN[x].length; y++) {
				if (y % 2 == 0) {
					arrNbyN[x][y] = (x + 1) + (y * iN);
				} else {
					arrNbyN[x][y] = (iN - x) + (y * iN);
				}
			}
		}

		System.out.println();
		x = 0;
		for (y = 0; y < arrNbyN[x].length; y++) {
			for (x = 0; x < arrNbyN.length; x++) {
				System.out.printf(" %2d ", arrNbyN[x][y]);
			}
			System.out.println();
			x = 0;
		}

		sc.close();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
