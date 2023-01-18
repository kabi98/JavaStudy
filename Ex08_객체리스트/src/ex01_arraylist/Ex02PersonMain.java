package ex01_arraylist;

import java.util.ArrayList;

public class Ex02PersonMain {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		ArrayList<Person> pList = new ArrayList<>();

		pList.add(new Person("문경수", 49));
		pList.add(new Person("윤상재", 23));
		pList.add(new Person("구소현", 26));
		pList.add(new Person("남하은", 26));
		pList.add(new Person("장이수", 35));

//		System.out.printf("%d %n", pList.size());

		for (int i = 0; i < pList.size(); i++) {
			System.out.printf("%d : %s, %d %n", 
					i, pList.get(i).getName(), pList.get(i).getAge());
		}

		for (Person psIter : pList) {
			System.out.printf(" %s, %d %n", psIter.getName(), psIter.getAge());
		}

		System.out.println("*** Finish ***");

	}

}
