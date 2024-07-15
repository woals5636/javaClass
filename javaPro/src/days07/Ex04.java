package days07;

public class Ex04 {

	public static void main(String[] args) {
		// [정보처리 기사 실기]
		// [문제] 피보나치 수열의 항이 100보다 같거나 작을 때 까지의 합을 출력
		// 1+1+2+3+5+8+13+21+34...........

//		풀이방법(1)
//	    int [] strArr = new int[50];
//	    strArr[0] = 1;
//	    strArr[1] = 1;
//	    int i = 0;
//	    while(true){
//	      i++;
//	      strArr[i+2]=strArr[i]+strArr[i+1];
//	      if(strArr[i]>=100) {
//	        break;
//	      }
//	      System.out.println(strArr[i]);
//	    }
		

//		풀이방법(2)
//		int firstTerm = 1;
//	      int secondTerm = 1;
//	      int nextTerm ;
//	      int sum = firstTerm + secondTerm;
//	      System.out.printf("%d+%d+", firstTerm, secondTerm);
//
//	      while( true ) {
//	         nextTerm = firstTerm + secondTerm;
//	         if(nextTerm>100) break;
//	         System.out.printf("%d+", nextTerm);
//	         sum += nextTerm;
//
//	         firstTerm = secondTerm;
//	         secondTerm = nextTerm;
//	      } // while
//
//	      System.out.printf("=%d\n", sum );

		int firstTerm = 1;
		int secondTerm = 1;
		int sum = 0;
		int nextTerm;

		System.out.printf("%d+", firstTerm);

		while(( nextTerm = firstTerm + secondTerm) <=100 ) {
			System.out.printf("%d+", secondTerm);
			sum += nextTerm;

			firstTerm = secondTerm;
			secondTerm = nextTerm;
		} // while

		System.out.printf("=%d\n", sum );
		
	}// main

}// class