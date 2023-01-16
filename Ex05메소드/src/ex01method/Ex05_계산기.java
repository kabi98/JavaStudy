package ex01method;

public class Ex05_계산기 {

	public static void main(String[] args) {

		System.out.println("*** Start ***");
		int iNum1 = 50;
		int iNum2 = 15;
		char op = '-';
		
		
		iNum1 = 50;
		iNum2 = 15;
		op = '-';
		
		System.out.printf("%d, %d, %c => %d %n", 
				iNum1, iNum2, op, cal(iNum1, iNum2, op));
		
		iNum1 = 50;
		iNum2 = 15;
		op = '*';
		
		System.out.printf("%d, %d, %c => %d %n", 
				iNum1, iNum2, op, cal(iNum1, iNum2, op));
		
		iNum1 = 50;
		iNum2 = 15;
		op = '+';
		
		System.out.printf("%d, %d, %c => %d %n", 
				iNum1, iNum2, op, cal(iNum1, iNum2, op));
		
		iNum1 = 50;
		iNum2 = 15;
		op = '/';
		
		System.out.printf("%d, %d, %c => %d %n", 
				iNum1, iNum2, op, cal(iNum1, iNum2, op));
		
		
		
		System.out.println("*** Finish ***");

	}
	
	public static int cal(int iOne, int iTwo, char chOp) {
		switch(chOp)
		{
		case '+' :
			return iOne + iTwo;
		case '-' :
			return iOne - iTwo;
		case '*' :
			return iOne * iTwo;
		case '/' :
			return iOne / iTwo;
		default :
			return 0;
		}
	}

}
