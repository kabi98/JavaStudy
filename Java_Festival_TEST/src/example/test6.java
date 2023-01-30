package example;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		final int ARR_LEN = 5;
		int arrNbyN[][] = new  int[ARR_LEN][ARR_LEN];
		int arrRotate[][] = null;
		
		int iCount = 1;
		for(int i=0; i< arrNbyN.length; i++)
		{
			for(int j=0; j< arrNbyN.length; j++)
			{
				arrNbyN[i][j] = iCount ++;
			}
		}
		System.out.println("*** 원본 **** ");
		
		printArray(arrNbyN);
		
		System.out.println("*** 90도 회전 **** ");
		arrRotate = rotateArray(arrNbyN);
		printArray(arrRotate);

		
		
		System.out.println("*** finish ");
	}
	
	private static int[][] rotateArray(int[][] arrOrg) {
		int arrRotate[][] = null;
		
		arrRotate = new int[arrOrg.length][];
		for(int i=0; i<arrOrg.length; i++ )
		{
			arrRotate[i] = new int[arrOrg[i].length];
		}
		
		for(int i=0; i< arrOrg.length; i++)
		{
			for(int j=0; j< arrOrg[i].length; j++)
			{
				arrRotate[arrOrg[i].length -1- j][i] = arrOrg[i][j];
			}
		}
		
		
		
		return arrRotate;
	}

	private static void printArray(int[][] arrPrint) {
		// TODO Auto-generated method stub
		for(int i=0; i< arrPrint.length; i++)
		{
			for(int j=0; j< arrPrint.length; j++)
			{
				System.out.printf("%2d ", arrPrint[i][j]);
				
			}
			System.out.println();
		}
	}

}
