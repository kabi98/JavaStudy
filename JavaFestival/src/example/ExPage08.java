package example;

import java.util.Scanner;

public class ExPage08 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		Scanner sc = new Scanner(System.in);
		int iA = 0, iB = 0;

		while (true)
		{
			System.out.print("A 입력 >> ");
			iA = sc.nextInt();
			System.out.print("B 입력 >> ");
			iB = sc.nextInt();
			
			if(iA == 0 && iB == 0)
				break;

			System.out.printf("결과 >> %d %n", iA-iB);
		}

		sc.close();
		System.out.println();
		System.out.println("*** Finish ***");
	}

}
