package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 3:33:34
 * @subject
 * @content
 *
 */
public class Ex07_03 {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;

		System.out.printf("x=%d,y=%d\n", p1.x, p1.y);

		swap(p1);	// Call By Reference

		System.out.printf("x=%d,y=%d\n", p1.x, p1.y);

	}// main

	private static void swap(Point m) {
		int temp = m.x;
		m.x = m.y;
		m.y = temp;
	}

}// class
