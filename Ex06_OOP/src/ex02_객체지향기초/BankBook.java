package ex02_객체지향기초;

public class BankBook {
	int iMoney;
	
	public BankBook() {
		iMoney = 0;
	}
	
	// 입금
	public void deposit(int iIn) {
		iMoney += iIn;
//		System.out.printf("입금 %d , 잔액 %d %n", iIn, iMoney);
	}
	
	// 출금
	public void withdraw(int iOut) {
		iMoney -= iOut;
//		System.out.printf("출금 %d , 잔액 %d %n", iOut, iMoney);
	}
	
	// 잔액보기
	public void showMoney() {
		System.out.printf("현재 잔액 : %d원%n", iMoney);
	}
	

}
