package example;

public class ExPage06 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int NUM_COUNT = 77;
		int i = 0, j = 0, iSum;

		i = 1;
		j = NUM_COUNT;
		iSum = 0;
		while (i <= NUM_COUNT) {
			iSum += j * i;
			System.out.printf("(%d*%d) +", j, i);
			i++;
			j--;
		}
		System.out.println();

		System.out.printf("%d %n", iSum);
		System.out.println();
		System.out.println("*** Finish ***");
	}

}
