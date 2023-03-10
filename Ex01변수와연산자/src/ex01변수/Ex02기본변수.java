package ex01변수;

public class Ex02기본변수 {
	
	
	public static void main(String[] args) {
		// Java의 자료형
		// 1. 기본타입 (Primitive, Basic)
		
		// 정수타입 (byte, short, int, long)
		// byte - 8bit, 1byte, 256 (-128 ~ 127)
		byte  num1 = 127;
		
		// short - 2byte, 16bit, 
		short  num2 = 11111;
		
		
		// int - 4byte, 32bit
		int  num3 = 12345678;
		
		// long - 8byte, 64bit
		long  num4 = 3000000000L;
		
		// 실수타입 (float, double)
		// float = 4byte, 32bit
		float num5 = (float)3.14;
		float num6 = 3.14f;
		
		// double = 8byte, 64bit
		double num7 = 1.141592;
		
		// 논리형 (boolean)
		// boolean = 1byte, 8bit
		boolean isCheck1 = true;
		boolean isCheck2 = false;
		
		// 문자형(숫자형) - char
		// char - 2byte, 16bit
		// 문자와 문자열의 차이
		// 문자 : 한글자만 해당
		// 문자열 : 한글자 포함 두글자이상의 글자
		char text = '가' + 157;
		System.out.println(text);

		// 기본자료형은 아니지만 문자열을 담을 수 있는 변수
		String name = "문경수";
		System.out.println(name);
		
		
		
		// 2. 참조타입 (Reference) - 추후
	}

}
