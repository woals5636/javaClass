package days20;

/**
 * @author jam
 * @date 2024. 7. 26. - 오후 3:15:44
 * @subject
 * @content
 *
 */
public class Ex08_03 {
	
	public static void main(String[] args) {
		// [제네릭의 제한]
		
	}// main
	
}// class

class Box2<T>{
	// Cannot make a static reference to the non-static type T
	// 1) 제한 - 제네릭 클래스에는 클래스 변수를 선언할 수 없다.
	// static T item2;
	
	// Cannot make a static reference to the non-static type T
	// 2) 제한 - 클래스 메서드에도 T 타입 사용할 수 없다.
//	static int compare(T a, T b	) {
//		return 0;
//	}
	
	
	
	
}