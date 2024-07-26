package days20;

import java.util.ArrayList;

/**
 * @author jam
 * @date 2024. 7. 26. - 오후 4:23:55
 * @subject
 * @content
 *
 */
public class Ex08_07 {
	public static void main(String[] args) {
		// 일반 클래스
		// ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList list = new ArrayList();
		// ArrayList<Object> list = new ArrayList<>();
		
		// 제네릭 클래스
		ArrayList<Integer> list2 = new ArrayList<>();
		
		// 원시 타입과 제네릭 타입 간의 형변환
		//	ㄴ 경고만 발생시키고 자동으로 변환해서 사용 가능하더라.
		//	ㄴ <T> 없으면 <Object> 타입으로 컴파일....되더라.. 
		
	}// main
}// class
