package example;

public class ExPage12 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		String strScore = "OOOXOO";
		int iSumScore = 0;
		
		strScore = "OOOXOO";
		System.out.println(strScore);
		iSumScore = checkScore(strScore);
		System.out.println(iSumScore);

		strScore = "OOOXOOXOOOOXO";
		System.out.println(strScore);
		iSumScore = checkScore(strScore);
		System.out.println(iSumScore);

		System.out.println("*** Finish ***");
	}
	
	private static int checkScore(String strScore) {
		String[] strSplit;
		int iSumScore = 0;

		strSplit = strScore.split("X");
		for (int i = 0; i < strSplit.length; i++) {
			iSumScore += sumOnetoNum(strSplit[i].length());
			
			System.out.printf("iSumScore : %d, strSplit[%d] : %s = %d %n", 
					iSumScore, i, strSplit[i], strSplit[i].length());
		}
		
		return iSumScore;
	}
	

	private static int sumOnetoNum(int iNum) {
		int iSum = 0;

		for (int i = 1; i <= iNum; i++) {
			iSum += i;
		}
		return iSum;
	}

}
