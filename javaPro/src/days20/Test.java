package days20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("몇 게임 하실 ? ");
		int gameTry = sc.nextInt();
		int count = 1;
		HashSet<Integer> lotto = new HashSet<Integer>();
		ArrayList<HashSet> lottos = new ArrayList<HashSet>();

		for (int i = 1; i <= gameTry; i++) {
			lotto = new HashSet<Integer>();
			fillLotto(lotto);
			lottos.add(lotto);
		}

		Iterator<HashSet> ir = lottos.iterator();
		while (ir.hasNext()) {
			System.out.printf("%d게임 : ", count++);
			lotto = (HashSet) ir.next();
			dispLotto(lotto);
		}

	}// main

	private static void dispLotto(HashSet<Integer> lotto) {
		Iterator<Integer> ir = lotto.iterator();

		while (ir.hasNext()) {
			int num = (int) ir.next();
			System.out.printf("[%02d]", num);
		}
		System.out.println();
	} // HashSet 객체에 저장된 임의의 값 6개를 출력하는 메서드

	private static void fillLotto(HashSet<Integer> lotto) {
		Random rnd = new Random();
		int n;
		while (lotto.size() < 6) {
			n = rnd.nextInt(45) + 1;
			lotto.add(n);
		} // while
	} // HashSet 객체에 임의의 값 6개를 채우는 메서드
}// class
