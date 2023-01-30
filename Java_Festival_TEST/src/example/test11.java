package example;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		
		int iOverHour = 0;
		int iScan = 10;
		int iTotalPay = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		iScan = sc.nextInt();
		
		if(iScan <= 8)
		{
			iTotalPay = iScan * 5000;
		}
		else
		{
			iOverHour = iScan - 8;
			iTotalPay = 8 * 5000;
			iTotalPay += (int)(iOverHour * (5000*1.5));
		}
			
		System.out.printf("총 임금은 %d 입니다 %n", iTotalPay);
		
		
		System.out.println();
		System.out.println("*** finish ");
	}


}
