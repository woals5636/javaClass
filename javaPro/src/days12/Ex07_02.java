package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 3:33:34
 * @subject
 * @content
 *
 */
public class Ex07_02 {
	public static void main(String[] args) {
		// Call By Name
		// Call By Value
		// Call By Reference
		int[] m = { 10, 20 };

		System.out.printf("x=%d,y=%d\n", m[0], m[1]);

		swap(m);

		System.out.printf("x=%d,y=%d\n", m[0], m[1]);

	}// main

	private static void swap(int[] m) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
	}

}// class
