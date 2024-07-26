package days20;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author jam
 * @date 2024. 7. 26. - 오후 4:29:12
* @subject   열거형
 * @content   IO
 *            람다식과 스트림
 *
 *            X 열거자(enumeration)/반복자(iterator)
 *
 */
public class Ex09 {

	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("a", 100);
		ht.put("b", 200);
		ht.put("c", 300);

		Enumeration<Integer> ven= ht.elements();
		while (ven.hasMoreElements()) {
			Integer v =   ven.nextElement();
			System.out.println(v);
		}

		Collection<Integer> vc = ht.values();
		Iterator<Integer> ir = vc.iterator();
		while (ir.hasNext()) {
			Integer v =   ir.next();
			System.out.println( " > " + v );

		}


	} // main

} // class
