package days07;

public class Ex02_05 {

	   public static void main(String[] args) {
//	마름모
//	__*							(1,3)
//	_***				(2,2)	(2,3)	(2,4)
//	*****		(3,1)	(3,2)	(3,3)	(3,4)	(3,5)
//	_***				(4,2)	(4,3)	(4,4)
//	__*							(5,3)

//		   for (int i = 1; i <= 5 ; i++) {
//			   for (int j = 1; j <= 5 ; j++) {
//				   System.out.print(i+j>=4 && j-i<=2 && i-j<=2 && i+j<=8?"*":"_");
//
//			   } // for j
//			   System.out.println();
//		   } // for i

//	모래시계
//	*****	(1,1)	(1,2)	(1,3)	(1,4)	(1,5)
//	_***_			(2,2)	(2,3)	(2,4)
//	__*__					(3,3)
//	_***_			(4,2)	(4,3)	(4,4)
//	*****	(5,1)	(5,2)	(5,3)	(5,4)	(5,5)
		   
		   for (int i = 1; i <= 5 ; i++) {
			   for (int j = 1; j <= 5 ; j++) {
				   System.out.print((i<=j && j+i<=6)||(i>=j && j+i>=6)?"*":"_");
			   } // for j
			   System.out.println();
		   } // for i
		   
		   

	   } // main

	} // class
