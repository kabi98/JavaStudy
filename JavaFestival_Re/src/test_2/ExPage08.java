package test_2;

public class ExPage08 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		final int ARR_LEN = 5;
		
		int [][] arrTwo = null;
		int [][] arrRotate = null;
		int iCount = 0;
		
		arrTwo = new int[ARR_LEN][];
		for(int i = 0; i< arrTwo.length; i++)
		{
			arrTwo[i] = new int[ARR_LEN];
		}

		iCount = 1;
		for(int i = 0; i< arrTwo.length; i++)
		{
			for(int j = 0; j< arrTwo[i].length; j++) {
				arrTwo[i][j] = iCount++;
			}
		}
		
		System.out.println("원본");
		printArray(arrTwo);
		
		arrRotate = rotateArray(arrTwo);
		System.out.println();
		
		System.out.println("90도 회전");
		printArray(arrRotate);
		
		System.out.println("*** Finish ***");
	}
	
	private static int[][] rotateArray(int [][] arrOrg) {
		int [][] arrRotate = null;
		
		arrRotate = new int[arrOrg.length][arrOrg[0].length];
		
		for(int i = 0; i< arrOrg.length; i++)
		{
			for(int j = 0; j< arrOrg[i].length; j++) {
//				System.out.printf("i: %d, j:%d, arrOrg[i].length-j :  %d  %n", i,j, arrOrg[i].length-j-1);
				arrRotate[arrOrg[i].length-j-1][i] = arrOrg[i][j];
			}
		}
		return arrRotate;
	}
	
	private static void printArray(int [][] arrPrint) {
		for(int i = 0; i< arrPrint.length; i++)
		{
			for(int j = 0; j< arrPrint[i].length; j++) {
				System.out.printf("%2d ", arrPrint[i][j]);
			}
			System.out.println();
		}
		
	}
	

}
