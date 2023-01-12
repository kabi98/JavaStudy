package example;

public class ExPage15 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////

		final String[] GRADE_CHAR = { "A", "B", "C", "D", "F" };
		int[] arrScroeCount = { 0, 0, 0, 0, 0 };
		String[] arrEachScore;

		String strInputScore = "A,A,B,C,D,A,C,D,D,D,F";

		System.out.printf("Input : %s %n", strInputScore);

		arrEachScore = strInputScore.split(",");
		for (int i = 0; i < arrEachScore.length; i++) {
			for (int j = 0; j < GRADE_CHAR.length; j++) {
				if (arrEachScore[i].equals(GRADE_CHAR[j])) {
					arrScroeCount[j]++;
					break;
				}
			}
		}

		for (int i = 0; i < arrScroeCount.length; i++) {
			System.out.printf("%s : %d명 %n", GRADE_CHAR[i], arrScroeCount[i]);
		}

//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

}
