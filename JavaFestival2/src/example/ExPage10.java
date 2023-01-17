package example;

import java.util.ArrayList;
import java.util.Scanner;

public class ExPage10 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		Scanner sc = new Scanner(System.in);
		int iScan = 0, iDashCount = 0;
		int [] arrScan;
		
		do {
			System.out.printf("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
			iScan = sc.nextInt();
			System.out.printf("%d", iScan);
			
			arrScan = DecimalToArray(iScan);
			printArrayNoLine(arrScan);
			
			iDashCount = countDashFromArray(arrScan);
			System.out.print("대시('-')의 총합 >> ");
			System.out.println(iDashCount);
			if(arrScan[0] == 0) {
				break;
			}
				
		} while(true);
		
		sc.close();
		System.out.println("*** Finish ***");
	}
	
	private static int countDashFromArray(int[] arrInt) {
		// 0 ~ 9 까지의 DASH 갯수를 배열로 저장.
		final int [] DASH_COUNT = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		int iDashSum = 0;
		
		for(int i=0; i<arrInt.length; i++)
		{
			// Exam : arrInt[0] = 2 ==> DASH_COUNT[2] = 5
			//        arrInt[1] = 0 ==> DASH_COUNT[0] = 6
			//        arrInt[2] = 1 ==> DASH_COUNT[1] = 2
			//        arrInt[3] = 8 ==> DASH_COUNT[8] = 7
			// sum = 20
			iDashSum += DASH_COUNT[arrInt[i]];
		}
		
		return iDashSum;
	}

	private static int[] DecimalToArray(int iDecimal) {
		ArrayList<Integer> arrInverseBin = new ArrayList<>();
		int[] arrBinary = null;

		int iQuotient = 0, iRemainder = 0;

		iQuotient = iDecimal;
		do {
			iRemainder = iQuotient % 10;
			iQuotient = iQuotient / 10;
			arrInverseBin.add(iRemainder);
		} while (iQuotient > 0);

		arrBinary = new int[arrInverseBin.size()];

		int iPlace = 0;
		for (int i = arrInverseBin.size() - 1; i >= 0; i--) {
			arrBinary[iPlace] = arrInverseBin.get(i);
			iPlace ++;
		}
		
		return arrBinary;
	}
	
	private static void printArrayNoLine(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}

}
