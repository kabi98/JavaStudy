package test_1;

import java.util.Scanner;

public class ExPage03 {

	public static void main(String[] args) {
		
		System.out.println("*** Start ***");
		int iResult = 0, iNew = 0;

		for(int i=1; i<= 100; i++) {
			if( i % 2 == 0 ) {
				iNew = i * -1; 
			} else {
				iNew = i;
			}
			System.out.printf("%d ", iNew);
				
			iResult += iNew;
		}
//		System.out.printf("iWorkHour : %d %n", iWorkHour);
		System.out.println();
		System.out.printf("결과 : %d %n", iResult);
		
		System.out.println("*** Finish ***");
		
	}

}
