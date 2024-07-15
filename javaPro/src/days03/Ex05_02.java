package days03;

/**
 * @author jam
 * @date 2024. 7. 3. - 오후 3:33:13
 * @subject 산술 연산자
 * @content + - * /	%
 *
 */
public class Ex05_02 {
	public static void main(String[] args) {
		// int i = 10, j = 3;
		// 주의할 점
		// 1. 정수 / 0
		// java.lang.ArithmeticException - 산술적 예외가 발생하였다.
		// System.out.println(10/0);
		
		// 2. 실수 / 0 -> Infinity
		// System.out.println(10.0/0);
		// System.out.println(Double.isInfinite(10.0/0));
		
		//	3. 실수 % 0	Nan == Not a number (리터럴)
		// System.out.println(10.0 % 0);
		// System.out.println(Double.isNaN(10.0 % 0));

		/*
		System.out.println(i + j); // 덧셈 연산자
		System.out.println(i - j); // 뺄셈 연산자
		System.out.println(i * j); // 곱셈 연산자
		
		System.out.println(i / j); // 나눗셈 연산자 - 몫 구하기
		System.out.println(i % j); // 나눗셈 연산자 - 나머지 구하기
		*/
	}
}