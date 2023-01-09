package ex01while문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		// while 문을 10보다 큰수 입력시 종료하기.
		int iNum = 0;
		Scanner sc = new Scanner(System.in);
		
//		while (iNum < 10)
//		{
//			System.out.print("정수 입력 : ");
//			iNum = sc.nextInt();
////			System.out.println("입력 받은 수 - " + iNum);
//		}
//
		while (true) {
			System.out.print("정수 입력 : ");
			iNum = sc.nextInt();
			if (iNum >= 10) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
		sc.close();
		System.out.println("*** Finish ***");

	}

}
