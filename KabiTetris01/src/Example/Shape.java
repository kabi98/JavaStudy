package Example;


public class Shape {
	
	private int[][] coords;
	private int x, y; 
	private int[][] board = new int[20][10];
	
	Shape(int[][] coords)
	{
		this.coords = coords;
		x = 0;
		y = 0;
	}

	public void printShape() {
		
		for(int i=0; i<coords.length; i++)
		{
			for(int j=0; j<coords[i].length; j++)
			{
				System.out.printf("%2d ", coords[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public void printShape(int[][] coords) {
		
		for(int i=0; i<coords.length; i++)
		{
			for(int j=0; j<coords[i].length; j++)
			{
				System.out.printf("%2d ", coords[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	
	public void rotateShape()
	{
		
		int[][] rotatedShape = null;
		
		rotatedShape = transposeMatrix(coords);
		
//		printShape(rotatedShape);
		
		rotatedShape = reverseRows(rotatedShape);
		
//		if((x + rotatedShape[0].length > 10) || (y + rotatedShape.length > 20))
//		{
//			return;
//		}
//		
//		for(int row = 0; row < rotatedShape.length; row++)
//		{
//			for(int col = 0; col < rotatedShape[row].length; col ++)
//			{
//				if(rotatedShape[row][col] != 0)
//				{
//					if(board[y + row][x + col] != 0)
//					{
//						return;
//					}
//				}
//			}
//		}
		coords = rotatedShape;
	}


	private int[][] transposeMatrix(int[][] matrix){
	    int[][] temp = new int[matrix[0].length][matrix.length];
	    for (int i = 0; i < matrix.length; i++)
	        for (int j = 0; j < matrix[0].length; j++)
	            temp[j][i] = matrix[i][j];
	    return temp;
	}



	private int[][] reverseRows(int[][] matrix){
		
		int middle = matrix.length/2;
		
		
		for(int i = 0; i < middle; i++)
		{
			int[] temp = matrix[i];
			
			matrix[i] = matrix[matrix.length - i - 1];
			matrix[matrix.length - i - 1] = temp;
		}
		
		return matrix;
		
	}
	
//	public Shape(int[][] coords, BufferedImage block, Board board, int color){
//
//	shapes[0] = new Shape(new int[][]{
//		{1, 1, 1, 1}   // I shape;
//	}, blocks.getSubimage(0, 0, blockSize, blockSize), this, 1);
//	
//	shapes[1] = new Shape(new int[][]{
//		{1, 1, 1},
//		{0, 1, 0},   // T shape;
//	}, blocks.getSubimage(blockSize, 0, blockSize, blockSize), this, 2);
//	
//	shapes[2] = new Shape(new int[][]{
//		{1, 1, 1},
//		{1, 0, 0},   // L shape;
//	}, blocks.getSubimage(blockSize*2, 0, blockSize, blockSize), this, 3);
//	
//	shapes[3] = new Shape(new int[][]{
//		{1, 1, 1},
//		{0, 0, 1},   // J shape;
//	}, blocks.getSubimage(blockSize*3, 0, blockSize, blockSize), this, 4);
//	
//	shapes[4] = new Shape(new int[][]{
//		{0, 1, 1},
//		{1, 1, 0},   // S shape;
//	}, blocks.getSubimage(blockSize*4, 0, blockSize, blockSize), this, 5);
//	
//	shapes[5] = new Shape(new int[][]{
//		{1, 1, 0},
//		{0, 1, 1},   // Z shape;
//	}, blocks.getSubimage(blockSize*5, 0, blockSize, blockSize), this, 6);
//	
//	shapes[6] = new Shape(new int[][]{
//		{1, 1},
//		{1, 1},   // O shape;
//	}, blocks.getSubimage(blockSize*6, 0, blockSize, blockSize), this, 7);
	
	
	
	
	
}
