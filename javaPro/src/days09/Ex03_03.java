package days09;

/**
 * @author jam
 * @date 2024. 7. 11. - 오후 2:02:46
 * @subject
 * @content
 *
 */
public class Ex03_03 {
	
	public static void main(String[] args) {
		// 재귀함수 - 합
		// 트리구조 처리 작업 할때 사용
		// [팩토리얼 Factorial] 계승
		// 정의) 1에서 부터 n까지 양의 정수의 곱
		// n! = n*(n-1)*(n-2)....*1
		// 0! = 1 (약속)
		int n = 5;
//		int result = factorial(n);
		int result = recursiveFactorial(n);	// 재귀함
		System.out.println("="+result);
		
		

	}// main

	private static int recursiveFactorial(int n) {
		if(n==1)return n;
		else return n * recursiveFactorial(n-1);
	}

	private static int factorial(int n) {
		// 5*4*3*2*1
		int result = 1;
		for (int i = 5; i >= 1; i--) {
			System.out.printf("%d*",i);
			result *= i;
		}
		return result;
	}
}// class