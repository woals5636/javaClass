package days13;

/**
 * @author jam
 * @date 2024. 7. 17. - 오전 11:52:30
 * @subject private 선언된 필드에 접근하는 방법 ?
 * @content
 *
 */
public class Person {

	// field
	private String name = "익명";
	private int age = 20;
	private boolean gender = false;

	public Person() {
	}
	
	public Person(String n) {
		name = n;
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public Person(String n, int a, boolean g) {
		name = n;
		age = a;
		gender = g;
	}

	// method
	public void dispPerson() {
		System.out.printf("> 이름:%s, 나이:%d\n", name, age);
	}

	// setter
	// 해당 메서드에 조건을 만들어 재사용에 유용하게 한다.
	public void setAge(int _age) {
		if(_age < 0 || _age > 150) {
			throw new NullPointerException();
		}else {
			age = _age;		
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	// getter
	public int getAge() {
		return age;
	}
	
	
	
}// class
