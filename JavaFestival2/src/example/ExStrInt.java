package example;

public class ExStrInt {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		String strTest = "1234";
		int iTest = 4567;
		
		Integer.toBinaryString(iTest);
		System.out.printf("Integer.valueof(str) str:%s => int:%d %n", strTest, Integer.valueOf(strTest));
		System.out.printf("Integer.toBinaryString(int) str:%s %n", Integer.toBinaryString(iTest));
		
		System.out.println("*** Finish ***");
	}

}
