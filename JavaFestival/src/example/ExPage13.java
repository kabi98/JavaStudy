package example;

import java.util.Scanner;

public class ExPage13 {

	public static void main(String[] args) {
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
				arrNbyN[x][y] = (x * iN) + (y + 1);
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

	}

}
