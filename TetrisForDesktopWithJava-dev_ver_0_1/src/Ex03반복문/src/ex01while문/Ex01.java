package ex01while문;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// while 문을 사용해서 5번 출력
		
//		int i = 0;
//		while (i < 5) {
//			System.out.println("안녕하세요!!! - " + i);
//			i++;
//		}
//
		int i = 1;
		while (true) {
			System.out.println("안녕하세요!!! - " + i);
			if (i >= 5) {
				break;
			}
			i++;
		}

		System.out.println("*** Finish ***");

	}

}
