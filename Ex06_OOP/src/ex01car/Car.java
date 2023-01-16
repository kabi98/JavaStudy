package ex01car;

public class Car {
	// Field - 데이터를 저장하는 공간(변수)
	int iDoorCnt, iWheelCnt, iSideMirrorCnt;
	boolean isTrunk;
	String strHandleShape;
	
	// Method - 객체가 할 행위(함수)
	
	public void startUp() {
		System.out.println("부릉 부릉 ~~~");
	}

	public void run() {
		System.out.println("달려 달려~~~");
	}

	public void brake() {
		System.out.println("끼이이익 ~~~");
	}

	public void changeGear() {
		System.out.println("기어를 변환합니다. ~~~");
	}

	public void parkingAuto() {
		System.out.println("자동 주차합니다. ~~~");
	}

}
