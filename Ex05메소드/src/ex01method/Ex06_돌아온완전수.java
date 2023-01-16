package ex01method;

public class Ex06_돌아온완전수 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		int startValue = 2;
		int endValue = 10000;
		
		getPerfectNumber(startValue, endValue);
		System.out.println("*** Finish ***");
	}

	public static void getPerfectNumber(int startValue, int endValue) {

		System.out.printf("%d~%d까지의 완전수 : ", startValue, endValue);
		
		int iDivisorSum = 0;
		
		for(int iCurNum = startValue; iCurNum<=endValue; iCurNum++)
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
	}
	
}
