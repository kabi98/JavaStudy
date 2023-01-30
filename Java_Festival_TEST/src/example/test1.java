package example;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Start ***");
		int num1 = 10;
		int num2 = 2;
		
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);
		
		
		num1 = 10;
		num2 = 3;
		result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);
		
		System.out.println("*** finish ***");
	}

	private static boolean isDivide(int num1, int num2) {
		if((num1 % num2) == 0 )
			return true;
		else
			return false;
	}

}
