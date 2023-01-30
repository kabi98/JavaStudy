package test_2;

import java.util.Random;
import java.util.Scanner;

public class ExPage06 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		int[] arrNumber = { 9, 8, 5, 7, 2 };
		
		scanArray(arrNumber);

		System.out.print("정렬 전 : ");
		printArray(arrNumber);
		System.out.println();

		sortArray(arrNumber);

		System.out.print("정렬 후 : ");
		printArray(arrNumber);
		System.out.println();

//		testMain();
		System.out.println("*** Finish ***");
	}

	private static void scanArray(int[] arrNumber) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			System.out.printf("%2d번째수 입력 : ", i);
			arrNumber[i-1] = sc.nextInt();
		}
		
		sc.close();
		
	}

	private static void sortArray(int[] arrSort) {
		int temp = 0;
		for (int i = 0; i < arrSort.length; i++) {
			for (int j = i + 1; j < arrSort.length; j++) {
				if (arrSort[i] > arrSort[j]) {
					temp = arrSort[i];
					arrSort[i] = arrSort[j];
					arrSort[j] = temp;
				}
			}
		}

	}

	private static void printArray(int[] arrPrint) {
		for (int i = 0; i < arrPrint.length; i++) {
			System.out.printf(" %2d", arrPrint[i]);
		}
	}

	private static void changeArray(int[] arrPoint) {
		int iR = 0;
		Random r = new Random();
		for (int i = 0; i < arrPoint.length; i++) {
			iR = r.nextInt(100);
			arrPoint[i] = iR;
		}
	}

	private static void testMain() {
		final int TEST_NUM = 3;
		int[] arrNumber = { 9, 8, 5, 7, 2 };

		for (int k = 0; k < TEST_NUM; k++) {

			System.out.print("정렬 전 : ");
			printArray(arrNumber);
			System.out.println();

			sortArray(arrNumber);

			System.out.print("정렬 후 : ");
			printArray(arrNumber);
			System.out.println();

			changeArray(arrNumber);
			System.out.println();

		}

	}

	
}
