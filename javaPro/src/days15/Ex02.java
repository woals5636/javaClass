package days15;

/**
 * @author jam
 * @date 2024. 7. 19. - 오전 11:08:18
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		// 추상 메서드(abstract method)
		//	ㄴ 몸체(body)가 없는 메서드
		
		// 추상 클래스(abstract class)
		//	ㄴ 공통적인 멤버를 가진 클래스 설계..
		//	ㄴ 객체를 생성할 수 없다.
		//	new Parent();	X
		
		Parent p = new Child();
		p.dispA();
	}
	
}

abstract class Parent{
	// 필드
	// 생성자
	// 추상메서드
	abstract void dispA();
	abstract void dispB();
	abstract void dispC();
	// 메서드
	
}
/*
 * 추상 메서드를 갖고 있는 부모 클래스가 추상 클래스일 경우에는
 * 1. 자식 클래스를 추상 클래스로 선언하거나
 * 	abstract class Child extends Parent{}
 * 
 * 2. 부모 클래스의 추상 메서드를 오버라이딩하여 재정의해야 한다. 
 *  class Child extends Parent{
 *  	@Override
 *  	void dispA() {
 *  	}
 *  	@Override
 *  	void dispB() {
 *  	}
 *  	@Override
 *  	void dispC() {
 *  	}
 *  }
*/

class Child extends Parent {
	@Override
	void dispA() {
	}

	@Override
	void dispB() {
	}

	@Override
	void dispC() {
	}
}