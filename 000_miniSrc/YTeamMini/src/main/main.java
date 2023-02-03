package main;

import java.util.Scanner;

import view.QustionMain;
import view.ScoreListMain;
import view.StudentMain;
import view.TryResultMain;
import view.ViewMain;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("|| YELLOW TEAM MINIPROJECT!");
		System.out.println("|| WELLCOM to meneger to javaproject!");
		
		
		while(true) {
			System.out.print("SELECT MENU : 1] 학생관리 2]문제등록 3]결과등록 4]점수조회 5]통계조회 6]종료  >>");
			int scanInt = sc.nextInt();
			if(scanInt == 1) {
				StudentMain stu = new StudentMain();
				stu.StudentMain();
			} else if(scanInt ==2) {
				QustionMain qus = new QustionMain();
				qus.QustionMain();
			} else if(scanInt ==3) {
				TryResultMain.TryResultMain();
				
			} else if(scanInt ==4){
				ScoreListMain score = new ScoreListMain();
				score.ScoreListMain();
				
			} else if(scanInt ==5) {
				ViewMain view = new ViewMain();
				view.ViewMain();
				
			}else if(scanInt ==6) {
				System.out.println();
				break;
			}
		}
		
		
		
		
	}
}
