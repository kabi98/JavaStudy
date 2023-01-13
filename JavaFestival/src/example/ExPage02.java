package example;

import java.util.Scanner;

public class ExPage02 {

	public static void main(String[] args) {

		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		final int HOUR_PAY = 5000, FULL_HOUR = 8;
		final double OVERTIME_PERCENT = 1.5;

		int iWorkHour = 0;
		int iTotalPay = 0;
		int iOverTimeHour = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print(" 일한 시간을 입력하세요 >> ");
		iWorkHour = sc.nextInt();

		iTotalPay = 0;
		iOverTimeHour = 0;

		if (iWorkHour > FULL_HOUR) {
			iOverTimeHour = iWorkHour - FULL_HOUR;
			
			iTotalPay = FULL_HOUR * HOUR_PAY;
			iTotalPay += iOverTimeHour * HOUR_PAY * OVERTIME_PERCENT;
		} else {
			iTotalPay = iWorkHour * HOUR_PAY;
		}

		System.out.printf("총 임금은 %d 입니다. %n", iTotalPay);

		sc.close();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
