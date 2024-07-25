package days19;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author jam
 * @date 2024. 7. 25. - 오후 2:48:10
 * @subject
 * @content
 *
 */
public class Ex09 {
	
	public static void main(String[] args) {
		
//		new Person().builder().name("홍길동").age(20).id("jam").build();
		
		Set s = new LinkedHashSet();
		s.add(new Person("kenik","홍길동",20));
		s.add(new Person("admin","관리자",20));
		s.add(new Person("hong","홍길남",20));
		
		// ID가 똑같은 Person 객체는 중복 처리를 해서 추가 X
		s.add(new Person("admin","관리자2",36));
		System.out.println(s.size());
		
		
	}// main
	
}// class

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person{
	String id;	// 식별자
	String name;
	int age;
	
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return p.id.equals(this.id);
		}
		return false;
	}
	
	
	
}