package days07;

public class Ex02_02_02 {

	public static void main(String[] args) {
//                      공    별
//      ___*   i=1      3     1			(1,4)							
//      __**   i=2      2     2			(2,3)	(2,4)						
//      _***   i=3      1     3			(3,2)	(3,3)	(3,4)		
//      ****   i=4      0     4			(4,1)	(4,2)	(4,3)	(4,4)			규칙 : 행열의 합이 5보다 크거나 같다
      
//		for (int i = 1; i <= 4; i++) { // 행갯수
//			for (int j = 1; j <= 4 ; j++) { // 열갯수
//				System.out.print(i+j<=5?"*":"_");
//				/*
//	            if (i+j<=5) {
//	               System.out.print("*");
//	            } else {
//	               System.out.print("_");
//	            }
//				 */
//			}
//			System.out.println();
//		}
		
//                      공    별
//      ****   i=1      0     4			(1,1)	(1,2)	(1,3)	(1,4)
//      _***   i=2      1     3			(2,2)	(2,3)	(2,4)		
//      __**   i=3      2     2			(3,3)	(3,4)			
//      ___*   i=4      3     1			(4,4)									규칙 : 행열의 차가 0보다 작거나 같다
		
		for (int i = 1; i <= 4; i++) { // 행갯수
			for (int j = 1; j <= 4 ; j++) { // 열갯수
				System.out.print(i-j<=0?"*":"_");
			}
			System.out.println();
		}
		

	}

}
