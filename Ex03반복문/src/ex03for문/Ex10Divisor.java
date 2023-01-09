package ex03for문;

import java.util.Scanner;

public class Ex10Divisor {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 24의 약수를 구하시오
		Scanner sc = new Scanner(System.in);
		int iNum = 0;

		System.out.print("정수를 입력하세요 >> ");
		iNum = sc.nextInt();

		for(int j = 2; j <= iNum; j++)
		{
			System.out.printf("%d 의 약수는 : ", j);
			for (int i = 1; i <= j / 2; i++) {
				if ((j % i) == 0) {
					System.out.printf("%d ", i);
				}
			}
			System.out.printf("%d ", j);
			System.out.println();
		}
		
		sc.close();
		System.out.println("*** Finish ***");
	}

}
