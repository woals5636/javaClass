package days07;

public class Ex02_04 {

	   public static void main(String[] args) {
//		   (1)
//	      *
//	      _*
//	      __*
//	      ___*
//	      ____*

	      for (int i = 1; i <= 5 ; i++) { // 행갯수
	         for (int j = 1; j <= 5 ; j++) { // 열갯수
	            if( i==j ) System.out.print("*");
	            else System.out.print("_");
	         }
	         System.out.println();
	      }

//		   (2)
//	      ____* (1,5)
//	      ___*	(2,4)
//	      __*	(3,3)
//	      _*	(4,2)
//	      *		(5,1)
	      for (int i = 1; i <= 5 ; i++) { // 행갯수
	         for (int j = 1; j <= 5 ; j++) { // 열갯수
	            if( i+j==6 ) System.out.print("*");
	            else System.out.print("_");
	         }
	         System.out.println();
	      }

//		   (1) || (2)
//	      *___*
//	      _*_*
//	      __*
//	      _*_*
//	      *___*
	      for (int i = 1; i <= 5 ; i++) { // 행갯수
	         for (int j = 1; j <= 5 ; j++) { // 열갯수
	            if( i==j || i+j==6 ) System.out.print("*");
	            else System.out.print("_");
	         }
	         System.out.println();
	      }

	   } // main

	} // class
