package ex02ifelse문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		////////////////////////////////////////////////////////////////////////////
		// 마트 계산대 프로그램
		// 10000원 짜리 선물 세트 구입했을 때 지불해야 하는 금액을 계산
		// 단, 11개 이상 구매시에는 전체금액에서 10% 할인이 적용됩니다.
		// 1. 상품의 개수를 입력 받는다.
		// 2. 개수에 따라 개당요금을 정한다, 11 이상은 9000원, 11개 미만은 10000원 
		// 3. 개수 * 개당요금 = 총요금을 계산한다. 
		// 4. 총 요금을 출력한다.
		
		// alt + 위(아래) 방향키 : 코드 이동
		// ctrl + alt + 위(아래) : 코드 복사

		final int FULL_PRICE = 10000, NUM_DISCOUNT = 11;
		final double DISCOUNT_RATE = 0.9;
		int iNum = 0, iTotalPrice = 0, iOnePrice = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("상품의 개수를 입력하세요 : ");
		iNum = sc.nextInt();

		//System.out.println("입력 받은 개수 : " + iNum );

		if (iNum >= NUM_DISCOUNT) {
			iOnePrice = (int)(FULL_PRICE * DISCOUNT_RATE);
			
		} else {
			iOnePrice = FULL_PRICE;
		}
		iTotalPrice = iOnePrice * iNum;

		System.out.println("총 가격은 (" + iTotalPrice + ")원 입니다.");

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
