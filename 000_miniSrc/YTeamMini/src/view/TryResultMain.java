package view;

import java.util.Scanner;

import model.Try_Result_DAO;
import model.Try_Result_DTO;

public class TryResultMain {

	public static void TryResultMain() {
		// TODO Auto-generated method stub
		Try_Result_DAO tdao = new Try_Result_DAO();

		Scanner sc = new Scanner(System.in);

		System.out.print("학생 아이디 입력 >> ");
		String StuId = sc.next();

		
		
		if(tdao.notNum(StuId)==false) {
			System.out.println("입력하신 학생 ID가 없습니다!");
			System.out.println("학생 ID 등록으로 넘어갑니다!");
		    StudentMain stu= new StudentMain();
			stu.StudentJoin();
		}

		
		///////////////////////
		
		System.out.print("문제 번호 입력 >> ");
		String QueId = sc.next();
		
		///////////////////////
		if(tdao.notNum2(QueId)==false) {
			System.out.println("입력하신 문제번호가 없습니다!");
			System.out.println("문제 등록으로 넘어갑니다!");
			QustionMain qus= new QustionMain();
		     qus.QustionJoin();
		}

		
		
		///////////////////////
		

		System.out.print("성공여부 입력(O,X) >> ");
		String isSuccess = sc.next();

		System.out.print("획득 점수를 입력 >>  ");
		int getScore = sc.nextInt();

		
		
		
		Try_Result_DTO tdto = new Try_Result_DTO(StuId, QueId, isSuccess, getScore); // 이렇게 담아줘도 set으로 담기나봄

		int row = tdao.Tryreult(tdto);


		if (row > 0) { // 행이 0이 아니면 회원가입이 된거니까 (행이 1로 채워진거니까)
			System.out.println("결과등록 성공");
		} else {
			System.out.println("결과등록 실패");
		}

	}

}

