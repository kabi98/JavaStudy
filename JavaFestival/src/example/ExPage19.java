package example;

public class ExPage19 {

	public static void main(String[] args) {
		System.out.println("*** Start ***");
//////////////////////////////////////////////////////////////////////////////////
		int iA=0, iB=0; 
		
		iA = 50; iB = 15;
		System.out.printf("%d %c %d = %d 입니다.", iA, '-', iB, cal(iA, iB, '-'));
		System.out.println();
		
		iA = 50; iB = 15;
		System.out.printf("%d %c %d = %d 입니다.", iA, '*', iB, cal(iA, iB, '*'));
		System.out.println();
		
		iA = 5; iB = 6;
		System.out.printf("%d %c %d = %d 입니다.", iA, '+', iB, cal(iA, iB, '+'));
		System.out.println();
		
		iA = 6; iB = 2;
		System.out.printf("%d %c %d = %d 입니다.", iA, '/', iB, cal(iA, iB, '/'));
		System.out.println();
		
		iA = 5; iB = 6;
		System.out.printf("%d %c %d = %d 입니다.", iA, '/', iB, cal(iA, iB, '/'));
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////
		System.out.println("*** Finish ***");
	}

	public static int cal(int iA, int iB, char chOper) {
		if(chOper == '+') {
			return iA + iB;
		}else if(chOper == '-') {
			return iA - iB;
		}else if(chOper == '*') {
			return iA * iB;
		}else if(chOper == '/') {
			return iA / iB;
		}else { 
			return 0;
		}
			
	}

	
}
