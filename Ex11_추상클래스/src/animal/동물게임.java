package animal;

public class 동물게임 {

	public static void main(String[] args) {
		호랑이 호랑이1 = new 호랑이();
		토끼 토끼1 = new 토끼();
		기린 기린1 = new 기린();

		호랑이 호랑이2 = new 호랑이();
		토끼 토끼2 = new 토끼();
		기린 기린2 = new 기린();

		호랑이 호랑이3 = new 호랑이();

		포유류[] 동물들 = new 포유류[] { 호랑이1, 토끼1, 기린1, 호랑이2, 토끼2, 기린2, 호랑이3 };

		for (int i = 0; i < 동물들.length; i++) {
			동물들[i].울다();
			if (동물들[i] instanceof 호랑이) {
				((호랑이)동물들[i]).헤엄치다();
			}
		}

	}

}
