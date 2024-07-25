package days18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 3:31:01
 * @subject
 * @content
 *
 */
public class Ex04_02 {
	public static void main(String[] args) {
		
		// 배열(array) 단점
		
		/*
		int [] m = {1,2,3};
		System.out.println(m.length);
		// 100 추가 append()
		// m[3] = 100;
		//	1 인덱스 2 삭제 remove()
		*/
		
		// <E> 제네릭 클래스 Element == 요소
		//ArrayList list = new ArrayList(10);
		ArrayList list = new ArrayList(3);
		System.out.println(list.size());
		list.add("이시훈");
		list.add("원충희");
		list.add("김준석");
		System.out.println(list.toString());
		System.out.println(list);
		System.out.println(list.size());
		list.add("송세호");
		System.out.println(list);
		
		System.out.println(list.contains("원충희"));
		
		list.add("원충희");
		
		System.out.println(list.indexOf("원충희"));
		System.out.println(list.lastIndexOf("원충희"));
		
		// 3 인덱스 요소의 값 얻어와서 출력.
		// 배열명[3]
//		list.clear();	// 모든 요소(element) 삭제
//		System.out.println(list);
		list.set(1, "전재윤");
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		// 원충희를 찾아서 삭제..
		int index = list.indexOf("원충희");
//		list.remove(index);
//		list.remove("원충희");
		// <E> Element
		// <T> Type
		/*
		list.removeIf(new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.equals("원충희");
			}
		});
		*/
//		list.removeIf((t)-> t.equals("원충희"));
//		System.out.println(list);
		
		// System.out.println(list.isEmpty());
		/*
		list.sort( new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
//		list.sort((o1,o2)->o2.compareTo(o1));
//		list.sort(Comparator.reverseOrder());
//		System.out.println(list);
		
		// list의 모든 요소를 출력
		// list.get(index);
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		// iterator == 반복자
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		
	}// main
}// class
