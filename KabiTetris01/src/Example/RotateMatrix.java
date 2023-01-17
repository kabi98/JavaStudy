package Example;

import java.util.Arrays;


public class RotateMatrix {

	public static void main(String[] args) {
		int[][] mat =
		{
			{ 1, 2, 3, 4 },
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 },
			{ 13, 14, 15, 16 }
		};

		print_mat(mat);
		
		rotate_mat(mat);
		
		print_mat(mat);

		Shape[] shapes = new Shape[7];
		
		shapes[0] = new Shape(new int[][]{ {1, 1, 1, 1} } );   // I shape;
		shapes[0].printShape();
		shapes[0].rotateShape();
		shapes[0].printShape();
		
		shapes[1] = new Shape(new int[][]{	{1, 1, 1},
											{0, 1, 0} } );
		
		shapes[1].printShape();
		shapes[1].rotateShape();
		shapes[1].printShape();
	}
	
	public static void print_mat(int[][] mat) {
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++)
			{
				System.out.printf("%2d ", mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
//		for (var r: mat) {
//			System.out.println(Arrays.toString(r));
//		}
//		System.out.println();
	}
	
	// In-place rotate it by 90 degrees in a clockwise direction
	public static void rotate_mat(int[][] mat)
	{
		// base case
		if (mat == null || mat.length == 0) {
			return;
		}

		// `N × N` matrix
		int N = mat.length;

		// Transpose the matrix
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < i; j++)
			{
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
//		print_mat(mat);

		// swap columns
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N / 2; j++)
			{
				int temp = mat[i][j];
				mat[i][j] = mat[i][N - j - 1];
				mat[i][N - j - 1] = temp;
			}
		}
		
//		print_mat(mat);
		
	}

	
	
	
	
	



	
	
	
	

}
