package days06;

import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 8. - 오후 12:20:14
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		// 세 정수(a,b,c) 를 입력 받아서 max, min 출력
		int a, b, c;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int max = Integer.max(Integer.max(a, b), c);

		int min = Integer.min(Integer.min(a, b), c);

		/*
		 * int max = a > b ? a : b; max = max > c ? max : c;
		 * 
		 * int min = a > b ? ( b > c? c: a): ( a > c ? c : a );
		 * 
		 * int max = Math.max(Math.max(a, b), c);
		 * 
		 * int abMin = Math.min(a, b);
		 * 
		 * int min = Math.min(c, abMin);
		 * 
		 */

		System.out.printf("MAX : %d MIN : %d", max, min);

		sc.close();

	}

}
