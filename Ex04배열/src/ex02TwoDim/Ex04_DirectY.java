package ex02TwoDim;

public class Ex04_DirectY {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int X_LEN = 5, Y_LEN = 5;
		final int START_NUM = 21;
		int iCount = 0, x = 0, y = 0;
		int[][] arrTwoDim = new int[X_LEN][Y_LEN];

		x = 0;
		y = 0;
		iCount = START_NUM;
		for (x = 0; x < arrTwoDim.length; x++) {
			for (y = 0; y < arrTwoDim[x].length; y++) {
				arrTwoDim[x][y] = iCount;
				iCount++;
			}
			y = 0;
		}

		x = 0;
		y = 0;
		for (y = 0; y < arrTwoDim[x].length; y++) {
			for (x = 0; x < arrTwoDim.length; x++) {
				System.out.printf("%2d ", arrTwoDim[x][y]);
			}
			x = 0;
			System.out.println();
		}
		
		System.out.println("*** Finish ***");
	}

}
