package ex03_ooppractice;

public class Student {
	private	String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	// 2. 메소드
	// 생성자 메소드
	// 생성자 메소드 특징
	// 1. 리턴타입을 지정하지 않는다.(void도 작성하지 않는다)
	// 2. 메소드 이름은 반드시 클래스 이름과 동일해야 한다.
	// ---> 대소문자 까지 똑같아야 함.!!
	// 3. new 키워드를 사용할때 호출되는 메소드(객체 생성시 사용됨)
	// 4. 기본 생성자(매개변수가 없는 생성자)는 생략이 가능. 
	// 5. 개발자가 새로운 생성자를 만들어내면, 기본 생성자는 사라진다.
	// ---> 기본 생성자를 살리고 싶다면?
	// ---> 생성자를 오버로딩(중복정의) 하면 된다.
	// 6. 생성자는 하나 이상 선언되어야 한다.
	
	public Student(String strName, String strNum, int iAge, int iJava, int iWeb, int iAndroid) {
		this.name = strName;
		this.number = strNum;;
		this.age = iAge;
		this.scoreJava = iJava;
		this.scoreWeb = iWeb;
		this.scoreAndroid = iAndroid;
	}
	
	public Student() {
		
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
