package ex02연산자;

import java.util.Scanner;

public class Ex03산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 초를 입력받아 시, 분, 초 형태로 출력
		// 예시)
		// 초 입력 : 3723
		// 1시 2분 3초
		
		// 키보드로부터 데이터를 입력받기(Scanner)
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int iTotalSecond = sc.nextInt();
		
////////////////////////////////////////////////////////////////////
		int iHour, iMin, iSecond, iHourRemain;
		
		iHour = iTotalSecond / 3600;
		iHourRemain = iTotalSecond % 3600;
		iMin = iHourRemain / 60;
		iSecond = iHourRemain % 60;
		
//		System.out.println("iRemain = " + iHourRemain);
//		System.out.println("iHour = " + iHour);
//		System.out.println("iMin = " + iMin);
//		System.out.println("iSecond = " + iSecond);

////////////////////////////////////////////////////////////////////
		
		System.out.println("입력한 초 : " + iTotalSecond);
		System.out.println(iHour + "시간 " + iMin+"분 " + iSecond+"초 입니다.");
		
		sc.close();
		
	}

}
