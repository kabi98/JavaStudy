package question03;

public class Question03 {

	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone();
		CameraPhone cp = new CameraPhone();
		SmartPhone sp = new SmartPhone();

		System.out.println("*** Mobile Phone ***");
		mp.call();
		mp.message();

		
		System.out.println("*** Camera Phone ***");
		cp.call();
		cp.message();
		cp.picture();
		cp.music();

		System.out.println("*** Smart Phone ***");
		sp.call();
		sp.message();
		sp.picture();
		sp.music();
		sp.kakaoTalk();
		sp.wifi();
		
	}

}
