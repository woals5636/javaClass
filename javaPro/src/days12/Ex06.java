package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 2:51:26
 * @subject [객체 복사(copy)와 객체 복제(clone)]
 * @content
 *
 */
public class Ex06 {
	public static void main(String[] args) {
		//
		Tv t1 = new Tv();
		t1.color = "red";
		System.out.println(t1.color);
		// 객체 복사 (Copy)
		Tv t2 = t1;
		t2.color = "blue";
		System.out.println(t1.color);
		
		tvTest(t1);
		System.out.println(t1.color);

	}// main

	private static void tvTest(Tv t) {		
		t.color = "Green";
	}
}// class
