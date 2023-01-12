package ex02TwoDim;

public class Ex03_2_ArrPrac {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int X_LEN = 4, Y_LEN = 7;
		final int START_NUM = 1;
		int iCount = 0, x = 0, y = 0;
		int[][] arrTwoDim = new int[X_LEN][Y_LEN];
		
		x=0;
		y=0;
		iCount = START_NUM;
		for (y = 0; y < arrTwoDim[x].length; y++) {
			for (x = arrTwoDim.length-1; x >= 0; x--) {
				arrTwoDim[x][y] = iCount;
				iCount++;
			}
			x = arrTwoDim.length-1;
		}

		x=0;
		y=0;
		for ( y = 0; y < arrTwoDim[x].length; y++) {
			for ( x = 0; x < arrTwoDim.length; x++) {
				System.out.printf("%2d ", arrTwoDim[x][y]);
			}
			x=0;
			System.out.println();
		}
		
		System.out.println("*** Finish ***");
	}

}
