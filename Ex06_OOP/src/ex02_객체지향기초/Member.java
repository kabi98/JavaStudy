package ex02_객체지향기초;

public class Member {
	
	String name;
	String phone;
	int birth;
	char gender;
	int age;
	
	public void join(String inputName, int inputAge) {
		name = inputName;
		age = inputAge;
		System.out.println("회원가입 완료 ~~");
	}

	public void login() {
		System.out.println(name + "이 로그인 합니다.");
	}

}
