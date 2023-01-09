package ex01array;

import java.util.Random;

public class Ex04ArrPrac {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ARR_LEN = 10;
		final int RANDOM_BOUNDARY = 100;
		int[] arrIntRandom = new int[ARR_LEN];
		Random random = new Random(); 

		for (int i = 0; i < arrIntRandom.length; i++) {
			arrIntRandom[i] = random.nextInt(RANDOM_BOUNDARY) + 1;
		}
		
		System.out.printf("arrIntRandom = ");
		for (int i = 0; i < arrIntRandom.length; i++) {
			System.out.printf("%d ", arrIntRandom[i]);
		}
		System.out.println();
		
		System.out.printf("짝수만 = ");
		for (int i = 0; i < arrIntRandom.length; i++) {
			if(arrIntRandom[i] % 2 == 0)
			{
				System.out.printf("%d ", arrIntRandom[i]);
			}
		}
		System.out.println();

		System.out.println();
		System.out.println("*** Finish ***");

	}

}
