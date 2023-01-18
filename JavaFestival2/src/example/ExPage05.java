package example;

public class ExPage05 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int iDiff = 0, iMinDiff = 0;
		int iIndex1 = 0, iIndex2 = 0;

		iMinDiff = getDiff(point[0], point[1]);
		iIndex1 = 0; 
		iIndex2 = 1;
		
		for (int i = 0; i < point.length; i++) {
			for (int j = i+1; j < point.length; j++) {
				iDiff = getDiff(point[i], point[j]);
				if(iMinDiff > iDiff) {
					iMinDiff = iDiff;
					iIndex1 = i; 
					iIndex2 = j;
				}
			}
		}

		printArray(point);
		System.out.printf("result = [ %d, %d] %n", iIndex1, iIndex2);

		System.out.println("*** Finish ***");
	}

	private static int getDiff(int iOne, int iTwo) {
		int iDiff = 0;
		iDiff = iOne - iTwo;
		if(iDiff < 0)
			iDiff = iDiff * -1;
		return iDiff;
	}
	
	private static void printArray(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(" %2d", arrInt[i]);
		}
		System.out.printf("%n");
	}

}
