package ex02연산자;

import java.util.Scanner;

public class Ex04산술연산자숙제 {

	public static void main(String[] args) {
		// Java, Web, Android 점수를 키보드로 부터 입력 받아 합계와 평균을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int iJava = 0, iWeb = 0, iAndroid = 0, iSum = 0;
		double dAverage = 0.;
		
		System.out.print("Java 점수 입력 : ");
		iJava = sc.nextInt();
		System.out.print("Web 점수 입력 : ");
		iWeb = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		iAndroid = sc.nextInt();

		System.out.println(" Java : " + iJava + " Web : " + iWeb + " Android : " + iAndroid );
		
		iSum = iJava + iWeb + iAndroid;
		dAverage = iSum / 3.0;
		
		System.out.println(" 합계 : " + iSum + " 평균 : " + dAverage );
		
		sc.close();

	}

}
