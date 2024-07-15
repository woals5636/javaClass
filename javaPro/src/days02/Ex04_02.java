package days02;

/**
 * @author jam
 * @date 2024. 7. 2. - 오후 2:36:06
 * @subject (암기)
 * @content
 *
 */

public class Ex04_02 {

	public static void main(String[] args) {

		int x = 10, y = 20;
		System.out.printf("교환 전 > x=%d, y=%d\n", x, y);

		// x,y 값을 바꾸기 -> 임시기억공간 tmp 선언
		int tmp = x;
		x = y;
		y = tmp;

		System.out.printf("교환 후 > x=%d, y=%d\n", x, y);

	}

}
