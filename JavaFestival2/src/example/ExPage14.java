package example;

public class ExPage14 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		String strBinary;
		int[] arrBinary;
		int iDecimal = 0;

		strBinary = "01001101";
		arrBinary = BinaryToArray(strBinary);
		printArray(arrBinary);
		iDecimal = BinaryToDecimal(arrBinary);
		System.out.printf("%s (2) = %d(10) %n", strBinary, iDecimal);

		strBinary = "00101000";
		arrBinary = BinaryToArray(strBinary);
		printArray(arrBinary);
		iDecimal = BinaryToDecimal(arrBinary);
		System.out.printf("%s (2) = %d(10) %n", strBinary, iDecimal);

		System.out.println("*** Finish ***");
	}

	private static int BinaryToDecimal(int[] arrBinary) {
		int iDecimal = 0;
		int iPlaceVaule = 1;

		for (int i = arrBinary.length - 1; i >= 0; i--) {
			iDecimal += arrBinary[i] * iPlaceVaule;
			iPlaceVaule *= 2;
		}
		return iDecimal;
	}

	private static int[] BinaryToArray(String strBinary) {
		int[] arrInt = null;

		arrInt = new int[strBinary.length()];

		for (int i = 0; i < strBinary.length(); i++) {
			arrInt[i] = strBinary.charAt(i) - '0';
		}

		return arrInt;
	}

	private static void printArray(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}

}
