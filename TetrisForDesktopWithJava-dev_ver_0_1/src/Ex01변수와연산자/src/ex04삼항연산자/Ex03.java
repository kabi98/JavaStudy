package ex04삼항연산자;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		System.out.println("*** Start ***");
////////////////////////////////////////////////////////////////////////

		int iBall = 0, iBox = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("농구공의 갯수 입력 : ");
		iBall = sc.nextInt();

//		System.out.println("iNum : " + iNum);

		iBox = iBall / 5;
		iBox = iBall % 5 == 0 ? iBox : iBox + 1;

		System.out.println("필요한 상자의 수 : " + iBox);

		sc.close();
		
////////////////////////////////////////////////////////////////////////		
		System.out.println("*** Finish ***");

	}

}
