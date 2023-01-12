package ex02TwoDim;

public class Ex04_2_DirectY {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		final int ROW_LEN = 5, COL_LEN = 7;
		final int START_NUM = 21;
		int iCount = 0, i = 0, j = 0;
		int[][] arrTwoDim = new int[ROW_LEN][COL_LEN];

		i = 0;
		j = 0;
		iCount = START_NUM;
		for (j = 0; j < arrTwoDim[i].length; j++) {
			for (i = 0; i < arrTwoDim.length; i++) {
				arrTwoDim[i][j] = iCount;
				iCount++;
			}
			i = 0;
		}

		for (int[] ii : arrTwoDim) {
			for (int jj : ii) {
				System.out.printf("%2d ", jj);
			}
			System.out.println();
		}
		
		System.out.println("*** Finish ***");
	}

}
