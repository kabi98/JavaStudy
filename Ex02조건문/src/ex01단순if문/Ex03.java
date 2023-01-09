package ex01단순if문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
////////////////////////////////////////////////////////////////////////////
		// 1. 정수 입력 받기
		// 2. 3과 5의 배수 구분하기.

		int iNum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");

		iNum = sc.nextInt();

		if ((iNum % 3 == 0) && (iNum % 5 == 0)) {
			System.out.println("3의 배수 이면서 5의 배수 입니다.");
		}
		
		System.out.println("입력 받은 정수 : " + iNum);

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

}
