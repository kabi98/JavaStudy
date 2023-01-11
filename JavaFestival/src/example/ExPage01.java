package example;

import java.util.Scanner;

public class ExPage01 {

	public static void main(String[] args) {

		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		int iGoalWeight = 0, iStartWeight = 0;
		int iReduceWeight = 0, iNowWeight = 0;
		int iWeeks = 0;

		System.out.print("현재 몸무게 : ");
		iStartWeight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		iGoalWeight = sc.nextInt();

		iNowWeight = iStartWeight;
		do {
			iWeeks++;
			System.out.print(iWeeks + "주차 감량 몸무게 : ");
			iReduceWeight = sc.nextInt();

			iNowWeight -= iReduceWeight;

			if (iNowWeight <= iGoalWeight) {
				System.out.println(iNowWeight + "kg 달성 !! 축하합니다!");
				break;
			}

		} while (true);

		sc.close();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
