package example;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		int iScan = 0;
		int iCount = 0;
		int [] arrSeqence = null;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		iScan = sc.nextInt();
		arrSeqence = new int[iScan];
		int iSeq = 1;
		for(int i= 0; i< iScan; i++)
		{
			iSeq += i;
			System.out.printf(" %2d", iSeq);
		}
		System.out.println();

		sc.close();
		System.out.println("*** finish ");
	}
	
	private static void printArray(int[] arrPrint) {
		// TODO Auto-generated method stub
		for(int i=0; i< arrPrint.length; i++)
		{
			System.out.printf("%2d ", arrPrint[i]);
		}
	}

}
