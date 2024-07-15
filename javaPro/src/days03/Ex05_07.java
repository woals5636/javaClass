package days03;

/**
 * @author jam
 * @date 2024. 7. 3. - 오후 5:27:44
 * @subject
 * @content
 *
 */
public class Ex05_07 {

	public static void main(String[] args) {

		// ++
		int x = 10;
		// int y = ++x; -> x = 11 , y = 11;
		int y = x++;

		System.out.printf("x=%d, y=%d\n", x, y);

		int m = 100;
		// System.out.println(m++ == 100); // 100 == 100 true
		System.out.println(++m == 100); // 101 == 100 false


		/*
		 * int n = 10;
		 * 
		 * 1) 5 증가
		 * n = n + 5;
		 * n += 5;
		 * 
		 * 2) 10 감소
		 * n = n - 10;
		 * n -= 10;
		 * 
		 */

	}
}
