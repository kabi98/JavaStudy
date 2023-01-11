package example;

public class ExPage14 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		String strTest = "";

		strTest = "power";
		System.out.printf("Input : %s,  Result : %s %n", strTest, getMiddle(strTest));

		strTest = "test";
		System.out.printf("Input : %s,  Result : %s %n", strTest, getMiddle(strTest));

//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

	public static String getMiddle(String strInput) {
		char[] arrMid = new char[2];
		String strMiddle = "";
		int iMid = 0;

		iMid = strInput.length() / 2;

		if (strInput.length() % 2 == 1) {
			arrMid[0] = strInput.charAt(iMid);
		} else {
			arrMid[0] = strInput.charAt(iMid - 1);
			arrMid[1] = strInput.charAt(iMid);
		}
		strMiddle = String.valueOf(arrMid);
		return strMiddle;
	}

}
