package example;

import java.util.ArrayList;
import java.util.Scanner;

public class ExPage11 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		final int DIGIT_NUM = 3;
		Scanner sc = new Scanner(System.in);
		int iScanOne = 0, iScanTwo = 0;
		int [] arrTwo = null;
		int [] arrMultiple = new int [DIGIT_NUM];
		int iSum = 0, iPlaceValue = 0;
		
		System.out.printf("첫 번째 숫자 입력 >> ");
		iScanOne = sc.nextInt();
		System.out.printf("두 번째 숫자 입력 >> ");
		iScanTwo = sc.nextInt();
		
		arrTwo = DecimalToInverseArray(iScanTwo);
		printArray(arrTwo);
		
		for(int i=0; i< arrMultiple.length; i++)
		{
			arrMultiple[i] = iScanOne * arrTwo[i];
		}
		printArray(arrMultiple);
		
		iSum = 0; 
		iPlaceValue = 1;
		for(int i=0; i< arrMultiple.length; i++)
		{
			iSum += arrMultiple[i] * iPlaceValue;
			iPlaceValue *= 10; 
		}
		printArrayWithLine(arrMultiple);
		System.out.printf(" %d %n", iSum);
		
		sc.close();
		System.out.println("*** Finish ***");
	}
	
	private static int[] DecimalToInverseArray(int iDecimal) {
		ArrayList<Integer> listInverse = new ArrayList<>();
		int[] arrInverse = null;

		int iQuotient = 0, iRemainder = 0;

		iQuotient = iDecimal;
		do {
			iRemainder = iQuotient % 10;
			iQuotient = iQuotient / 10;
			listInverse.add(iRemainder);
		} while (iQuotient > 0);

		arrInverse = new int[listInverse.size()];

		for (int i = 0; i < listInverse.size(); i++) {
			arrInverse[i] = listInverse.get(i);
		}
		
		return arrInverse;
	}
	
	private static void printArrayWithLine(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
			System.out.printf("%n");
		}
	}

	private static void printArray(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}
	
}
