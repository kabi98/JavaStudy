package example;

import java.util.Scanner;

public class ExPage16 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		Scanner sc = new Scanner(System.in);;
		
		int[] arrAlphaCount = null;
		int iAlphaLen = 0;
		String strScan;

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		strScan = sc.nextLine();

		System.out.println(strScan);
		

		iAlphaLen = 'z' - 'a' + 1;
//		System.out.printf("z : %d, a : %d, z-a : %d %n", (int) 'z', (int) 'a', iAlphaLen);

		arrAlphaCount = new int[iAlphaLen];
		countStringsAlphbet(strScan, arrAlphaCount);
		printAlphbetCount(arrAlphaCount);

		sc.close();
		System.out.println("*** Finish ***");
	}

	private static void countStringsAlphbet(String strInput, int[] arrAlphaCount) {

		int iChar = 0;

		for (int i = 0; i < arrAlphaCount.length; i++) {
			arrAlphaCount[i] = 0;
		}

		for (int i = 0; i < strInput.length(); i++) {
			iChar = strInput.charAt(i) - 'a';
			if (0 <= iChar && iChar < arrAlphaCount.length) {
				arrAlphaCount[iChar]++;
			}
			
			iChar = strInput.charAt(i) - 'A';
			if (0 <= iChar && iChar < arrAlphaCount.length) {
				arrAlphaCount[iChar]++;
			}
		}

	}

	private static void printAlphbetCount(int[] arrAlphaCount) {
		for (int i = 0; i < arrAlphaCount.length; i++) {
			System.out.printf("%c : %d %n", (char) ('a' + i), arrAlphaCount[i]);
		}
	}

}
