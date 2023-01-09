package ex03for문;

import java.util.Scanner;

public class Ex04for {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		int iNum = 0;

		System.out.print("자연수를 입력하세요 >> ");
		iNum = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print((i*iNum) + " ");
		}
		System.out.println();

		sc.close();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

}
