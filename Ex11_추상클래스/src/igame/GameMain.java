package igame;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		PlusGame game = new PlusGame();
		Scanner sc = new Scanner(System.in);

		int answer;
		int iFails = 0; 
		
		while (iFails < 5) {
			game.makeRandom();
			game.quiz();
			answer = sc.nextInt();

			if (game.checkAnswer(answer)) {
				System.out.println("정답입니다.");
			} else {
				iFails ++;
				System.out.printf("틀렸습니다.. 틀린횟수 %d %n", iFails);
			}
		}
		System.out.println("종료합니다.");
		sc.close();
	}

}
