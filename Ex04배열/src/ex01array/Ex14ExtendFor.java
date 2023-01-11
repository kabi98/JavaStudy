package ex01array;

import java.util.Scanner;

public class Ex14ExtendFor {

	public static void main(String[] args) {
		// for-each 확장 for 문
		System.out.println("*** Start ***");

		int[] array = { 5, 7, 9, 4, 3, 1, 5, 6, 7, 8 };

		// 기존 방식
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();

		// for-each 확장 for 문
		// for(배열의 값을 꺼냈을때 변수 : 사용하고 싶은 배열) {}
		for (int num : array) {
			System.out.print(num + " ");

		}
		System.out.println();
		System.out.println("*** Finish ***");
	}

}
