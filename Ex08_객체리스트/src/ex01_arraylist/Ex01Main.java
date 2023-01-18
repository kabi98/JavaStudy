package ex01_arraylist;

import java.util.ArrayList;

public class Ex01Main {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		ArrayList<String> listString = new ArrayList<>();
//		ArrayList<Integer> listTemp = new ArrayList<>();

//		listString.add("닭도리탕");
//		listString.add("허니콤보");
//		listString.add("떡볶이");
//
//		System.out.println(listString.toString());
//
//		listString.add(0, "소곱창");
//		System.out.println(listString.toString());
//
//		for (int i = 0; i < listString.size(); i++) {
//			System.out.println(listString.get(i));
//		}
//		
//		String strRemove = listString.remove(2);
//		
//		System.out.printf("strRemove : %s %n", strRemove);
//		
//		System.out.println(listString.toString());
//		
//		listString.clear();
//		
//		System.out.println(listString.toString());
		
		
		Person PsOne = new Person("문경수", 49);
		
		PsOne.getAge();
		

		System.out.println("*** Finish ***");
	}

}
