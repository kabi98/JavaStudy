package ex02TwoDim;

public class Ex02_01to25 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int ROW_NUM = 5, COL_NUM = 5;
		int[][] arrTwoDim = new int[ROW_NUM][COL_NUM];
		
		for(int j = 0; j<arrTwoDim.length; j++)
		{
			for(int i = 0; i<arrTwoDim[j].length; i++)
			{
				arrTwoDim[j][i] = i+1 + j*ROW_NUM;
			}
		}
		
		for(int j = 0; j<arrTwoDim.length; j++)
		{
			for(int i = 0; i<arrTwoDim[j].length; i++)
			{
				System.out.printf("%2d ", arrTwoDim[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("행의 길이 : " + arrTwoDim.length);
		System.out.println("0열의 길이 : " + arrTwoDim[0].length);
		System.out.println("*** Finish ***");
	}

}
