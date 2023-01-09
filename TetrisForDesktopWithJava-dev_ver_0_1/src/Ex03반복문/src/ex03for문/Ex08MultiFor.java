package ex03for문;

public class Ex08MultiFor {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		final int END_DAN = 12;

//		for (int iDan = 2; iDan <= 9; iDan++) {
//			System.out.printf("*** %d단 *** %n", iDan );
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %2d%n", iDan, i, (i * iDan));
//			}
//			System.out.println();
//		}
//		

//		System.out.printf("*** %d단 *** %n", iDan);
		for (int iDan = 2; iDan <= END_DAN; iDan++) {
			for (int i = 1; i <= END_DAN; i++) {
				System.out.printf("%2d*%2d=%3d ", iDan, i, (i * iDan));
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("*** Finish ***");
	}

}
