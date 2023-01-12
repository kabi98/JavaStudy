package example;

import java.util.Scanner;

public class ExPage13_2 {

	public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////////
		int iScanX = 0, iScanY = 0;
		int x = 0, y = 0;
		int arrNbyN[][] = null;

		Scanner sc = new Scanner(System.in);

		System.out.print(" X 정수를 입력하세요 >> ");
		iScanX = sc.nextInt();
		System.out.print(" Y 정수를 입력하세요 >> ");
		iScanY = sc.nextInt();

		arrNbyN = new int[iScanX][];
		for (int i = 0; i < iScanX; i++) {
			arrNbyN[i] = new int[iScanY];
		}

		x = 0;
		y = 0;
		for (x = 0; x < arrNbyN.length; x++) {
			for (y = 0; y < arrNbyN[x].length; y++) {
				arrNbyN[x][y] = (x * iScanY) + (y + 1);
			}
		}

		x = 0;
		y = 0;
		System.out.println();
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
