package ex03for문;


public class Ex02for {
	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		// for문 사용 21~57까지 가로로 출력
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");

		}
		System.out.println();

		// for문 사용 96~53까지 가로로 출력
		for (int i = 53; i <= 96; i++) {
			System.out.print(149 - i + " ");
		}
		System.out.println();

		// for문 사용 22 ~ 57 까지 홀수만 가로로 출력.
		for (int i = 22; i <= 57; i++) {
			if ((i % 2) == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}
}
