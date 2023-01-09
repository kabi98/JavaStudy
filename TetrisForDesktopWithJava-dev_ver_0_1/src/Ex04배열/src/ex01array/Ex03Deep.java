package ex01array;

public class Ex03Deep {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ARR_LEN = 3;
		int[] arrInt = new int[ARR_LEN];
		int[] arrInt2 = { 10, 20, 30 };

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (i + 1) * 10;
		}

		System.out.println("arrInt = " + arrInt);
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf("%d ", arrInt[i]);
//			System.out.printf("arrInt[%d] : %d %n", i, arrInt[i]);
		}
		System.out.println();

		System.out.println("arrInt2 = " + arrInt2);
		for (int i = 0; i < arrInt2.length; i++) {
			System.out.printf("%d ", arrInt2[i]);
//			System.out.printf("arrInt[%d] : %d %n", i, arrInt[i]);
		}
		System.out.println();

		int[] arrInt3 = { 10, 20, 30, 40, 50 };
		int[] arrInt4 = new int[5];
		
		System.out.println("arrInt3 = " + arrInt3);
		System.out.println("arrInt4 = " + arrInt4);
		
		arrInt4 = arrInt3;
		System.out.println("arrInt3 = arrInt4");
		System.out.println("arrInt3 = " + arrInt3);
		System.out.println("arrInt4 = " + arrInt4);
		
		System.out.printf("arrInt3 = ");
		for (int i = 0; i < arrInt3.length; i++) {
			System.out.printf("%d ", arrInt3[i]);
		}
		System.out.println();
		
		System.out.printf("arrInt4 = ");
		for (int i = 0; i < arrInt4.length; i++) {
			System.out.printf("%d ", arrInt4[i]);
		}
		System.out.println();
		
		arrInt3[3] = 100;
		
		System.out.println("arrInt3[3] = 100");
		
		System.out.printf("arrInt3 = ");
		for (int i = 0; i < arrInt3.length; i++) {
			System.out.printf("%d ", arrInt3[i]);
		}
		System.out.println();
		
		System.out.printf("arrInt4 = ");
		for (int i = 0; i < arrInt4.length; i++) {
			System.out.printf("%d ", arrInt4[i]);
		}
		
		System.out.println();

		System.out.println("*** Finish ***");

	}

}
