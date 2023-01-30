package test_1;

import java.util.Scanner;

public class ExPage01 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		int iCur = 0, iDiet = 0, iGoal = 0, iWeek = 0, iScan = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		iCur = sc.nextInt();
		
		System.out.print("목표몸무게 : ");
		iGoal = sc.nextInt();

		iCur = 80; iGoal = 60;
		System.out.printf("iCur : %d, iGoal : %d %n", iCur, iGoal);

		iWeek = 1;
		iDiet = iCur;
		while (true)
		{
			System.out.printf("%2d주차 감량 몸무게 : ", iWeek);
			iScan = sc.nextInt();
			
			iDiet = iDiet - iScan;
			if(iGoal > iDiet)
			{
				break;
			}
			iWeek++;
		}
		
		System.out.printf(" %dkg 달성!! 축하합니다. %n", iDiet);
		
		sc.close();
		
		
		System.out.println("*** Finish ***");
	}

}
