package days19;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author jam
 * @date 2024. 7. 25. - 오전 11:10:36
 * @subject							Collection
 * @content		List						Set						Map
 * 			1) ArrayList
 * 			2) [Vector 컬렉션 클래스]
 * 				1,2 차이점 : 멀테 스레드 안전(동기화 처리 o)
 * 
 * 
 * 
 * 
 * 	StringBuffer	멀티스레드 안전 O 동기화 O
 * 	StringBuilder	멀티스레드 안전 X 동기화 X
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		
		Vector vt = new Vector(10); 
		vt.addElement("김재민");
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("김선우");
		vt.addElement(null);
		System.out.println(vt);
		
		System.out.println(vt.size());
		System.out.println(vt.capacity());
		vt.trimToSize();
		System.out.println(vt.capacity());
//		vt.setSize(10);
//		System.out.println(vt.capacity());
		
		System.out.println(vt.get(1));
		System.out.println(vt.elementAt(1));
		
//		vt.remove(1);
//		vt.removeElementAt(1);
//		
//		vt.remove("홍길동");		// true or false
//		vt.removeElement("홍길동");
		
//		vt.clear();
//		vt.removeAllElements();
		
		vt.set(1, "XXX");
		vt.setElementAt("YYY",1);
		
		// 모든 요소 출력 : 반복자(iterator)
		// null 요소 삭제
		vt.removeIf(e->e==null);
		
		System.out.println("-".repeat(30));
		
		/*
		vt.forEach(new Consumer<String>() {

			@Override
			public void accept(String n) {
				System.out.println(n);
			}
		});
		 */		
		// vt.forEach(n->System.out.println(n));
		vt.forEach(System.out::println);	// 메서드 참조
		
		System.out.println("=".repeat(30));
		Iterator ir = vt.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		vt.firstElement();	// == vt.get(0)
		vt.lastElement();	// vt.get(vt.size()-1);
		
		int index = vt.indexOf("YYY");
		
		vt.insertElementAt("이시훈", index+1);
		
		System.out.println("=".repeat(30));
		System.out.println(vt);
		
//		Vector subVt = new Vector();
//		for (int i = 2; i <=4; i++) {
//			subVt.addElement(vt.get(i));	
//		}
		
		List subList = vt.subList(2, 5);
		System.out.println(subList);
		
		
	}// main
}// class
