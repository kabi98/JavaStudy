package example;

import java.util.Scanner;

public class ExPage17 {

	public static void main(String[] args) {

		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		int iN = 0, iSum = 0, iSequence = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print(" n 입력: ");
		iN = sc.nextInt();

		
		iSequence = 1;
		for (int i = 0; i < iN; i++) {
			iSequence = iSequence + i;
			System.out.printf(" %d", iSequence);
		}
		System.out.println();

		sc.close();
		System.out.println();
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
		
	}

}
