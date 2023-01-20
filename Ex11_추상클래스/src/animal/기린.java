package animal;

public class 기린 extends 포유류 {

	// 메소드 중복정의 : 오버로딩 (한 클래스내)
	// 메소드 재정의 : 오버라이딩 (상속관계)
	
	@Override
	protected void 울다() {
		System.out.println("기린기린");
	}

}
