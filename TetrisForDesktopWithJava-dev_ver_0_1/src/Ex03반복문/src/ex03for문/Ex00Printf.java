package ex03for문;

public class Ex00Printf {

	public static void main(String[] args) {
		// 이나연
		// 이름 나이 연락처
		String strName = "문경수";
		int iAge = 19;
		String strTel = "010-1234-5678";
		
//		System.out.println("이름 : " + strName + " / 나이 : " 
//				+ iAge + "(세) / 전화번호 : " + strTel);
		System.out.printf("이름 : %s / 나이 : %d(세) / 전화번호 : %s %n",
				strName, iAge, strTel);
		 
		System.out.printf("이름 : %s / 나이 : %d(세) / 전화번호 : %s %n",
				strName, iAge, strTel);

	}

}
