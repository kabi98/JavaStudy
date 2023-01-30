package example;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		int iSum = 0;
		int iInvers = 0;
		
		iInvers = 77;
		for(int i=0; i< 77; i++)
		{
			System.out.printf(" (%d * %d) + ", iInvers, i+1);
			iSum = iSum + ((i+1)*iInvers);
			iInvers --;
		}
		System.out.printf("%n Sum : (%d) %n", iSum);
		
		System.out.println("*** finish ");
	}
	

}
