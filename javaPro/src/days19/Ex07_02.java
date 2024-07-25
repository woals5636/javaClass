package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author jam
 * @date 2024. 7. 25. - 오후 2:12:25
 * @subject
 * @content
 *
 */
public class Ex07_02 {
	public static void main(String[] args) {
		// days11.Ex05.java 로또게임
		HashSet lotto = new HashSet();
		
		fillLotto(lotto);
		dispLotto(lotto);
	}// main

	private static void dispLotto(HashSet lotto) {
		
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int num = (int) ir.next();
			System.out.printf("[%d]",num);
		}
		System.out.println();
	}
	
	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n;
		while (lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		}//while
	}
	
	
}// class
