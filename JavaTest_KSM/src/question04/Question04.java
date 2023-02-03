package question04;

public class Question04 {

	public static void main(String[] args) {
		Zelda game1 = new Zelda();
		Mario game2 = new Mario();
		JustDance game3 = new JustDance();
		
		insert(game1);
		insert(game2);
		insert(game3);
	}
	
	public static void insert(Game game) {
		game.start();
	}

}
