package ex02typechange;

public class Main {

	public static void main(String[] args) {
		Phone pONe = new Phone();
		SmartPhone spIPhone = new SmartPhone();
		
		System.out.println("Phone");
		pONe.call();
		pONe.message();
		
		System.out.println("SmartPhone");
		spIPhone.call();
		spIPhone.message();
		spIPhone.wifi();

		Phone pSmart = new SmartPhone();
		System.out.println("Phone pSmart = new SmartPhone()");
		pSmart.call();
		pSmart.message();
		
		//SmartPhone sp = (SmartPhone) new Phone(); --> 불가능
		System.out.println("다운캐스팅");
		SmartPhone spSmart = (SmartPhone)pSmart;
		
		spSmart.wifi();

		
	}

}
