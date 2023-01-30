package test_2;

import java.util.Random;

public class ExPage05 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int TEST_NUM = 3;
		int i = 0, j = 0, iDistance = 0;
		int iMin = 0, iIdOne = 0, iIdTwo = 0;
		int[] arrPoint = { 92, 32, 52, 9, 81, 2, 68 };
//		int[] arrPoint = { 1, 88, 36, 16, 71, 5, 0 };

		for(int k =0; k<TEST_NUM; k++)
		{
			printArray(arrPoint);
			System.out.println();

			iMin = arrPoint[0];
			iIdOne = 0;
			iIdTwo = 0;

			for (i = 0; i < arrPoint.length; i++) {
				for (j = i + 1; j < arrPoint.length; j++) {
					iDistance = findDistance(arrPoint[i], arrPoint[j]);
//					 System.out.printf(" D:%2d => %2d:%2d %n",
//					 iDistance, arrPoint[i], arrPoint[j]);
					if (iMin >= iDistance) {
						iMin = iDistance;
						iIdOne = i;
						iIdTwo = j;
					}
				}
			}

			System.out.printf(" result = [%2d, %2d] %n", iIdOne, iIdTwo);

			System.out.println();
			
			changeArray(arrPoint);
		}
		System.out.println("*** Finish ***");
	}

	private static void changeArray(int[] arrPoint) {
		int iR = 0;
		Random r = new Random();
		for(int i=0; i<arrPoint.length; i++)
		{
			iR = r.nextInt(100);
			arrPoint[i] = iR;
		}
	}

	private static int findDistance(int iA, int iB) {
		int iRet = iA - iB;
		if (iRet < 0) {
			iRet = iRet * -1;
		}
		return iRet;
	}

	private static void printArray(int[] arrPrint) {
		for (int i = 0; i < arrPrint.length; i++) {
			System.out.printf(" %2d", arrPrint[i]);
		}
	}

}
