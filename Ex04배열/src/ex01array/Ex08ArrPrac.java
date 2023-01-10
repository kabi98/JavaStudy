package ex01array;

import java.util.Scanner;

public class Ex08ArrPrac {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 수박 게임
		// 숫자를 입력 받아 숫자 만큼 수박수박이 나오는 게임을 만드시오.

		char[] chText = { '수', '박' };
		int iNum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		iNum = sc.nextInt();

		for (int i = 0; i < iNum; i ++) {
			System.out.print(chText[i%2]);
		}

		System.out.println();
		
		sc.close();
		System.out.println("*** Finish ***");
	}

}
