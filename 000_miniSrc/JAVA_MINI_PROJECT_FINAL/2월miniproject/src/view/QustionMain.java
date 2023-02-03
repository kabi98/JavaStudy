package view;

import java.util.ArrayList;
import java.util.Scanner;

import main.AsciiPrint;
import model.QuestionDAO;
import model.QuestionDTO;

public class QustionMain {
	static Scanner sc = new Scanner(System.in);
	AsciiPrint ap = new AsciiPrint();
	
	public void QuestionMain() {
		

		while (true) {

			System.out.print("[1] 문제입력 [2] 문제전체목록 [3] 문제수정 [4] 문제삭제 [5] 뒤로가기 >> ");
			int choice = sc.nextInt();
//			ap.printCat1();

			if (choice == 1) {
				QustionJoin();
			
			} else if (choice == 2) {
				QustionList();
				
			} else if (choice == 3) {
				QustionUpdate();
				
			} else if (choice == 4) {

				QustionDelect();

			} else if (choice == 5) {
				System.out.println("문제 입력 받기를 종료합니다!");
				System.out.println("==================");
				break;
			}

		}
	}
	public void QustionJoin() {

		String QuestionID, QScore, QLEVEL;
		
		System.out.print("ID 입력: ");
		QuestionID = sc.next();
		
		System.out.print("Score 입력: ");
		QScore = sc.next();
		
		System.out.print("LEVEL 입력: ");
		QLEVEL = sc.next();

		QuestionDAO dao = new QuestionDAO();

		int row = dao.Question(QuestionID, QScore, QLEVEL);
		if (row > 0) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
	}
	public  void QustionList() {
		QuestionDAO dao = new QuestionDAO();
		ArrayList<QuestionDTO> list = dao.SelectALL();

		System.out.printf("문제번호\t 배점\t 난이도\t");
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			QuestionDTO dto = list.get(i);
			System.out.print(dto.getQUESTIONID() + "\t");
			System.out.print(dto.getQSCORE() + "\t");
			System.out.print(dto.getQLEVEL() + "\t");
			System.out.println();
		}
	}
	public  void QustionUpdate() {
		System.out.println("=====점수 수정=====");
		System.out.print("ID 입력: ");
		String QuestionID = sc.next();

		System.out.print("수정할 점수 입력 : ");
		String updateQSCORE = sc.next();

		System.out.print("수정할 레벨 입력 : ");
		String updateQLEVEL = sc.next();

		QuestionDTO dto = new QuestionDTO(QuestionID, updateQSCORE, updateQLEVEL);

		QuestionDAO dao = new QuestionDAO();

		int row = dao.update(dto);

		if (row > 0) {
			System.out.println("회원정보 수정 완료");

		} else {
			System.out.println("회원 정보를 확인하세요.");
		}

		
	}
	public void QustionDelect() {

		System.out.print("ID 입력: ");
		String QuestionID = sc.next();

		System.out.print("SCORE 입력: ");
		String QScore = sc.next();

		QuestionDTO dto = new QuestionDTO();
		dto.setQUESTIONID(QuestionID);
		dto.setQSCORE(QScore);

		QuestionDAO dao = new QuestionDAO();
		int row = dao.delete(dto);

		if (row > 0) {
			System.out.println("정보 삭제");
		} else {
			System.out.println("회원 정보를 확인하세요.");
		}

	}
}
