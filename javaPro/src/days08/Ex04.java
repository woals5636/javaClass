package days08;

import java.util.Arrays;

/**
 * @author jam
 * @date 2024. 7. 10. - 오후 4:13:15
 * @subject
 * @content
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		//	[정보처리 기사 실기]
		int money = 125760;
		int count = 0;
		int share,reminder;
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
		//	화폐단위	갯수	나머지
		//	5만원	:	2개	25760
		//	1만원	:	2개	5760
		//	5천원	:	1개	760
		//	1천원	:	0개	760
		//	5백원	:	1개	260
		//	1백원	:	2개	60
		//	5십원	:	1개	10
		//	1십원	:	1개	0
		//	5원	:	0개	0
		//	1원	:	0개	0
		
	      int [] unit = { 50000, 	10000,	 5000, 	1000, 	500, 100, 50, 10, 5, 1 };
	      String [] sunit = { "5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원" };
	      
	      System.out.printf("화폐단위\t 갯수\t 나머지\n");
	      for (int i = 0; i < unit.length; i++) {
	         count = share = money / unit[i];
	         reminder = money % unit[i];
	         System.out.printf("%s\t : %d 개\t %d\n"
	               ,sunit[i], count, reminder);
	         money = reminder;
	      }
		
	}// main
}// class
