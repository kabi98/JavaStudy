package test_2;

import java.util.Random;

public class ExPage01 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int LOTTO_LEN = 6, LOTTO_START = 1, LOTTO_END = 45;

		int[] arrLotto = new int[LOTTO_LEN];
		int iR = 0, iCount = 0;
		Random r = new Random();

//		for (int i = 0; i < 10; i++) {
//			iCount = 0;
//			while (true) {
//				iR = r.nextInt(LOTTO_END) + LOTTO_START;
//				if (isDuplicate(arrLotto, iR)) {
//					continue;
//				}
//
//				if (iCount >= arrLotto.length) {
//					break;
//				}
//				arrLotto[iCount] = iR;
//				iCount++;
//			}
//
//			printArray(arrLotto);
//			System.out.println();
//		}
		
		iCount = 0;
		while (true) {
			iR = r.nextInt(LOTTO_END) + LOTTO_START;
			if (isDuplicate(arrLotto, iR)) {
				continue;
			}

			if (iCount >= arrLotto.length) {
				break;
			}
			arrLotto[iCount] = iR;
			iCount++;
		}

		printLotto(arrLotto);
		System.out.println();
		

		System.out.println("*** Finish ***");
	}

	private static void printLotto(int[] arrLotto) {
		for (int i = 0; i < arrLotto.length; i++) {
			System.out.printf("행운의 숫자 : %d %n", arrLotto[i]);
		}
	}

	private static boolean isDuplicate(int[] arrLotto, int iR) {
		for(int i=0; i< arrLotto.length; i++)
		{
			if(arrLotto[i] == iR) {
				return true;
			}
		}
		return false;
	}

	private static void printArray(int[] arrPrint) {
		for (int i = 0; i < arrPrint.length; i++) {
			System.out.printf(" %2d", arrPrint[i]);
		}
	}

}
