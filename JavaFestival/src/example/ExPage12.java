package example;

public class ExPage12 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		int num1 = 0;
		int num2 = 0; 
		boolean result = false;
		
		num1 = 10;
		num2 = 2;
		result = isDivide(num1, num2);
		
		System.out.printf("num1 : %d, num2 : %d %n", num1, num2);
		System.out.println("결과 확인 : " + result);
		
		num1 = 10;;
		num2 = 3;
		result = isDivide(num1, num2);
		
		System.out.printf("num1 : %d, num2 : %d %n", num1, num2);
		System.out.println("결과 확인 : " + result);
		
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

	public static boolean isDivide(int iNumerator, int iDenominator) {
		if (iNumerator % iDenominator == 0) {
			return true;
		} else {
			return false;
		}
	}

}
