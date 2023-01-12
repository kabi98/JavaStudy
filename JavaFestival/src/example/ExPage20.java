package example;

import java.util.Scanner;

public class ExPage20 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		final int ARR_LEN = 10;
		Scanner sc = new Scanner(System.in);
		int[] arrScan = new int[ARR_LEN];
		
		for(int i=0; i<arrScan.length; i++)
		{
			System.out.printf("%d번째 정수 입력 >> ", i+1);
			arrScan[i] = sc.nextInt();
		}

		for(int i=0; i<arrScan.length; i++)
		{
			System.out.printf(" %d", arrScan[i]);
		}
		System.out.println();
		
		System.out.printf("3의 배수 : ");
		for(int i=0; i<arrScan.length; i++)
		{
			if( (arrScan[i] % 3) == 0) {
				System.out.printf(" %d", arrScan[i]);
			}
		}
		System.out.println();
		
		sc.close();
		System.out.println();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

}
