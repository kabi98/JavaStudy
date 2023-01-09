package ex01while문;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		////////////////////////////////////////////////////////////////////
		// 문제 3,6,9 게임
		// 문제 1부터 50까지 중
		// 일의 자리가 3,6,9 이면 숫자가 아닌 박수를 출력.
		//

		int iNum = 1, iOneDigit = 0;

		while (iNum <= 50) {
			iOneDigit = iNum % 10;
//			System.out.println(iNum + " OneDigit " + iOneDigit);

			if ((iOneDigit == 3) || (iOneDigit == 6) || (iOneDigit == 9)) {
				System.out.println("***박수***");
			} else {
				System.out.println(iNum);
			}
			iNum++;
		}

////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
