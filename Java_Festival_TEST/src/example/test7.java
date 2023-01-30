package example;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1, num2, op));

		num1 = 50;
		num2 = 15;
		op = '*';
		
		System.out.println(cal(num1, num2, op));
		
		System.out.println("*** finish ");
	}
	
	private static int cal(int num1, int num2, char op) {
		if(op == '-')
		{
			return num1-num2;
		}else if(op == '+')
		{
			return num1+num2;
		}else if(op == '*')
		{
			return num1*num2;
		}else if(op == '/')
		{
			return num1/num2;
		}
		
		return 0;
	}

	private static void printArray(int[] arrPrint) {
		// TODO Auto-generated method stub
		for(int i=0; i< arrPrint.length; i++)
		{
			System.out.printf("%2d ", arrPrint[i]);
		}
	}

}
