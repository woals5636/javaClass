package days11;

import java.util.Arrays;

/**
 * @author jam
 * @date 2024. 7. 15. - 오후 4:14:30
 * @subject
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) {

		int n = 71;
		int[] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 71, 37 };

		// int index = indexOf(m, n);
		int index, beginIndex = 0;
		while (  (index = indexOf(m, n, beginIndex) ) != -1  ) {
			System.out.println( index );
			beginIndex = index + 1;
		}
		// System.out.println(index);

		// 문제) m 배열에서 n을 찾아서
		// 모든 index 값을 출력

	}// main

	private static int indexOf(int[] m, int n, int beginIndex) {
		for (int i = beginIndex; i < m.length; i++) {
		         if ( m[i] == n) return i;
		      }
		      return -1;
		   }

	
//	private static String indexOf(int[] m, int n) {
//		int[] same = new int [m.length];
//		int count = 0;
//		for (int i = 0; i < m.length; i++) {
//			if (m[i] == n) {
//				same[count++] = i;
//			}
//		}
//		if (count > 0) {
//			return Arrays.toString(same);
//		}
//		return null;
//	}
}// class
