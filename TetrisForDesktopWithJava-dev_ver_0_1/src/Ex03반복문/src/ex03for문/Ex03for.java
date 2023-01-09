package ex03for문;

public class Ex03for {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		// 1~100 중 3의 배수 출력
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1~100 중 3의 배수 출력
		for (int i = 1; i <= 100; i++) {
			if ((i % 3) == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if ((i % 3) == 0 && (i % 5) == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0 && (i % 3) == 0 && (i % 5) == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

}
