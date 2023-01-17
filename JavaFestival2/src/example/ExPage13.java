package example;

public class ExPage13 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		int base = 0, n=0, result = 0;
		
		base = 2;
		n = 3;
		result = powerN(base, n);
		System.out.printf(" powerN(%d, %d) -> %d %n", base, n, result);

		base = 3;
		n = 3;
		result = powerN(base, n);
		System.out.printf(" powerN(%d, %d) -> %d %n", base, n, result);
		
		base = 10;
		n = 2;
		result = powerN(base, n);
		System.out.printf(" powerN(%d, %d) -> %d %n", base, n, result);
		
		
		System.out.println("*** Finish ***");
	}

	private static int powerN(int base, int n) {
		int iPower = 1;

		for (int i = 0; i < n; i++) {
			iPower = iPower * base;
		}

		return iPower;
	}

}
