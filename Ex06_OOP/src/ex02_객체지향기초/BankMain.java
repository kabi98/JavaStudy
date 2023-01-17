package ex02_객체지향기초;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		int iScanMoney = 0;
		
		BankBook b1 = new BankBook();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입금할 금액 입력 >> ");
		iScanMoney = sc.nextInt();
		
		b1.deposit(iScanMoney);
		b1.showMoney();
		
		System.out.printf("출금할 금액 입력 >> ");
		iScanMoney = sc.nextInt();
		b1.withdraw(iScanMoney);
		b1.showMoney();
		
		
//		b1.deposit(500);
//		b1.deposit(300);
//		b1.withdraw(200);
//		
//		b1.showMoney();
		
		System.out.println("*** Finish ***");
	}

}
