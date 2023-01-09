package ex03for문;

public class Ex11Roop {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//		System.out.println("*** i % 2 == 1 ***");
//		for (int i = 1; i <= 10; i++) {
//			if ((i % 2) == 1)
//				System.out.println(i);
//
//		}
//		
//		System.out.println("*** i % 10 == 0 ***");
//		for (int i = 1; i <= 10; i++) {
//			if ((i % 10) == 0)
//				System.out.println(i);
//		}
//		
		int iDivisorSum = 0;
		int iCurNum = 0;
		int iLimitNum = 1000;
		
		System.out.println("*** 완전수 찾기 ***");
		System.out.printf("%d 까지의 수중에 완전수는 : ", iLimitNum);
		
		for(iCurNum = 2; iCurNum <= iLimitNum; iCurNum++)
		{
			iDivisorSum = 0;
			for (int i = 1; i <= iCurNum / 2; i++) {
				if ((iCurNum % i) == 0) {
					iDivisorSum += i;
				}
			}
			if(iDivisorSum == iCurNum)
			{
				System.out.printf(" %d ", iDivisorSum);
			}
		}
		
		System.out.println();
		System.out.println("*** Finish ***");
	}

}
