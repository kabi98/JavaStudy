package ex04삼항연산자;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 삼항연산자 예제
		// 두개의 정수를 입력받아 큰 수에서 작은수를 뺀 결과값을 출력하기.
		// 10, 45 = 35, 90-44 = 46
		
		System.out.println("*** Start ***");
		
		Scanner sc = new Scanner(System.in);
		
		int iNum1 = 0, iNum2 = 0, iDiff = 0;
		
		System.out.print("첫 번재 정수 입력 : ");
		iNum1 = sc.nextInt();
		System.out.print("두 번재 정수 입력 : ");
		iNum2 = sc.nextInt();		

//		System.out.println("num1 : " + iNum1 + " | " + "num2 : " + iNum2);

		iDiff = iNum1 > iNum2 ? iNum1 - iNum2 : iNum2 - iNum1; 
		
		System.out.println("두 수의 차 : " + iDiff);
		sc.close();
		
		System.out.println("*** Finish ***");

	}

}
