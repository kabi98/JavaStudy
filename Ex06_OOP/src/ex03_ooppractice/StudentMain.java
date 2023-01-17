package ex03_ooppractice;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.setName("채수민");
		stu1.setNumber("20220878");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);
		
		stu2.setName("임경남");
		stu2.setNumber("20220458");
		stu2.setAge(20);
		stu2.setScoreJava(90);
		stu2.setScoreWeb(25);
		stu2.setScoreAndroid(50);
		
//		System.out.printf("이름 : %s %n", stu2.getName());
//		System.out.printf("자바점수 : %s %n", stu2.getScoreJava());
		
		Student stu3 = new Student("채수빈", "20220878", 20, 50, 99, 77);
		System.out.println(stu3.getName());
		System.out.println(stu3.getScoreAndroid());
		
	}

}
