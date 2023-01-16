package ex01method;

public class Ex07_배열의평균 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		int[] array = {50, 25, 25};
		
		double average = getAverage(array);

		System.out.printf("array의 평균은 : %.2f %n", average);
		
		System.out.println("*** Finish ***");
	}

	public static double getAverage(int[] array) {
		int iSum = 0;
		double dAverage = 0.0;
		
		for(int i=0; i<array.length; i++)
		{
			iSum += array[i];
		}
		
		dAverage = (double)iSum / (double)array.length;
		
//		int iTemp = (int)(dAverage * 100);
//		System.out.printf("getAverage : %d %n", iTemp);
//		dAverage = iTemp * 0.01;
//		System.out.printf("getAverage : %f %n", dAverage);
		
		return dAverage;
	}

}
