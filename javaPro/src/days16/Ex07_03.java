package days16;

/*
문제 설명

길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는
문자열을 리턴하는 함수, solution을 완성하세요. 
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 
리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n   return
3   "수박수"
4   "수박수박"
 */

public class Ex07_03 {
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println(solution(10000));
		long end = System.nanoTime();
		System.out.println(end - start);
	}// main

//	1.
	private static StringBuilder solution(int n) {

		StringBuilder answer = new StringBuilder();
		int 몫 = n / 2;
		int 나머지 = n % 2;
		for (int i = 1; i <= 몫; i++) {
			answer.append("수박");
		}
		if(나머지 == 1) {
			answer.append('수');
		}
		return answer;
	}// solution
	
//	2.
//	private static StringBuilder solution(int n) {
//
//		StringBuilder answer = new StringBuilder();
//		boolean sw = true;
//		
//		for (int i = 1; i <= n; i++) {
//			if (sw) {
//				answer = answer.append("수");
//			} else {
//				answer = answer.append("박");
//			}
//		}
//		return answer;
//	}// solution

//	3.
//	private static StringBuilder solution(int n) {
//
//		StringBuilder answer = new StringBuilder("수");
//
//		for (int i = 1; i < n; i++) {
//			if (i % 2 == 0) {
//				answer = answer.append("수");
//			} else {
//				answer = answer.append("박");
//			}
//		}
//		return answer;
//	}//solution
	
//	4.
//	private static String solution(int n) {
//	      return IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? "수" : "박").collect(Collectors.joining());
//	   }
	
}// class
