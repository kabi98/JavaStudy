package example;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		
		int iScan = 10;
		int [] arrUnknown = new int[1000];
		int iCnt = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		iScan = sc.nextInt();
		
		
		while (true)
		{
			arrUnknown[iCnt] = iScan % 2;
			iScan = iScan / 2;
			iCnt++;
			
			if(iScan <= 0)
				break;
		}
		
		for(int i = iCnt-1; i>= 0; i--)
		{
			System.out.printf("%2d ", arrUnknown[i]);
		}
		
		System.out.println();
		System.out.println("*** finish ");
	}

	private static int[] getBinary(int iScan) {
		int [] arrBin = null;
		
		return arrBin;
	}


}
