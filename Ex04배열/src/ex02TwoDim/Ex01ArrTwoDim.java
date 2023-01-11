package ex02TwoDim;

import java.lang.reflect.Array;

public class Ex01ArrTwoDim {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		int[][] arrTwoDim = new int[3][3];
		
		for(int j = 0; j<3; j++)
		{
			for(int i = 0; i<3; i++)
			{
				arrTwoDim[j][i] = i*10 + j*30;
			}
		}
		
		for(int j = 0; j<3; j++)
		{
			for(int i = 0; i<3; i++)
			{
				System.out.printf("%d ", arrTwoDim[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("행의 길이 : " + arrTwoDim.length);
		System.out.println("0열의 길이 : " + arrTwoDim[0].length);
		
		System.out.println("*** Finish ***");
	}

}
