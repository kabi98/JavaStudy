package ex01basic;

public class Main {

	public static void main(String[] args) {
		Parent p = new Parent(); 
		Child c = new Child(); 
		
		p.makeGalbi();
		p.makeKimchi();
		
		c.makeGalbi();
		c.makeKimchi();
		c.makeKal();
	}

}
