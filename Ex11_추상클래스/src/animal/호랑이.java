package animal;

public class 호랑이 extends 포유류 implements 물, 나무 {

	@Override
	protected void 울다() {
		System.out.println("어~흥~");
	}

	@Override
	public void 헤엄치다() {
		System.out.println("멋있게 헤엄");
	}

	@Override
	public void 잠수하다() {
		System.out.println("1분만 잠수");
	}

	@Override
	public void 나무타기() {
		System.out.println("큰가지로 나무를 탄다");
	}
	

}
