package days19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 25. - 오후 2:12:25
 * @subject
 * @content
 *
 */
public class Ex07_03_02 {

	public static void main(String[] args) {
		// days11.Ex05.java 로또 게임
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		gameNumber = scanner.nextInt();  // 3

		LinkedHashSet lotto = null;
		ArrayList  lottos = new ArrayList();

		for (int i = 1; i <= gameNumber; i++) {
			lotto = new LinkedHashSet();
			fillLotto(lotto);
			lottos.add(lotto);
		}

		//
		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {
			lotto = (LinkedHashSet) ir.next();
			dispLotto(lotto);
		}



	} // main

	private static void dispLotto(LinkedHashSet lotto) {

		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int num = (int) ir.next();
			System.out.printf("[%d]", num);
		}
		System.out.println();

	}

	private static void fillLotto(LinkedHashSet lotto) {
		Random rnd = new Random();
		int n ;
		while( lotto.size() < 6	) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} // while

	}

} // class


