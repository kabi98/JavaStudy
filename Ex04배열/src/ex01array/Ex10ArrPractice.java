package ex01array;

import java.util.Random;
import java.util.Scanner;

public class Ex10ArrPractice {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		// 아침, 점심, 저녁 메뉴 랜덤 뽑기

		// 선언 및 초기화
		final int BREAKFAST = 1, LUNCH = 2, DINNER = 3, FINISH = 4;
		
		String[] arrBreakfast = { "삼선짬뽕", "간짜장", "떡국", "짜계치", "햄버거" };
		String[] arrLunch = { "강된장비빔밥&제육볶음", "간장게장", "순두부찌개", "회덥밥&튀김", "돈까스&쫄면" };
		String[] arrDinner = { "삼겹살구이", "회", "초밥", "족발&보쌈", "소고기" };
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int iChoice = 0;
		int iRandom = 0;

		// 입력부
		
		// 처리부
		while(true) {
			System.out.println("식사를 선택해주세요.");
			System.out.print("1. 아침 2. 점심 3. 저녁 4. 종료>> ");
			iChoice = sc.nextInt();
			
			if(iChoice == BREAKFAST) {
				System.out.println("=== 오늘의 추천 아침 메뉴 ===");
				iRandom = r.nextInt(arrBreakfast.length);
				System.out.printf("%s  %n", arrBreakfast[iRandom]);
			}
			else if(iChoice == LUNCH) {
				System.out.println("=== 오늘의 추천 점심 메뉴 ===");
				iRandom = r.nextInt(arrLunch.length);
				System.out.printf("%s  %n", arrLunch[iRandom]);
			}
			else if(iChoice == DINNER) {
				System.out.println("=== 오늘의 추천 저녁 메뉴 ===");
				iRandom = r.nextInt(arrDinner.length);
				System.out.printf("%s  %n", arrDinner[iRandom]);
			}
			else if(iChoice == FINISH) {
				System.out.println("프로그램을 종료합니다....");
				break;
			}
			else {
				System.out.println("정확한 숫자를 입력하세요.");
			}
		}

		sc.close();
		System.out.println("*** Finish ***");
	}

}
