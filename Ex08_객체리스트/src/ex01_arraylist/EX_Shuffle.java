package ex01_arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EX_Shuffle {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		Integer[] array = {1, 2, 3, 4, 5, 6, 7};
		List<Integer> list = Arrays.asList(array); 
		
		printArray(array);
		
		Collections.shuffle(list);
		
		printArray(array);
		
		Collections.shuffle(Arrays.asList(array));
		
		printArray(array);
		

		System.out.println("*** Finish ***");
	}
	
	private static void printArray(Integer[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}

}
