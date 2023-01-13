package ex01method;

import java.util.Random;

public class Ex01Method {

	public static void main(String[] args) {
		System.out.println("*** Start Main***");

		int iRet = 0;
		int iA = 0, iB = 0;
		Random r = new Random();
		
		for(int i=0; i<10; i++)
		{
			iA = r.nextInt(20)+1;
			iB = r.nextInt(20)+1;
			iRet = diffInt(iA, iB);
			
			System.out.printf("diffInt %2d : %2d = %2d %n", 
					iA, iB, iRet);
			
		}
		
		System.out.println("*** Finish Main***");
	}
	
	public static int diffInt(int iNum1, int iNum2) {
//		System.out.println("*** Start subtractionInt ***");
		
		int iResult = iNum1 > iNum2 ? iNum1 - iNum2 : iNum2 - iNum1;
		
//		System.out.println("*** Finish subtractionInt ***");
		return iResult;
	}
	
	

}
