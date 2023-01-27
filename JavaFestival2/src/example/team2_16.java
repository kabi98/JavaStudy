package example;

import java.util.Scanner;

public class team2_16 {

	public static void main(String[] args) {
		System.out.println("***Strart***");
		Scanner sc = new Scanner(System.in);

		System.out.println("***알파벳 빈도수 구하기***");
		System.out.print("입력 >>");

		String strScan = sc.nextLine();
		System.out.printf("strScan = %s ", strScan);

		System.out.println();
		for (int i = 0; i < strScan.length(); i++) {
			System.out.printf("%c %n", strScan.charAt(i));
		}
		
//		System.out.printf("z - a + 1 = %d %n", 'z' - 'a' + 1);
		

//		System.out.printf("z - a + 1 = %d %n", 'z' - 'a' + 1);
		int iAlphaPos = 0;
		int[] arrAlpha = null;
		arrAlpha = new int['z' - 'a' + 1];

		for (int i = 0; i < strScan.length(); i++) {
			if (strScan.charAt(i) == 'a') {
				arrAlpha[0]++;
			}
		}

		for (int i = 0; i < strScan.length(); i++) {
			iAlphaPos = strScan.charAt(i) - 'a';
			if (0 <= iAlphaPos && iAlphaPos < arrAlpha.length) {
				arrAlpha[iAlphaPos]++;
			}

			iAlphaPos = strScan.charAt(i) - 'A';
			if (0 <= iAlphaPos && iAlphaPos < arrAlpha.length) {
				arrAlpha[iAlphaPos]++;
			}
		}

		System.out.println();
		
		for (int i = 0; i < arrAlpha.length; i++) {
			System.out.printf("%c : %d %n", 'a' + i, arrAlpha[i]);
		}

		sc.close();
		System.out.println("***Finish***");
	}

}
