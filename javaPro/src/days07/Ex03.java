package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

/**
 * @author jam
 * @date 2024. 7. 9. - 오후 12:08:04
 * @subject 제어문 + 배열 활용
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {

		// 신용카드
		String card = "0000-1234-9876-5678";
		
		String regex = "-";
		String [] cardArr = card.split(regex);
		
		/*
		 * for (String c : cardArr) { System.out.println(c); }
		 */
		
		System.out.println(Arrays.toString(cardArr));
		
		Random rnd = new Random();
		int index = rnd.nextInt(4);	// 0 <= 정수 < 4
		cardArr[index] = "*".repeat(4);
		
		System.out.println(Arrays.toString(cardArr));
		
		String printCard = String.join(regex, cardArr);
		System.out.println(printCard);
		
		
		// 카드 결제 영수증
		/*
		 "0000-****-0000-0000"
		 "0000-0000-****-0000"
		 "0000-0000-0000-****"
		 "****-0000-0000-0000"
		*/
		
	}// main

}// class