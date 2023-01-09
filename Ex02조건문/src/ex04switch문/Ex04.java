package ex04switch문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 자판기 프로그램
		// 1. 금액 입력 받기.
		// 2. 메뉴를 고르세요 출력
		// 3. 1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원) >> 
		// 4. 잔돈 출력 :
		
		System.out.println("*** Start ***");
		
//////// 선언부

		int iInMoney = 0, iSelectMenu = 0, iSelectPrice = 0, iChange = 0;
		boolean bIsQuit = false;
		final int MENU_OUTER = 1, MENU_IGUDONGSUNG = 2, MENU_EGGMONG = 3;
		final int PRICE_OUTER = 700, PRICE_IGUDONGSUNG = 1000, PRICE_EGGMONG = 500;
		final int MENU_QUTI = 999;

//////// 입력부 
		Scanner sc = new Scanner(System.in);
 
		do {
			System.out.println("금액을 입력하세요");
			iInMoney = sc.nextInt();

			System.out.println("메뉴를 고르세요 . ");
			System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원) 999.끝내기 >>  ");
			iSelectMenu = sc.nextInt();
			
//////// 처리부
			
			switch (iSelectMenu) {
			case MENU_OUTER: // 아우터 700원
				iSelectPrice = PRICE_OUTER;
				break;

			case MENU_IGUDONGSUNG: // 이구동성 1000원
				iSelectPrice = PRICE_IGUDONGSUNG;
				break;

			case MENU_EGGMONG: // 에그몽 500원
				iSelectPrice = PRICE_EGGMONG;
				break;

			case MENU_QUTI: // 끝내기 ***
				bIsQuit = true;
				break;

			default:
				iSelectPrice = 0;
				break;
			}

//////////// 출력부 
			
			if (bIsQuit)
			{
				System.out.println("***** 자판기를 종료합니다 *****");
				break;
			}
			
			if (iSelectPrice == 0)
			{
				System.out.println(iSelectMenu + "는 없는 메뉴입니다.");
				continue;
			}
			
			iChange = iInMoney - iSelectPrice;

			if (iChange >= 0) {
				System.out.println("잔돈 : " + iChange + "원");
			} else {
				System.out.println("돈이 부족합니다 !");
				System.out.println("잔돈 : " + iInMoney + "원");
			}
		} while (true);

//////// 해제부 
		sc.close();
//////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
