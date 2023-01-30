package example;

import java.util.Random;
import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		int[] arrRan = new int[8];
		
		printArray(arrRan);
		
		Random r = new Random();
		for(int i=0; i<arrRan.length; i++)
		{
			arrRan[i] = r.nextInt(99);
		}
		
		int iMax = getMax(arrRan);
		
		printArray(arrRan);
		
		System.out.println("*** finish ");
	}

	private static int getMax(int[] arrRan) {
		int iMax = 0;
		for(int i=0; i<arrRan.length; i++)
		{
			;
		}
		return 0;
	}

	private static void printArray(int[] arrRan) {
		for(int i=0; i<arrRan.length; i++)
		{
			System.out.printf(" %2d", arrRan[i]);
		}
		System.out.println();
		
	}


}
