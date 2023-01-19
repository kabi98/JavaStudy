package ex02typechange;

public class SmartPhone extends Phone {
	
	public void wifi() {
		System.out.println("와이파이 ");
	}
	
	@Override
	public void message() {
		System.out.println("카톡 메시지 보내기 ");
	}

}
