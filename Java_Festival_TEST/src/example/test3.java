package example;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		int iScan = 0;
		int iCount = 0;
		int [][] arrNbyN = null;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		iScan = sc.nextInt();
		
		arrNbyN = new int[iScan][];
		
		for(int i=0; i<arrNbyN.length; i++) {
			arrNbyN[i] = new int[iScan];
		}
		
		iCount = 1;
		int i = 0;
		int j =0;
		for(i=0; i< arrNbyN.length; i++)
		{
			for(j=0; j< arrNbyN[i].length; j++) {
				arrNbyN[j][i] = iCount++;
			}
		}
		
		printArray(arrNbyN);
		sc.close();
		System.out.println("*** finish ");
	}

	private static void printArray(int[][] arrNbyN) {
		// TODO Auto-generated method stub
		for(int i=0; i< arrNbyN.length; i++)
		{
			for(int j=0; j< arrNbyN[i].length; j++) {
				System.out.printf("%2d ", arrNbyN[i][j]);
			}
			System.out.println();
		}
	}

}
