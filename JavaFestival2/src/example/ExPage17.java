package example;

public class ExPage17 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		int iResult = 0, iInput = 0;

		iInput = 10;
		iResult = getFactorial(iInput);
		System.out.printf("%d : Factorial => %d %n", iInput, iResult);

		iInput = 3;
		iResult = getFactorial(iInput);
		System.out.printf("%d : Factorial => %d %n", iInput, iResult);

		iInput = 4;
		iResult = getFactorial(iInput);
		System.out.printf("%d : Factorial => %d %n", iInput, iResult);
		
		System.out.println("*** Finish ***");

	}

	private static int getFactorial(int iInput) {

		int iFact = 1;
		for (int i = 2; i <= iInput; i++) {
			iFact *= i;
		}

		return iFact;
	}

}
