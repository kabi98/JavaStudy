package ex03for문;

import java.util.Scanner;

public class Ex07Star {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 24의 약수를 구하시오
		Scanner sc = new Scanner(System.in);
		int iNum = 0;

		System.out.print("정수를 입력하세요 >> ");
		iNum = sc.nextInt();

		System.out.printf("입력 받은 정수는 %d %n", iNum);
		
		for (int j = 0; j < iNum; j++) {
			for (int i = 0; i < iNum; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		sc.close();
		System.out.println("*** Finish ***");
	}

}
