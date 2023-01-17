package ex01method;

public class Ex08_오버로딩 {

	public static void main(String[] args) {
		
		System.out.println(add(3,5));
		System.out.println(add(3.0,5.0));

	}
	
	private static int add(int num1, int num2) {
		return num1+num2;
	}

	private static double add(double num1, double num2) {
		return num1+num2;
	}
	
}
