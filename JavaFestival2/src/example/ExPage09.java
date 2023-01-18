package example;

import java.util.Scanner;

public class ExPage09 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		int[] arrScan = null;
		int[] arrSmall = null;
		int iN = 0, iX = 0, iCount = 0;

		Scanner sc = new Scanner(System.in);

		System.out.printf("N 입력 >> ");
		iN = sc.nextInt();
		
		System.out.printf("X 입력 >> ");
		iX = sc.nextInt();
		
		arrScan = new int[iN];
		arrSmall = new int[iN];
		
		for (int i = 0; i < arrScan.length; i++) {
			System.out.printf("%d번째 정수 입력 >> ", i+1);
			arrScan[i] = sc.nextInt();
		}
		
		System.out.printf("N = %d, X = %d %n", iN, iX);
		printArray(arrScan);

		iCount = 0;
		for (int i = 0; i < arrScan.length; i++) {
			if(arrScan[i] < iX)
			{
				arrSmall[iCount] = arrScan[i];
				iCount ++;
			}
		}
		System.out.print("결과 >>");
		printArray(arrSmall, iCount);

		sc.close();
		System.out.println("*** Finish ***");
	}
	
	private static void printArray(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}
	
	private static void printArray(int[] arrInt, int iLen) {
		for (int i = 0; i < iLen; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}
	

}
