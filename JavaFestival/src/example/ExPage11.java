package example;

import java.util.Random;

public class ExPage11 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ARR_LEN = 8, LIMIT_RANDOM = 100;
		int[] arrInt = new int[ARR_LEN];
		int iMax = 0, iMin = 0;

		Random r = new Random();

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = r.nextInt(LIMIT_RANDOM) + 1;
		}

		iMax = arrInt[0];
		for (int i = 1; i < arrInt.length; i++) {
			if(iMax < arrInt[i]) {
				iMax = arrInt[i];
			}
		}
		
		iMin = arrInt[0];
		for (int i = 1; i < arrInt.length; i++) {
			if(iMin > arrInt[i]) {
				iMin = arrInt[i];
			}
		}

		System.out.printf("배열에 있는 모든 값 : ");
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %d", arrInt[i]);
		}
		System.out.println();
		
		System.out.printf("가장 큰 값 : %d %n", iMax);
		System.out.printf("가장 작은 값 : %d %n", iMin);
		

		System.out.println();
		System.out.println("*** Finish ***");
	}

}
