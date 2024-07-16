package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 2:12:12
 * @subject
 * @content
 *
 */
public class Ex03_02 {
	public static void main(String[] args) {
//		int [] m = null;
//		//java.lang.NullPointerException
//		System.out.println(m[0]);

		Tv t1 = null;
//		The local variable t1 may not have been initialized
//		System.out.println(t1.channel);

		t1 = new Tv();
		tvTest(t1);

	}// main

	private static void tvTest(Tv t1) {
		System.out.println(t1.channel);
	}
}// class
