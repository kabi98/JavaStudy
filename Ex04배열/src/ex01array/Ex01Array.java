package ex01array;

public class Ex01Array {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		int[] arrInt = new int[5];

		System.out.println(arrInt);
		for (int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] : %d %n", i, arrInt[i]);
		}

		arrInt[0] = 10;
		arrInt[1] = 20;
		arrInt[2] = 30;
		arrInt[3] = 40;
		arrInt[4] = 50;

		for (int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] : %d %n", i, arrInt[i]);
		}

		System.out.println("*** Finish ***");
	}

}
