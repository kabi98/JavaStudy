package example;

import java.util.Scanner;

public class ExPage04 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		int iRemainMoney = 0, iScanMoney = 0;
		int iTenThousand = 0, iFiveThousand = 0, iOneThousand = 0;
		int iFiveHundred = 0, iOneHundred = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("총금액 입력 : ");
		iScanMoney = sc.nextInt();
		iRemainMoney = iScanMoney;
		
		iTenThousand = iRemainMoney / 10000;
		iRemainMoney %= 10000;
		
		iFiveThousand = iRemainMoney / 5000;
		iRemainMoney %= 5000;

		iOneThousand = iRemainMoney / 1000;
		iRemainMoney %= 1000;

		iFiveHundred = iRemainMoney / 500;
		iRemainMoney %= 500;
		
		iOneHundred = iRemainMoney / 100;
		iRemainMoney %= 100;
		
		System.out.printf("잔돈 : %d원 %n", iScanMoney);
		System.out.printf("10000원 : %d개 %n", iTenThousand);
		System.out.printf("5000원 : %d개 %n", iFiveThousand);
		System.out.printf("1000원 : %d개 %n", iOneThousand);
		System.out.printf("500원 : %d개 %n", iFiveHundred);
		System.out.printf("100원 : %d개 %n", iOneHundred);
		
		sc.close();
		System.out.println("*** Finish ***");
	}

}
