package ex01_arraylist;

import java.util.ArrayList;

public class Ex03_복습 {
	
	public static void main(String[] args) {
		System.out.println("*** Start ****");
		
		
		int[] array = new int[] {1,2,3};
		int[] array2 = {1,2,3};
		
		String name = new String("나예호");
		String name2 = "나예호";
		
		ArrayList<String> musicList = new ArrayList<>();
		
		musicList.add("Hype boy");
		musicList.add("안티프레즐");
		musicList.add("사건의 지평선");
		musicList.add("Love Dive");
		musicList.add("When I Move");
		
		for(int i=0; i< musicList.size(); i++) {
			System.out.println(musicList.get(i));
		}
		
		;
		System.out.println(musicList.toString());
		
		System.out.println(musicList.get(0).contains("b"));
		
//		musicList.remove(3);
//		musicList.clear();
//		
//		for(int i=0; i< musicList.size(); i++) {
//			System.out.println(musicList.get(i));
//		}
		
		System.out.println("*** Finish ****");
			
	}

}
