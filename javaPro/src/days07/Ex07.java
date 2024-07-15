package days07;

import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		// [로또6/45게임]
		// 1 ~ 45

//		0.0	 <= double Math.random() < 1.0		* 45
//		0.0	 <= double Math.random() < 45.0		int 강제 변환
//		0	 <= (int) Math.random() < 45		+1
//		1	 <= (int) Math.random() < 46
		
//		Random rnd = new Random();
//		rnd.nextInt(45) + 1 ;

		int lottoNumber;

		int [] lotto = new int [6];
		/*
		 for (int i = 1; i <= 6; i++) {
		 	lottoNumber = (int)(Math.random()*45)+1;
		 	System.out.printf("[%d]",lottoNumber);
		 }
		 System.out.println();
		 */

		fillLotto(lotto);

		dispLotto(lotto);


	}// main

	public static void fillLotto(int[] lotto) {
		int lottoNumber;
		 for (int i = 0; i < 6; i++) {
			 	lottoNumber = (int)(Math.random()*45)+1;
			 	lotto [i] = lottoNumber;
			 }
	}

	public static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

}// class