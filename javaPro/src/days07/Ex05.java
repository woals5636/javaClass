package days07;

public class Ex05 {

	public static void main(String[] args) {
		// 계차수열
		// 1+2+4+7+11+16+22.....
		//  1 2 3 4  5  6
		
		int first = 1;
		int next;
		int sum = 0;
		System.out.printf("%d+",first);
		for (int index = 1; index < 20; index++) {
			next = first+index;
			System.out.printf("%d+",next);
			sum = first+next;
			first = next;
		}
		System.out.printf("=%d",sum);
		
//		(강사님 풀이)		
//		 [ 계차수열 ]
//	       term(항) [1+2+4+7+11+16+22..]의 갯수가 20개 까지의 합
//	                0 1 2 3 4 5  +6  계차(difference)

//	      int term = 1;
//	      int difference = 0;
//	      int sum = 0;
//	      for (int i = 1; i <= 20; i++) {
//	          term += difference;
//	          System.out.printf("%d+", term);
//	          difference++;
//	          sum += term;
//	      }
//	      System.out.printf("=%d\n", sum);

	} // main

} // class
