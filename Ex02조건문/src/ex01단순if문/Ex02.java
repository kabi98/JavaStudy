package ex01단순if문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
////////////////////////////////////////////////////////////////////////////
		// 1. 나이 입력 받기
		// 1) Scanner 가져오기
		// 2) "나이를 입력하세요 :" 출력
		// 3) 숫자를 입력받아 변수에 담기.
		// 2. 성인인지 아닌지 구분하기.
		
		int iAge = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		
		iAge = sc.nextInt();
		
		if(iAge >= 20)
		{
			System.out.println("성인입니다.");
		}
		
		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

}
