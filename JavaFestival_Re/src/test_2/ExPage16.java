package test_2;

import java.util.Scanner;

public class ExPage16 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		String strScan = null;
		int arrAlpha[] = null;
		int iAlphaLen = 0;
		
		iAlphaLen = 'z' - 'a' + 1;
		arrAlpha = new int [iAlphaLen];
		
//		printAlpha(arrAlpha);

		strScan = "smart Media zz";
//		strScan = scanString();
		
		countAlphaString(arrAlpha, strScan);
//		countAlpha(arrAlpha, strScan);
		printAlpha(arrAlpha);
		
		System.out.println("*** Finish ***");
	}

	private static String scanString() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 >> ");
		String strScan = sc.nextLine();
		
		sc.close();
		return strScan;
	}

	private static void countAlpha(int[] arrAlpha, String strScan) {
//		System.out.println("*** countAlpha ***");
		char chAlpha = 0;
		int iChIndex = 0;
		
		System.out.printf("strScan[0] : %s %n", strScan);
		
		for(int i = 0; i < strScan.length(); i++) {
			chAlpha = strScan.charAt(i);
			iChIndex =  (int) (chAlpha - 'a');
			if(0 <= iChIndex && iChIndex < arrAlpha.length) {
				arrAlpha[iChIndex] ++; 
			}
			
			iChIndex =  (int) (chAlpha - 'A');
			if(0 <= iChIndex && iChIndex < arrAlpha.length) {
				arrAlpha[iChIndex] ++; 
			}
			
//			System.out.printf("i : %d, chAlpha : %c %n", i, chAlpha);
		}
		
	}


	private static char getChar(String strAlpha) {
		
		final String STR_SMALL = "abcdefghijklmnopqrstuvwxyz";
		final String STR_BIG   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		                          01234567890123456789012345
		
		String[] arrSmall = STR_SMALL.split("");
		String[] arrBig = STR_BIG.split("");
		
		System.out.printf("*** Start getChar %s %n", strAlpha);
		
		for(int i=0; i<arrSmall.length; i++) {
			if(strAlpha.equals(arrSmall[i]) == true ) {
				System.out.printf("*** return getChar %c %n", (char)('a' + i));
				
				return (char)('a' + i);
			}
		}

		for(int i=0; i<arrBig.length; i++) {
			if(strAlpha.equals(arrBig[i]) == true ) {
				System.out.printf("*** return getChar %c %n", (char)('A' + i));
				
				return (char)('A' + i);
			}
		}
		
		return (char)(0);
	}
	
	private static void countAlphaString(int[] arrAlpha, String strScan) {
		System.out.println("*** countAlphaString ***");
		char chAlpha = 0;
		int iChIndex = 0;
		String [] strAlpha;

		System.out.printf("*** countAlphaString %s %n", strScan);
		strAlpha = strScan.split("");
		
		for(int i = 0; i < strScan.length(); i++) {
			chAlpha = getChar(strAlpha[i]);
			if(chAlpha == 0)
				continue;
			
			iChIndex =  (int) (chAlpha - 'a');
			if(0 <= iChIndex && iChIndex < arrAlpha.length) {
				arrAlpha[iChIndex] ++; 
			}
			
			iChIndex =  (int) (chAlpha - 'A');
			if(0 <= iChIndex && iChIndex < arrAlpha.length) {
				arrAlpha[iChIndex] ++; 
			}
			
//			System.out.printf("i : %d, chAlpha : %c %n", i, chAlpha);
		}
		
	}

	
	private static void printAlpha(int[] arrAlpha) {
		for (int i = 0; i < arrAlpha.length; i++) {
			System.out.printf("%c : %2d %n", (char)'a' + i, arrAlpha[i]);
		}
	}

	
	private static void printArray(int[] arrPrint) {
		for (int i = 0; i < arrPrint.length; i++) {
			System.out.printf(" %2d", arrPrint[i]);
		}
	}

	
}
