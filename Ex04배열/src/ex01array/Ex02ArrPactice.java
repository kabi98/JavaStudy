package ex01array;

public class Ex02ArrPactice {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ARR_LEN = 10;
		int[] arrInt = new int[ARR_LEN];

//		System.out.println(arrInt);
//		for (int i = 0; i < ARR_NUM; i++) {
//			System.out.printf("arr[%d] : %d %n", i, arrInt[i]);
//		}
//
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i + 1;
		}
		
		System.out.println("arrInt = " + arrInt);
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf("%d ", arrInt[i]);
//			System.out.printf("arrInt[%d] : %d %n", i, arrInt[i]);
		}
		System.out.println();

		System.out.println("*** Finish ***");
	}

}
