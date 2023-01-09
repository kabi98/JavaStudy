package ex03다중if문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("*** Start ***");
		////////////////////////////////////////////////////////////////////////////
		// 짝수인지, 홀수인지, 숫자 0인지 판별하기.
		
		int iNum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		iNum = sc.nextInt();
		
		if (iNum == 0) {
			System.out.println("숫자 0입니다.");
		} else if ((iNum % 2) == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
