package days07;

public class Ex02_03_02 {

	public static void main(String[] args) {
//      이등변삼각형
//      __*  					(1,3)
//      _*** 			(2,2)	(2,3)	(2,4)
//      *****	(3,1)	(3,2)	(3,3)	(3,4)	(3,5)
//            
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
//	(1)			System.out.print(i+j>=4?"*":"_");
//				
//				__***
//				_****
//				*****
				
//	(2)			System.out.print(j-i<=2?"*":"_");
//				
//				***__
//				****_
//				*****

//	(1)&&(2)	System.out.print(i+j>=4 && j-i<=2?"*":"_");
//				
//				__*__
//				_***_
//				*****
				
				
			}
			System.out.println();
		}

  } // main	
	
}// class
