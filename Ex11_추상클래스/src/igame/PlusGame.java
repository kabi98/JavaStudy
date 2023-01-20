package igame;

import java.util.Random;

public class PlusGame implements IGame {

	int RANDOM_BOUND = 10;

	int iRanOne, iRanTwo;
	Random r;

	@Override
	public void makeRandom() {
		r = new Random();

		iRanOne = r.nextInt(RANDOM_BOUND) + 1;
		iRanTwo = r.nextInt(RANDOM_BOUND) + 1;
	}

	// 콘솔창에 문제를 출제
	// 위에서 만든 랜덤한 정수를 통해 문제를 출제
	// 3+5=

	@Override
	public void quiz() {
		System.out.printf("%d + %d => ", iRanOne, iRanTwo);
	}

	@Override
	public boolean checkAnswer(int answer) {
		int iCorrect = iRanOne + iRanTwo;
		if (answer == iCorrect) {
			return true;
		}
		return false;
	}

}
