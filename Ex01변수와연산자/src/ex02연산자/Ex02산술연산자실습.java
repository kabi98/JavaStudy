package ex02연산자;

public class Ex02산술연산자실습 {

	public static void main(String[] args) {
		// 문제. 백의 자리 이하 숫자를 모두 버리세요.
		int iNum = 456;
		/////////////////////////////////////////////////////////////
		// 결과확인 : 400
		// 단 이건 안됩니다.
		// 1. num = 400;
		// 2. 출력문에 400을 쓰는 경우.
		
		// 1. 현재 백의 자리 이하 숫자 빼기
		/////////////////////////////////////////////////////////////
//		iNum = iNum - iNum % 100;
//		System.out.println("결과확인 : " + iNum);
		
		// 2. 100으로 나눈 몫 * 100
//		iNum = iNum / iNum * 100;
//		System.out.println("결과확인 : " + iNum);
		
		// 3. 100으로 나눈 몫 + "00"
		System.out.println("결과확인 : " + iNum / 100 + "00");
		
		
/*		
		System.out.println("iNum : " + iNum);
		
		int iHundread;
		
		iHundread = iNum / 100;
		System.out.println("iHundread : " + iHundread);
		
		iNum = iHundread * 100;
*/		
		/////////////////////////////////////////////////////////////
		System.out.println("결과확인 : " + iNum);

	}

}
