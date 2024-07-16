package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 12:18:13
 * @subject
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) {
//		지역변수
//		public int age = 10;
//		Illegal modifier for parameter age; only final is permitted
		
//		배열
		int [] m = null;
		m = new int[3];
		
//		클래스 => 객체의 설계도
//		객체 => 클래스의 주소값을 참조하는 변수
//		인스턴스 => 생성된 객체
//		new => heap 영역에 메모리 할당
		
		// 인스턴스
		// [power][channel][color][p()][cu()][cd()]
		Tv t1;			// 객체 선언
		t1 = new Tv();	// 객체 생성 or 인스턴스화
		// 멤버들을 접근하는 방법 : 객체명.필드명, 객체명.메서드명()

		t1.power();
		System.out.println(t1.power ?"O":"X");

		t1.channel = 10;
		System.out.println(t1.channel);
		t1.channelDown();
		System.out.println(t1.channel);
		
		t1.power();
		System.out.println(t1.power ?"O":"X");
		
	}// main
}// class
