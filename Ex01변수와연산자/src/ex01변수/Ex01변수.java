package ex01변수;

public class Ex01변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// 주석 - 아래의 코드가 무엇인지 설명을 해야할 때 사용.
		//       주석안에 작성된 내용은 컴퓨터가 번역(컴파일)을 하지 않고 넘어간다.
		// 한줄의 주석 = //
		// 여러줄의 주석 = /* */ 
		// 안내 - 코드를 실행하는 순간 무조건 위에서 아래로 실행이 된다.
		// Java의 실행과정
		// Ex01변수.java -> 컴파일 -> Ex01변수.class -> JVM -> 실행
		// Java 에서 문자열은 "" 안에 작성한다.
		
		System.out.println("Hello World!");
		System.out.println("문경수");
		
		// 출력문 자동완성 -> syso + Ctrl키 + 스페이스키
		System.out.println("자동완성 테스트");
		
		// 변수 - 데이터를 저장하는 임시적 공간
		// 변수를 만드는 방법
		// 자료형 변수명 대입연산자 값;
		// int a = 3;
		// 실습. 정수를 담을 수 있는 변수 num을 선언 후 100을 할당하기.\
		int num;
		num = 100;
		
		System.out.println(num);
		
		num = 50;
		System.out.println(num);
		
		// 변수의 특징
		// 1. 변수안에 새로운 값이 들어오게 된다면 이전에 값은 사라진다.
		// 2. 동일한 이름으로 변수를 만들 수 없다.
		
		// 문제. 
		int myMoney = 15000;
		int yourMoney = 90000000;
		
		/////////////////////////////////////////////////////////////////////////////////
		System.out.println("나의 금액 : " + myMoney);
		System.out.println("친구의 금액 : " + yourMoney);
		
		/////////////////////////////////////////////////////////////////////////////////
		// 여기에서 서로의 금액을 바꿔 주세요
		// 단. 이거는 안됩니다.
		// 1. 직접 데이터를 손으로 넣는 경우 
		// 2. 출력문을 건드리는 경우
		//////////////////////////////////////////////////////////////
		
		System.out.println("금액 바꾸기 *****");
		System.out.println("금액 바꾸기 *****");
		
		int tempMoney;
		
		tempMoney = myMoney;
		myMoney = yourMoney;
		yourMoney = tempMoney;
		
		/////////////////////////////////////////////////////////////////////////////////
		System.out.println("나의 금액 : " + myMoney);
		System.out.println("친구의 금액 : " + yourMoney);
		
		
	}

}
