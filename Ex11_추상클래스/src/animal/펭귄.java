package animal;

public class 펭귄 extends 조류 implements 물 {

	@Override
	protected void 날다() {
		System.out.println("짧게 난다");
	}

	@Override
	protected void 알을낳다() {
		System.out.println("하나만 낳는다");
	}

	@Override
	public void 헤엄치다() {
		System.out.println("빨리 헤엄치다.");
	}

	@Override
	public void 잠수하다() {
		System.out.println("10분간 잠수합니다");
	}

}
