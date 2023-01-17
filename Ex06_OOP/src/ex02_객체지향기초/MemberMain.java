package ex02_객체지향기초;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		Member m1 = new Member();
		
		System.out.println(m1);
		System.out.println(m1.name);
		System.out.println(m1.age);
		
		m1.join("경남", 20);

		m1.join("구소현" , 26);   
		m1.phone = "01012341234";
		m1.birth=  980519;
		m1.gender = '여';		
		
		System.out.println(m1.name);
		System.out.println(m1.age);
		System.out.println(m1.birth);
		System.out.println(m1.gender);
		System.out.println(m1.phone);

		Member m2 = new Member();

		m2.join("경수", 49);
		m2.birth = 19740723;
		m2.gender = 'm';
		m2.phone = "010-4553-2486";

		System.out.println(m2.name);
		System.out.println(m2.age);
		System.out.println(m2.birth);
		System.out.println(m2.gender);
		System.out.println(m2.phone);

		System.out.println("*** Finish ***");
	}

}
