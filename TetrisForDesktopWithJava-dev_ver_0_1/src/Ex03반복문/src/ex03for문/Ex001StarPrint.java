package ex03for문;

import java.util.Scanner;

public class Ex001StarPrint {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 24의 약수를 구하시오
		Scanner sc = new Scanner(System.in);
		int iNum = 0;

//		System.out.print("정수를 입력하세요 >> ");
//		iNum = sc.nextInt();
//
//		System.out.printf("입력 받은 정수는 %d %n", iNum);
//		
//		for (int j = 1; j <= iNum; j++) {
//			for (int i = 1; i <= iNum; i++) {
//				if(i <= j)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			
//			System.out.println();
//		}
//
//		System.out.println();

//		iNum = 5;
//		
//		for (int j = 1; j <= iNum; j++) {
//			for (int i = 1; i <= iNum; i++) {
//				if (i <= j)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}

//		iNum = 5;
//
//		for (int j = 0; j < iNum; j++) {
//			for (int i = 0; i < iNum; i++) {
//				if (i < j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

//		iNum = 5;
//
//		for (int j = 1; j <= iNum; j++) {
//			for (int i = 1; i <= iNum; i++) {
//				if (i <= j)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
//
//		for (int j = 0; j < iNum; j++) {
//			for (int i = 0; i < iNum; i++) {
//				if (i < j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

		iNum = 5;
		int iHalf = 0;
		int iCntStar = 0;
		int i = 0, j = 0;

		if ((iNum % 2) == 0) {
			iNum = iNum - 1;
		}

		iHalf = iNum / 2 + 1;
		System.out.printf("Half = %d %n", iHalf);
		iCntStar = 0;

		for (j = 0; j < iHalf; j++) {
			System.out.print("|");

			// 2 : 0, (1,2,3) : 1, (0,1,2,3,4) : 4
			
			for (i = 0; i < iNum; i++) {
				if (i > iHalf - iCntStar) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.printf("| Cnt:%d, i:%d, j:%d, Half:%d", iCntStar, i, j, iHalf);


			System.out.println();

			iCntStar++;
		}

		sc.close();
		System.out.println("*** Finish ***");
	}

}
