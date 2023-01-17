package example;

import java.util.Scanner;

public class ExPage07 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ARR_LEN = 5;
		int[] arrScan = new int[ARR_LEN];
		int[] arrSort = new int[ARR_LEN];

		Scanner sc = new Scanner(System.in);

		printArrayNoLine(arrScan);

		for (int i = 0; i < ARR_LEN; i++) {
			System.out.printf("%d번째 수 입력 : ", i + 1);
			arrScan[i] = sc.nextInt();
		}
//		printArrayNoLine(arrScan);

		arrSort = sortArray(arrScan);
		System.out.println("정렬 후");
		printArrayNoLine(arrSort);

		sc.close();
		System.out.println("*** Finish ***");
	}

	private static int[] sortArray(int[] arrInt) {

		int iTemp =0;
		
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = i + 1; j < arrInt.length; j++) {
				if(arrInt[i] > arrInt[j]) {
					iTemp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = iTemp;
				}
			}
		}

		return arrInt;
	}

	private static void printArrayNoLine(int[] arrInt) {
//		System.out.printf(" Array : ");

		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}

}
