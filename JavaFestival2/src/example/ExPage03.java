package example;

import java.util.Scanner;

public class ExPage03 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		int iDan = 0, iEndNum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.printf("단수입력  : ");
		iDan = sc.nextInt();
		
		System.out.printf("어느 수까지 출력  : ");
		iEndNum = sc.nextInt();
		
		printGuguDan(iDan, iEndNum);

		System.out.println("*** Finish ***");
	}

	private static void printGuguDan(int iDan, int iEndNum) {
		System.out.printf("%d단 %n", iDan);
		
		for(int i=1; i<=iEndNum; i++){
			System.out.printf("%2d * %2d = %2d %n", iDan, i, iDan*i);
		}
		
	}

}
