package days16;

/**
 * @author jam
 * @date 2024. 7. 22. - 오후 12:32:16
 * @subject
 * @content
 *
 */
public class Ex03_02 {
	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "홍길동");
		
		
		try {
//			Person p2 = (Person)p1.clone();
			Person p2 = p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// ㅁ. equals()
		//    finalize()
		//	  notify() notifyAll() wait() x 3
		
		
	}// main
}// class

class Person implements Cloneable{
	@Override
	public int hashCode() {
		return rrn.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;//다운캐스팅
			return this.rrn.equals(p.rrn);
		}
		
		return false;
	}


	// field
	String rrn;
	String name;
	
	// constructor
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + "]";
	}


	// 부모의 clone() 메서드를 오바라이딩했기 때문에 리턴자료형이 Object이어야 하지만
	// 리턴자료형을 복제하는 클래스 타입으로 변경할 수 있도록
	// jdk1.5 "공변변환타입" 새로운 문법이 추가....
	@Override
	protected Person clone() throws CloneNotSupportedException {
		
		Person pClone = null;
		pClone = (Person) super.clone(); // Object -> Person 다운캐스팅
		
		
		return pClone;
	}
	
}