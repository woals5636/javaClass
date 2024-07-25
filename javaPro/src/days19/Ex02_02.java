package days19;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Ex02_02 {
	public static void main(String[] args) {
		
		Vector vt = new Vector(10); 
		vt.addElement("김재민");
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("김선우");
		vt.addElement(null);
		System.out.println(vt);
		
		System.out.println("-".repeat(30));
	
		vt.forEach(System.out::println);	// 메서드 참조
		
		System.out.println("=".repeat(30));
		ListIterator ir = vt.listIterator();	//	ListIterator 양방향 반복자
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println("=".repeat(30));
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
		}
		
	}// main
}
