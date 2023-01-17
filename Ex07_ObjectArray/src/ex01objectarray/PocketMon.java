package ex01objectarray;

public class PocketMon {
	private String name;
	private String type;
	private int hp;
	private int atk;
	private String skill;
	
	
	public PocketMon(String name, String type, int hp, int atk, String skill) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.skill = skill;
	}

	public void showThree() {
		System.out.printf("%s, \t%s, \t%d %n", 
				this.name, this.type, this.hp);
	}
	
	public void showAll() {
		System.out.printf("PocketMon : %s, %s, %d, %d, %s %n", 
				this.name, this.type, this.hp, this.atk, this.skill);
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

}
