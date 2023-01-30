package example;

import java.util.Random;
import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ");
		
		System.out.println(getMiddle("power"));
		
		System.out.println("*** finish ");
	}

	private static String getMiddle(String string) {
		System.out.println(string);
		
		int iMid = string.length();
		return string.substring(iMid, iMid+1);
	}


}
