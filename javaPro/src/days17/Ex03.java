package days17;

/**
 * @author jam
 * @date 2024. 7. 23. - 오후 12:15:35
 * @subject
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		
		// [ java.lang.Math 클래스 ]
		// Math + 모든 멤버들(필드, 메서드) : static
		// 클래스명.멤버명
		System.out.println(Math.random());
		System.out.println(Math.pow(2,3));
		System.out.println(Math.max(2,3));
		System.out.println(Math.min(2,3));
		System.out.println(Math.abs(-1));
		System.out.println(Math.abs(-3.99));
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		// (암기)
		
		// ceil 올림==절상 	double형 	소수점 첫 번째 자리에서 절상
		System.out.println(Math.ceil(2.0));		// 2.0
		System.out.println(Math.ceil(2.123));	// 3.0
		System.out.println(Math.ceil(2.456));	// 3.0
		System.out.println(Math.ceil(2.789));	// 3.0
		
		// round 반올림	int형
		System.out.println(Math.round(2.0));	// 2
		System.out.println(Math.round(2.123));	// 2
		System.out.println(Math.round(2.456));	// 3
		System.out.println(Math.round(2.789));	// 3
		
		// floor 내림==절삭	double형 	소수점 첫 번째 자리에서 절삭
		System.out.println(Math.floor(2.0));	// 2.0
		System.out.println(Math.floor(2.123));	// 2.0
		System.out.println(Math.floor(2.456));	// 2.0
		System.out.println(Math.floor(2.789));	// 2.0
		
		
	}// main
}// class
