package ex04switch문;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 구구단 출력하기.
		// 1. 2~12 정수 입력 받기.
		// 2. 구구단 출력 
		
		System.out.println("*** Start ***");
////////////////////////////////////////////////////////////////////////////
		
		int iInNum = 0;
		String strPrint = "";
		
		Scanner sc = new Scanner(System.in);

//		System.out.print("구구단(2~9) 출력할 수를 입력하세요");
//		iInNum = sc.nextInt();
//
//		System.out.println("입력받은 : " + iInNum);
		
		for (int j = 2; j <= 9; j++) {
			System.out.println( j + "단 입니다.");
			for (int i = 1; i <= 9; i++) {
				strPrint = String.format("%02d * %02d = %02d", j, i, j*i);
				System.out.println(strPrint);
			}
		}

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
