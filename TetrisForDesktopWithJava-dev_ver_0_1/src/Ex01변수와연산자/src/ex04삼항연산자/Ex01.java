package ex04삼항연산자;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("삼항연산자");
		// 삼항연산자 구조
		// 조건식 ? 실행문1(참): 실행문2(거짓);
		// 1. 정수형 num 숫자 2 넣기
		// 2. num 숫자가 짝수인지 홀수인지 판별
		
		int iNum = 2;
		boolean bIsEven = true;
		String strResult = "";
		
		strResult = iNum % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(iNum + " : " + strResult);
		
		iNum++;
		strResult = iNum % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(iNum + " : " + strResult);

		bIsEven = iNum % 2 == 0 ? true : false;
		System.out.println(iNum + " : " + bIsEven);
		
		iNum++;
		bIsEven = iNum % 2 == 0 ? true : false;
		System.out.println(iNum + " : " + bIsEven);
	}

}
