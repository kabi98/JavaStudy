package ex01array;

import java.util.Random;
import java.util.Scanner;

public class Ex06ArrPrac {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ARR_LEN = 5;
		int[] arrIntScan = new int[ARR_LEN];
		int iMax = 0, iMin = 0, iSum = 0;
		double dAvg = 0.0;
		
		Scanner sc = new Scanner(System.in);
		// 문제. 입력 받은 점수의 총합과 평균 출력. (5개 입력 받기)
		// 최고, 최저, 총합, 평균 출력.

		for (int i = 0; i < arrIntScan.length; i++) {
			System.out.print("점수를 입력하세요 >> ");
			arrIntScan[i] = sc.nextInt();
		}

		System.out.printf("arrIntScan = ");
		for (int i = 0; i < arrIntScan.length; i++) {
			System.out.printf("%d ", arrIntScan[i]);
		}
		System.out.println();

		iMax = arrIntScan[0];
		for (int i = 0; i < arrIntScan.length; i++) {
			if (arrIntScan[i] > iMax) {
				iMax = arrIntScan[i];
			}
		}

		iMin = arrIntScan[0];
		for (int i = 0; i < arrIntScan.length; i++) {
			if (arrIntScan[i] < iMin) {
				iMin = arrIntScan[i];
			}
		}

		iSum = 0;
		for (int i = 0; i < arrIntScan.length; i++) {
			iSum += arrIntScan[i];
		}
		
		dAvg = (float)iSum / arrIntScan.length;
		
		System.out.printf("Min:%d, Max:%d, Sum:%d, Avg:%f %n ", 
				iMin, iMax, iSum, dAvg);

		System.out.println();
		System.out.println("*** Finish ***");

	}

}
