package ex02ifelse문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
////////////////////////////////////////////////////////////////////////////
		// 1. 나이와 인원수를 입력 받는다.
		// 2. 나이에 따라 인당요금을 정한다, 20세 이상은 5000원, 20세 미만은 5000원에 50%할인
		// 3. 인원수 * 인당요금 = 총요금을 계산한다. 
		// 4. 총 요금을 출력한다.
		
		// alt + 위(아래) 방향키 : 코드 이동
		// ctrl + alt + 위(아래) : 코드 복사

		int iAge = 0, iNumPeople = 0, iTotalFee = 0, iOneFee = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력하세요 : ");
		iAge = sc.nextInt();
		
		System.out.print("인원수를 입력하세요 : ");
		iNumPeople = sc.nextInt();
		
//		System.out.println("입력 받은 나이, 인원 : " + iAge + ", " + iNumPeople);

		if (iAge >= 20) {
			iOneFee = 5000;
		} else {
			iOneFee = 5000 / 2;
		}
		iTotalFee = iOneFee * iNumPeople;

		System.out.println("총 (" + iTotalFee + ")원 입니다.");

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}


}