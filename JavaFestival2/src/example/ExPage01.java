package example;

import java.util.Random;

public class ExPage01 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int START_NUM = 1, END_NUM = 45, NUM_LEN = 6;

		int[] arrLotto = new int[NUM_LEN];
		int iCur = 0, iNewNum = 0;

		Random r = new Random();

		iCur = 0;
		while (iCur < NUM_LEN) {
			iNewNum = r.nextInt(END_NUM) + START_NUM;

			if (isDuplicate(arrLotto, iNewNum) == false) {
				arrLotto[iCur] = iNewNum;
				iCur++;
			}
			System.out.printf("NewNum %2d ", iNewNum);
			printArray(arrLotto);
		}
		printLotto(arrLotto);

		System.out.println("*** Finish ***");
	}

	private static boolean isDuplicate(int[] arrLotto, int iNewNum) {
		boolean isDupl = false;

		for (int i = 0; i < arrLotto.length; i++) {
			if (arrLotto[i] == iNewNum) {
				isDupl = true;
			}
		}
		return isDupl;
	}

	private static void printArray(int[] arrInt) {
		System.out.printf(" Array : ");

		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d ", arrInt[i]);
		}
		System.out.printf("%n");
	}

	private static void printLotto(int[] arrLotto) {
		for (int i = 0; i < arrLotto.length; i++) {
			System.out.printf("행운의 숫자 : %2d %n", arrLotto[i]);
		}
	}

}
