package music;

public class Ex00Static {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
		
		int iOne, iTwo;

		iOne = 4; iTwo = 8;
		System.out.printf("add(%d, %d) => %d %n", 
				iOne, iTwo, new Ex00Static().add(iOne, iTwo));
		
		iOne = 5; iTwo = 3;
		Ex00Static ex = new Ex00Static();
		System.out.printf("add(%d, %d) => %d %n", 
				iOne, iTwo, ex.add(iOne, iTwo));
		
		
		System.out.println("*** Finish ***");
	}
	
	public int add(int iOne, int iTwo) {
		return iOne + iTwo;
		
	}	

}
