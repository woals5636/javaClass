package days16;

/**
 * @author jam
 * @date 2024. 7. 22. - 오후 12:07:37
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {

		// [ java.lang 패키지 - 자바에서 가장 기본이 되는 클래스 ]
		// java.util 패키지 - 유용한 클래스
		// 1. [java.lang.Object 클래스]
		Item item1 = new Item(10);
		Item item2 = new Item(10);
		System.out.println(item1.hashCode());
		System.out.println(item2.hashCode());
		//	ㄱ. hashCode() - 자료형 int
		//	객체가 메모리상에 생성되면 객체의 주소값을 해싱기법을 사용해서 해시코드를 만들어서 반환하는 메서드이다. 

		//	ㄴ. toString() - 자료형 String
		//	인스턴스에 대한 정보를 문자열로 반환하는 메서드
		//	오버라이딩(재정의)를 해서 사용함
		//		days16.Item@73a28541
		//		패키지.클래스명@hashCode의 16진수
		System.out.println(item1.toString());
		
		//	ㄷ. getClass()
		//	객체 자신의 클래스를 정보를 담고 있는 Class 인스턴스를 반환하는 메서드
		//	Class<? extends Item> item1.getClass(); 
		Class cls = item1.getClass();
		
		//					"days16.Item"
		System.out.println(cls.getName());	// 풀네임. . . 
		//	cls.getConstructors(	); // 어떤 생성자 . . 
		// cls.getMethods	// 어떤 메서드 . . .
		
		//	ㄹ. clone()	객체의 복사본을 만들어서 반환
		
	}// main

}// class

class Item {
	
	@Override
	public String toString() {
		return "Item [value=" + value + ", toString()=" + super.toString() + "]";
	}

	// field
	int value;
	
	// constructor 1
	Item(int value){
		this.value = value;
	}

}// class