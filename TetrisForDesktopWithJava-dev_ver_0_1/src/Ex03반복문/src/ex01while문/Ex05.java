package ex01while문;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
////////////////////////////////////////////////////////////////////
		// 사용방법
		// while(조건식) {
		// 조건식의 결과가 true일때 반복하고 싶은 코드 작성.
		// }
		// 문제 1부터 10까지 콘솔에 출력

//		int iNum = 0;
//
//		while (iNum < 10) {
//			System.out.println(++iNum);
//		}

		int iNum = 1;

		while (iNum <= 10) {
			if ((iNum % 2) != 0) {
				System.out.println(iNum);
			}
			iNum++;
		}

////////////////////////////////////////////////////////////////////		
		System.out.println("*** Finish ***");

	}

}
