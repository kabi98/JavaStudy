package ex01method;

import java.util.Random;

public class Ex02_VarMethod {

	public static void main(String[] args) {
		System.out.println("*** Start Main***");
		
		// 다양한 메소트 만들기
		// 1.매개변수 O, 리턴 O - 주스 만들기.
		// 2.매개변수 O, 리턴 X - 옷 정리하기
		// 3.매개변수 X, 리턴 O - 랜덤 과자 얻기
		// 4.매개변수 X, 리턴 X - 다양한 인사
		
		System.out.println(makeJuice("사과"));
		System.out.println(makeJuice("딸기"));
		
		arrageClothes("맨투맨 티");
		arrageClothes("청바지");
		
		System.out.println("오늘의 간식은 ? " + getRandomSnack());
		System.out.println("오늘의 간식은 ? " + getRandomSnack());
		System.out.println("오늘의 간식은 ? " + getRandomSnack());
		System.out.println("오늘의 간식은 ? " + getRandomSnack());
		
		doHello();
		doHello();
		doHello();
		doHello();
		
		System.out.println("*** Finish Main***");
	}

	public static String makeJuice(String strFruit) {
		String strJuice = "";
		
		strJuice = String.format("맛있는 %s 주스 입니다.!!", strFruit); 
		return strJuice;
	}
	
	public static void arrageClothes(String strGoods) {
		System.out.printf("받아온 %s를 잘 정리하겠습니다!!! 삐빅...%n", 
				strGoods);
		return ;
	}
	
	public static String getRandomSnack() {
		String[] arrSnacks = {"오레오", "빅파이", "마가렛트", "초콜렛", "신호등"} ;
		
		Random r = new Random();
		String strRandom = arrSnacks[r.nextInt(arrSnacks.length)];
		
		return strRandom;
	}
	public static void doHello() {
		String[] arrHello = {"니하오마", "곤니찌와", "굿모닝", "봉쥬르", "앗사람말라이쿰"} ;
		
		Random r = new Random();
		
		System.out.println(arrHello[r.nextInt(arrHello.length)]);
		return ;
	}
}
