package ex02연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iNum1 = 7;
		int iNum2 = 3;
		float fNum3 = (float) 7/3;
		double dNum4 = 3.0;
		
		System.out.println(iNum1 + iNum2);
		System.out.println(iNum1 - iNum2);
		System.out.println(iNum1 * iNum2);
		
		// 정수 / 정수 => 정수
		// 정수 / 실수, 실수 / 정수, 실수 / 실수 => 더 큰 데이터 타입인 실수로 결과가 나온다.
		System.out.println(iNum1 / iNum2);
		System.out.println(iNum1 % iNum2);

		System.out.println((float)(iNum1 / iNum2));
		System.out.println(fNum3);
		
		System.out.println(iNum1 / dNum4);
		
		// 문자열과 숫자를 더했을 때
		String strNum4 = "10";
		String strNum5 = "7";
		System.out.println(strNum4 + strNum5);
		System.out.println(strNum4 + 3 + 7 + 8);
		
		String strNum6 = 10 + (7 + "5");
		System.out.println(strNum6);
		
	}

}
