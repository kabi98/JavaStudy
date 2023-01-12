package ex02TwoDim;

public class Ex03_InverseInputAndPrint {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int ROW_NUM = 5, COL_NUM = 5;
		final int START_NUM = 21;
		int iCount = 0;
		int[][] arrTwoDim = new int[ROW_NUM][COL_NUM];
		
		int x=0;
		int y=0;
		iCount = START_NUM;
		for (y = 0; y < arrTwoDim[x].length; y++) {
			for (x = arrTwoDim.length-1; x >= 0; x--) {
				arrTwoDim[x][y] = iCount;
				iCount++;
			}
			x = arrTwoDim.length-1;
		}

		for ( y = 0; y < arrTwoDim.length; y++) {
			for ( x = 0; x < arrTwoDim[y].length; x++) {
				System.out.printf("%2d ", arrTwoDim[x][y]);
			}
			System.out.println();
		}
		
		System.out.println("*** Finish ***");
	}

}
