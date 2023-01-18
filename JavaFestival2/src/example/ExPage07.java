package example;

import java.util.Scanner;

public class ExPage07 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ARR_LEN = 5;
		int[] arrScan = new int[ARR_LEN];
		int[] arrSort = new int[ARR_LEN];

		Scanner sc = new Scanner(System.in);

		System.out.println("입력 전");
		printArray(arrScan);

		for (int i = 0; i < ARR_LEN; i++) {
			System.out.printf("%d번째 수 입력 : ", i + 1);
			arrScan[i] = sc.nextInt();
		}
		
		System.out.println("정렬 전");
		printArray(arrScan);

		arrSort = selectionSort(arrScan);
		
		System.out.println("정렬 후");
		printArray(arrSort);

		sc.close();
		System.out.println("*** Finish ***");
	}

	private static int[] selectionSort(int[] arrInt) {

		int iTemp = 0;
		
		for (int i = 0; i < arrInt.length - 1; i++) {
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

	private static void printArray(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}

}
