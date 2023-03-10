package ex01변수;

public class Ex03변수의특징과형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수명 규칙
		// 1. 변수명을 지을때는 되도록이면 의미가 있는 이름으로 지을 것
		// 2. Java에서는 변수명에 키워드를 사용할 수 없다.( 예: abstract, for, if 등)
		// 3. Java는 변수명에 대소문자를 구분되며 변수명의 길이는 제한이 없다.
		// 4. 변수명의 숫자로 시작할 수 없다.
		// 5. 특수문자는 '_' 와 '$'만 허용된다.
		
		String name_age = "문경수///";
		String 이름 = "문경수";

		int Num1 = 10;
		int num1 = 100;

		// 형변환 - 자료형태를 변환하는 것
		// byte (1byte) -> int (4byte)
		// 작은 자료형에서 큰 자료형으로 데이터를 담을때는 이상없이 담을 수 있다.
		// 이것으로 자동(묵시적) 형변환이라고 부른다.
		
		byte byteAge1 = 100;
		int intAge2 = byteAge1;
		
		// int(4byte) -> byte(1byte)
		// 큰 자료형에서 작은 자료형으로 데이터를 담을때는 데이터가 누출되는 (오버플로우)
		// 현상이 발생할수 있다. 작은 자료형으로 변환하기 위해서는 강제로 데이터 타입을 명시해야 함.
		// 이것을 강제(명시적)형변환 이라고 부른다.
		byte byteAge3 = (byte)intAge2;
		byte byteAge4 = byteAge1;
		
		int intNum7 = 537;
		byte byteNum8 = (byte)intNum7;
		System.out.println(byteNum8);
		
		// 정수와 실수의 형변환
		// 같은 크기의 정수와 실수형 변수가 있다면
		// 정수 -> 실수로 자동(묵시적)형 변환이 일어나고
		// 실수 -> 정수로 변환하기 위해서는 강제(명시적)형변환을 해야한다.
		// 이 과정 중에 실수의 소수점은 사라지게 된다. 
		int intNum9 = 100;
		float floatNum10 = intNum9;
		
		float floatNum11 = 3.14F;
		int intNum12 = (int)floatNum11;
		
		System.out.println(intNum12);
		
		
		
		
		
		

	}

}
