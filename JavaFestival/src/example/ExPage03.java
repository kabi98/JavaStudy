package example;

public class ExPage03 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		final int NUM_START = 1, NUM_FINISH = 100;
		int iAccumulate = 0, iNum = 0;

		iAccumulate = 0;
		iNum = 0;
		for (int i = NUM_START; i <= NUM_FINISH; i++) {
			iNum = i;
			if (iNum % 2 == 0) {
				iNum = iNum * -1;
			}
			System.out.printf("%d ", iNum);
			
			iAccumulate += iNum;
		}
		System.out.println();
		System.out.printf("결과 : %d %n", iAccumulate);

//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

}
