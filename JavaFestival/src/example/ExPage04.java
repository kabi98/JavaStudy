package example;

import java.util.Scanner;

public class ExPage04 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		int iTotalMoney = 0;
		int iTenThousand = 0, iFiveThousand = 0, iOneThousand = 0;
		int iFiveHundred = 0, iOneHundred = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("총금액 입력 : ");
		iTotalMoney = sc.nextInt();
		
		iTenThousand = iTotalMoney / 10000;
		iTotalMoney %= 10000;
		
		iFiveThousand = iTotalMoney / 5000;
		iTotalMoney %= 5000;

		iOneThousand = iTotalMoney / 1000;
		iTotalMoney %= 1000;

		iFiveHundred = iTotalMoney / 500;
		iTotalMoney %= 500;
		
		iOneHundred = iTotalMoney / 100;
		iTotalMoney %= 100;
		
		System.out.printf("잔돈 : %d원 %n", iTotalMoney);
		System.out.printf("10000원 : %d개 %n", iTenThousand);
		System.out.printf("5000원 : %d개 %n", iFiveThousand);
		System.out.printf("1000원 : %d개 %n", iOneThousand);
		System.out.printf("500원 : %d개 %n", iFiveHundred);
		System.out.printf("100원 : %d개 %n", iOneHundred);
		
		sc.close();
		System.out.println("*** Finish ***");
	}

}
