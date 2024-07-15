package days08;

/**
 * @author jam
 * @date 2024. 7. 10. - 오후 5:06:23
 * @subject
 * @content	매개변수 + 메서드 호출
 *			1) Call By Name
 *			2) Call By Value
 *			3) Call By Reference
 *
 */
public class Ex05_02 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		System.out.printf("> 1. main  x=%d, y=%d\n", x, y);
		/*
		int temp = x;
		x = y;
		y = temp;
		 */

		swap(x,y);

		System.out.printf("> 2. main  x=%d, y=%d\n", x, y);
	}// main

	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
}// class
