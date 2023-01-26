package model;

public class MemberDTO {
	
	// DTO : Data Transfer Object - 데이터를 이동할 수 있게 하는 나만의 자료형
	// 필드
	// 아이디, pw, 이름, 전화번호
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	public MemberDTO(String id, String pw, String name, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
	
	public MemberDTO() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
