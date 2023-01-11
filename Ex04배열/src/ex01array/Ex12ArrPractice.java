package ex01array;

public class Ex12ArrPractice {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 선언 및 초기화
		int[] starCount = { 3, 4, 4, 2, 1 };

		for (int i = 0; i < starCount.length; i++) {
			System.out.print(starCount[i] + " : ");
			for (int j = 0; j < starCount[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("*** Finish ***");
	}

}
