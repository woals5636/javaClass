package days13;

/**
 * @author jam
 * @date 2024. 7. 17. - 오후 2:38:11
 * @subject [ this 키워드 ]
 * @content	1. 정의 ? 클래스 자기 자신의 주소값을 갖는 참조변수
 * 				Tv t1 = new Tv(); // 변수, 참조 변수, 객체
 * 				Tv t2 = new Tv(); // 변수, 참조 변수, 객체
 * 				Tv [this];
 *
 *			2. this 3가지 용도
 *				1)	멤버(클래스의 구성요소) = 필드, 메서드(생성자,getter,setter..)를 가리킬 때
 *				2)	생성자에서 또 다른 생성자를 호출할 때의 this 용도
 *				3)	리턴값, 매개변수값으로 사용되는 this 용도
 *					ㄴ 리턴값	:	Point클래스 17~20줄
 *					ㄴ 매개변수	:	Point클래스 23~25줄
 */
public class Ex07 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		p1.plusPoint(100).dispPoint();
//		p1.thisTest(this);	static 메소드에서는 this를 사용할 수 없다.
		
		//
		Member m1 = new Member("홍길동","목동");
		System.out.println(m1.getName()+"/"+m1.getAddr());

		Member m2 = new Member();
		System.out.println(m2.getName()+"/"+m2.getAddr());
		
	}//main
	
}//class

class Member{
	
	// field
	private String name;
	private String addr;
	
	// constructor
	public Member() {
		//	super();
		this("익명","미정");
	}

	public Member(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	
	// getter, setter
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}