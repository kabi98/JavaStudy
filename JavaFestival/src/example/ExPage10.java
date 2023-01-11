package example;

public class ExPage10 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		int i = 0;
		char cAtoZ = 'a';
		
		i = cAtoZ;
		for (i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%d 0x%X %c %n", i, i, i);
		}

		System.out.println();
		System.out.println("*** Finish ***");
	}
}
