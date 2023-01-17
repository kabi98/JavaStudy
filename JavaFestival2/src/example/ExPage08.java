package example;

public class ExPage08 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int ARR_LEN = 5;
		int[][] arrOrigin = { 
				{  1,  2,  3,  4,  5 }, 
				{  6,  7,  8,  9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		int[][] arrRotate = new int[ARR_LEN][ARR_LEN];

		printTwoDimArray(arrOrigin);
		arrRotate = rotateArrayLeft(arrOrigin);
		
		System.out.println("");
		System.out.println("90도 회전");
		printTwoDimArray(arrRotate);

		System.out.println("*** Finish ***");
	}

	private static int[][] rotateArrayLeft(int[][] arrInt) {
		
		int [][] arrTemp = new int[arrInt.length][arrInt[0].length];
		int iColLen = arrInt[0].length;
		
		for(int i=0; i<arrInt.length; i++)
		{
			for(int j=0; j<arrInt[i].length; j++)
			{
				arrTemp[iColLen - 1 - j][i] = arrInt[i][j]; 
			}
		}
		
		return arrTemp;
	}

	private static void printTwoDimArray(int[][] arrInt) {

		for (int i = 0; i < arrInt.length; i++) {
			for (int j = 0; j < arrInt[i].length; j++) {
				System.out.printf(" %2d", arrInt[i][j]);
			}
			System.out.printf("%n");
		}
	}

}
