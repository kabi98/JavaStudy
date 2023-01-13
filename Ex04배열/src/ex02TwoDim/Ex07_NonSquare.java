package ex02TwoDim;

import java.util.Arrays;

public class Ex07_NonSquare {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//		int [][] arrTwo = null;
//		
//		int iN = 5;
//		int iCnt = 0;
//		arrTwo = new int[5][];
//		
//		for(int i = 0; i<iN; i++)
//		{
//			arrTwo[i] = new int [iN];
//		}
//		
//		for (int i = 0; i < arrTwo.length; i++) {
//			for (int j = 0; j < arrTwo[i].length; j++) {
//				arrTwo[i][j] = iCnt++;
//				
//			}
//		}
//		
//		for (int i = 0; i < arrTwo.length; i++) {
//			for (int j = 0; j < arrTwo[i].length; j++) {
//				System.out.printf("%2d ", arrTwo[i][j]);
//			}
//			System.out.println();
//		}
		
		// 0열의 길이는 3, 1열의 길이는 2, 2열의 길이 5
		
		int [][] arrNonSquare = new int[3][];
		int iCount = 0;
		
		arrNonSquare[0] = new int[3];
		arrNonSquare[1] = new int[2];
		arrNonSquare[2] = new int[5];

		iCount = 1;
		for (int i = 0; i < arrNonSquare.length; i++) {
			for (int j = 0; j < arrNonSquare[i].length; j++) {
				arrNonSquare[i][j] = iCount ++;
			}
		}
		
		for (int i = 0; i < arrNonSquare.length; i++) {
			for (int j = 0; j < arrNonSquare[i].length; j++) {
				System.out.printf("%2d ", arrNonSquare[i][j]);
			}
			System.out.println();
		}
		
		// for 문을 사용하지 않고 배열의 값을 확인하는 방법.
		String[] strTeam = {"문경수","윤상재","장이수","구소현","남하은"};
		
		String strResult = Arrays.toString(strTeam);
		
		System.out.println(strResult);
		
		strResult = Arrays.toString(arrNonSquare[0]);
		System.out.println(strResult);
		strResult = Arrays.toString(arrNonSquare[1]);
		System.out.println(strResult);
		strResult = Arrays.toString(arrNonSquare[2]);
		System.out.println(strResult);

		System.out.println("*** Finish ***");	}

}
