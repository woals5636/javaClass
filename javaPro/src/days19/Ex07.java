package days19;

import java.util.HashSet;

/**
 * @author jam
 * @date 2024. 7. 25. - 오후 2:07:16
 * @subject
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		// Set -	순서가 유지되지 않는다.
		//			중복을 허용하지 않는다.
		//			HashSet 컬렉션 클래스
		//			순서 O + Set = LinkedHashSet 컬렉션 클래스 ***
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(11);
		hs.add(15);
		hs.add(10);
		
		// 순서 유지 X [9, 10, 11, 15]
		System.out.println(hs);
		
		// 중복 허용 X [9, 10, 11, 15]
		hs.add(11);
		System.out.println(hs);
		
	}// main

}// class