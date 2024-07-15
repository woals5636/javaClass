package days09;

/**
 * @author jam
 * @date 2024. 7. 11. - 오후 2:13:27
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		// [문제]
		// 거듭 제곱 == 누승 == 멱 == pow
		// 2^3 == 밑수(2)를 지수(3)만큼 반복해서 곱하는 것.
		// 2^3 == 2*2*2

		double result = pow(2, -3);
		double result2 = recursivePow(2, 3);

		System.out.println(result);
		System.out.println(result2);

	}// main

	// 일반 함수
	private static double pow(int i, int j) {
		double result = 1;
		int exp = j < 0 ? -j : j;
		for (int k = 0; k < exp; k++) {
			result *= i;
		}
		return j > 0 ? result : 1 / result;

//		double result = 1.0;
//		if(j<0) {
//			j = j*-1;
//			for (int x = 0; x < j; x++) {
//				result *=i;
//			}
//			result = 1/result;
//		}
//		else {
//			for (int x = 0; x < j; x++) {
//				result *=i;
//			}		
//		}
//		return result;
	}

	// 재귀 함수
	private static double recursivePow(int i, int j) {
		if (j == 1)
			return i;
		else
			return i * recursivePow(i, j - 1);
	}
}// class