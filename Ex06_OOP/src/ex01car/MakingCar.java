package ex01car;

public class MakingCar {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		Car myCar = new Car();
		
		myCar.iDoorCnt = 4;
		myCar.iWheelCnt = 4;
		myCar.isTrunk = true;
		myCar.iSideMirrorCnt = 2;
		myCar.strHandleShape = "동그랗다";

		System.out.printf(" 문의갯수 : %d %n", myCar.iDoorCnt);
		System.out.printf(" 바퀴의갯수 : %d %n", myCar.iWheelCnt);
		System.out.printf(" 트렁크 유무 : %b %n", myCar.isTrunk);
		System.out.printf(" 사이드미러 갯수 : %d %n", myCar.iSideMirrorCnt);
		System.out.printf(" 핸들모양 : %s %n", myCar.strHandleShape);
		
		myCar.startUp();
		myCar.changeGear();
		myCar.run();
		myCar.brake();;
		myCar.parkingAuto();
		
		
		System.out.println("*** Finish ***");
	}

}
