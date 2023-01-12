package ex02TwoDim;

public class Ex05_Zigzag {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		final int ROW_LEN = 9, COL_LEN = 7;
		final int START_NUM = 21;
		int iCount = 0;
		int[][] arrTwoDim = new int[ROW_LEN][COL_LEN];

		iCount = START_NUM;
		for (int i = 0; i < arrTwoDim.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arrTwoDim[i].length; j++) {
					arrTwoDim[i][j] = iCount;
					iCount++;
				}
			} else {
				for (int j = arrTwoDim[i].length - 1; j >= 0; j--) {
					arrTwoDim[i][j] = iCount;
					iCount++;
				}
			}
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
