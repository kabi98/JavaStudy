package example;

import java.util.Random;
import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		int iScan = 0;
		String strScan = "";
		String[] arrScan = null;
		System.out.printf("첫자리 0 을 제외한 숫자를 입력해주세요>> ");
		
		
		Scanner sc = new Scanner(System.in);
		strScan = sc.next();
		
		arrScan = strScan.split("");
		
		System.out.println("*** finish ");
	}
	


	private static boolean isDuplicate(int[] arrLotto, int iNum) {
		for(int i=0; i< arrLotto.length; i++) {
			if(iNum == arrLotto[i])
				return true;
		}
		return false;
	}

	private static void printLotto(int[] arrRan) {
		for(int i=0; i<arrRan.length; i++)
		{
			System.out.printf("행운의 숫자 :  %2d %n", arrRan[i]);
		}
		System.out.println();
		
	}


	private static void printArray(String[] arrPint) {
		for(int i=0; i<arrPint.length; i++)
		{
			System.out.printf(" %s", arrPint[i]);
		}
		System.out.println();
		
	}

	private static void printArray(int[] arrRan) {
		for(int i=0; i<arrRan.length; i++)
		{
			System.out.printf(" %2d", arrRan[i]);
		}
		System.out.println();
		
	}


}
