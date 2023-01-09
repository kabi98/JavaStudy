package ex01while문;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		final String LOGIN_ID = "hodoodady", LOGIN_PW = "1234";
		String strId = "", strPw = "";

		while (true) {
			System.out.println("************** 로그인 프로그램 **************");
			System.out.print("아이디 입력 : ");
			strId = sc.next();

			System.out.print("비밀번호 입력 : ");
			strPw = sc.next();

			System.out.println("input id = " + strId + ", pw = " + strPw);

			if (LOGIN_ID.equals(strId) && LOGIN_PW.equals(strPw)) {
				System.out.println("로그인 성공 !!!");
				break;
			} else {
				System.out.println("로그인 실패 .....");
			}
		}
		sc.close();
//////////////////////////////////////////////////////////////////////////////////		
		System.out.println("*** Finish ***");
	}

}
