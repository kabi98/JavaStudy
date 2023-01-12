package ex02TwoDim;

public class Ex06_ArrCreate {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		// 이차원 배열을 만드는 방법
		// 2 X 2 크기의 정수형 배열 만들기 값은 1,2,3,4 가 들어간다.
		
		int [][] array1 = new int[2][2];
		
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[1][0] = 3;
		array1[1][1] = 4;
		
		// 값을 넣음과 동시에 길이를 정하는 방법
		int [][] array2 = {{1, 2}, {3,4}};
		
		for(int i = 0; i<array1.length; i++)
		{
			for(int j = 0; j<array1[i].length; j++)
			{
				System.out.printf("%d ", array1[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i<array2.length; i++)
		{
			for(int j = 0; j<array2[i].length; j++)
			{
				System.out.printf("%d ", array2[i][j]);
			}
			System.out.println();
		}
		
		
		
//		final int ROW_LEN = 5, COL_LEN = 5;
//		final int START_NUM = 21;
//		int iCount = 0;
//		int[][] arrTwoDim = new int[ROW_LEN][COL_LEN];
//
//		iCount = START_NUM;
//		for (int i = 0; i < arrTwoDim.length; i++) {
//			if (i % 2 == 0) {
//				for (int j = 0; j < arrTwoDim[i].length; j++) {
//					arrTwoDim[i][j] = iCount;
//					iCount++;
//				}
//			} else {
//				for (int j = arrTwoDim[i].length - 1; j >= 0; j--) {
//					arrTwoDim[i][j] = iCount;
//					iCount++;
//				}
//			}
//		}
//
//		for (int[] ii : arrTwoDim) {
//			for (int jj : ii) {
//				System.out.printf("%2d ", jj);
//			}
//			System.out.println();
//		}
//
		System.out.println("*** Finish ***");
	}

}
