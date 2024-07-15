package days10;

/**
 * @author jam
 * @date 2024. 7. 12. - 오전 11:10:40
 * @subject
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) {

//		double result = pow(2, 3);
//		System.out.println(result);
//		result = pow(2,-3);
//		System.out.println(result);
		
		double result1 = recursivePow(2,3);
		System.out.println(result1);

		double result2 = recursivePow(2,-3);
		System.out.println(result2);
		
		double result3 = recursivePow(2,0);
		System.out.println(result3);

	}// main

	private static double recursivePow(int i, int j) {
		if(j<0)return 1 / recursivePow(i, -j);
		if(j>1)return i * recursivePow(i, j-1);
		else if(j==0) return 1;
		return i;
	}

	private static double pow(int i, int j) {
		double result = 1;
		int exp = Math.abs(j);
		for (int k = 0; k < exp; k++) {
			result *= i;
		}
		return j > 0 ? result : 1 / result;
	}

}// class