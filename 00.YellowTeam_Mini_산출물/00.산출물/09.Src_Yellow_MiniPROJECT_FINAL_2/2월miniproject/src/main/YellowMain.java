package main;

import java.util.Scanner;

import view.QustionMain;
import view.ScoreListMain;
import view.StudentMain;
import view.TryResultMain;
import view.ViewMain;

public class YellowMain {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AsciiPrint ap = new AsciiPrint();
		
		
		System.out.println("|| YELLOW TEAM MINIPROJECT!");
		System.out.println("|| WELLCOM to menager to javaproject!");
		
		ap.printMenu();

		while (true) {

			System.out.print("[1] 학생관리 [2] 문제등록 [3] 결과등록 [4]점수조회 [5] 통계조회 [6] 종료  >> ");
			int scanInt = sc.nextInt();
			
			if (scanInt == 1) {
				ap.printCat1();
				StudentMain stu = new StudentMain();
				stu.StudentMain();
			} else if (scanInt == 2) {
				ap.printCat2();
				QustionMain qus = new QustionMain();
				qus.QuestionMain();
			} else if (scanInt == 3) {
				ap.printHandBear();
				TryResultMain.TryResultMain();

			} else if (scanInt == 4) {
				ap.printBear();
				ScoreListMain score = new ScoreListMain();
				score.ScoreListMain();

			} else if (scanInt == 5) {
				ap.printBedBear();
				ViewMain view = new ViewMain();
				view.ViewMain();

			} else if (scanInt == 6) {
				ap.printBlueBear();
				System.out.println();
				break;
			}
		}

	}
}
