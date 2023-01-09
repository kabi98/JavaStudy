package ex02dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
//      Plus Game : 
//      1. 랜덤으로 정수 2개를 뽑아 문제를 출력하세요.
//		2. 사용자로부터 두수의 합을 입력받는다.

//		난수(랜덤 숫자)를 생성하는 변수 만들기
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int iNum1 = 0, iNum2 = 0, iAnswer = 0;
		String strInput = "";

		System.out.println("===== Plus Game =====");

		do {
			iNum1 = r.nextInt(10) + 1;
			iNum2 = r.nextInt(10) + 1;
			System.out.print(iNum1 + " + " + iNum2 + " = ");
			iAnswer = sc.nextInt();
			if (iAnswer == (iNum1 + iNum2)) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
				System.out.print("계속하시겠습니까 ? >>  ");
				strInput = sc.next();
				if (strInput.equals("N") || strInput.equals("n")) {
					break;
				}
			}
		} while (true);

		System.out.println("종료합니다. ");
		sc.close();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
