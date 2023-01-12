package example;

import java.util.Scanner;

public class ExPage16_2 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ROW_LEN = 9, COL_LEN = 7;
		final int START_NUM = 1;
		
		int iN = 0;
		
		int iCount = 0;
		int[][] arrTwoDim = new int[ROW_LEN][COL_LEN];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print(" 정수를 입력하세요 >> ");
		iN = sc.nextInt();
		
		
		
		
		
		
		
		
		

		iCount = START_NUM;
		for (int i = 0; i < arrTwoDim.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arrTwoDim[i].length; j++) {
					arrTwoDim[i][j] = iCount;
					iCount++;
				}
			} else {
				for (int j = arrTwoDim[i].length - 1; j >= 0; j--) {
					arrTwoDim[i][j] = iCount;
					iCount++;
				}
			}
		}

		for (int i=0; i<arrTwoDim.length; i++) {
			for (int j=0; j< arrTwoDim[i].length; j++) {
				System.out.printf("%2d ", arrTwoDim[i][j]);
			}
			System.out.println();
		}
		
		
		
		

		sc.close();
		System.out.println("*** Finish ***");
		
	}

}
