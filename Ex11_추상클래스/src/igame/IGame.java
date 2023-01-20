package igame;

public interface IGame {
	
	// 두개의 랜덤한 정수를 만드는 기능.
	public abstract void makeRandom();
	
	// 콘솔창에 문제를 출제
	// 위에서 만든 랜덤한 정수를 통해 문제를 출제
	// 3+5=
	public abstract void quiz();
	
	public abstract boolean checkAnswer(int answer);
	

}
