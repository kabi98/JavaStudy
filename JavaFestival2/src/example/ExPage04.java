package example;

import java.util.ArrayList;
import java.util.Scanner;

public class ExPage04 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		int iDecimal = 0;
		int[] arrBinary;

		Scanner sc = new Scanner(System.in);

		System.out.printf("숫자입력>> ");
		iDecimal = sc.nextInt();

		arrBinary = DecimalToBinary(iDecimal);
		
		System.out.printf("이진수 : ");
		printArray(arrBinary);

		sc.close();
		System.out.println("*** Finish ***");
	}
	
	private static void printArray(int[] arrInt) {

		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %d", arrInt[i]);
		}
		System.out.printf("%n");
	}

	private static int[] DecimalToBinary(int iDecimal) {
		int[] arrUnknown = new int[1000]; 
		int[] arrBinary = null;

		int iQuotient = 0, iRemainder = 0;
		int iLen = 0;

		iQuotient = iDecimal;
		do {
			iRemainder = iQuotient % 2;
			iQuotient = iQuotient / 2;
			
			arrUnknown[iLen] = iRemainder;
			iLen++;
		} while (iQuotient > 0);

//		System.out.printf("iLen: %d , iDecimal : %d %n", iLen, iDecimal);
		
		arrBinary = new int[iLen];

		int iPlace = 0;
		for (int i = iLen - 1; i >= 0; i--) {
			arrBinary[iPlace] = arrUnknown[i];
			iPlace ++;
		}
		
		return arrBinary;
	}

}
