package example;

import java.util.Scanner;

public class ExPage18 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		int iScanN = 0, iLastNum = 0, iFrontNums = 0, iSum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print(" 정수 입력 : ");
		iScanN = sc.nextInt();

		iSum = 0;
		iFrontNums = iScanN;
		while(iFrontNums > 0)
		{
			iLastNum = iFrontNums % 10;
			iFrontNums = iFrontNums / 10;
			iSum += iLastNum;
		}
		
		System.out.printf("합은 %d 입니다.", iSum);
		System.out.println();

		sc.close();
		System.out.println();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

}
