package ex03for문;

import java.util.Scanner;

public class Ex05Gugudan {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		
//		for (int iDan = 2; iDan <= 9; iDan++) {
//			System.out.printf("*** %d단 *** %n", iDan );
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %2d%n", iDan, i, (i * iDan));
//			}
//			System.out.println();
//		}
//		
//		
		Scanner sc = new Scanner(System.in);
		int iDan = 0;

		System.out.print("자연수를 입력하세요 >> ");
		iDan = sc.nextInt();
		System.out.printf("입력받은 자연수는 %d입니다%n", iDan);
		System.out.printf("*** %d단 *** %n", iDan );
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d%n", iDan, i, (i * iDan));
		}
		System.out.println();
		
		sc.close();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
