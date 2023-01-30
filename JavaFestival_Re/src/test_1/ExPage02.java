package test_1;

import java.util.Scanner;

public class ExPage02 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int REG_HOUR = 8;
		final int HOUR_PAY = 5000;
		final double OVER_PERCENT = 1.5;
		
		int iWorkHour = 0, iOverHour = 0;
		int iTotalPay = 0, iOverPay = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		iWorkHour = sc.nextInt();
//		System.out.printf("iWorkHour : %d %n", iWorkHour);
		
		if(iWorkHour <= REG_HOUR)
		{
			iTotalPay = iWorkHour * HOUR_PAY;
		} else {
			iOverHour = iWorkHour - REG_HOUR;
			iOverPay = (int)(iOverHour * HOUR_PAY * OVER_PERCENT);
			
			iTotalPay = REG_HOUR * HOUR_PAY;
			iTotalPay = iTotalPay + iOverPay;
		}
		
		System.out.printf("총 임금은 %d원 입니다. %n", iTotalPay);
		
		sc.close();
		
		System.out.println("*** Finish ***");
		
	}

}
