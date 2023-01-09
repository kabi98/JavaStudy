package ex02ifelse문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 키보드로 정수를 입력을 받아서
		//    60점 이상이면 "합격입니다" 출력
		//    60점 미만이면 "불합격입니다" 출력
		
		// 1. 키보드로 입력 받기.
		// 2. 60점 이상 구분 해서 합격, 불합격 출력하기.
		
		System.out.println("*** Start ***");
////////////////////////////////////////////////////////////////////////////

		int iGrade = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");

		iGrade = sc.nextInt();

		if (iGrade >= 60) {
			System.out.println("합격 입니다.");
		} else  {
			System.out.println("불합격 입니다.");
		}

		System.out.println("입력 받은 점수 : " + iGrade);

		sc.close();
////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");

	}

}
