package days06;

import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 8. - 오후 12:20:14
 * @subject
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {

		// 세 정수(a,b,c) 를 입력 받아서 max, min 출력
		int a, b, c, d, e;

		Scanner sc = new Scanner(System.in);

		a = (int)(Math.random()*100)+1;	//	1<= <=100
		b = (int)(Math.random()*100)+1;
		c = (int)(Math.random()*100)+1;
		d = (int)(Math.random()*100)+1;
		e = (int)(Math.random()*100)+1;
				
		int max1 = Integer.max(Integer.max(a, b), e);
		int max2 = Integer.max(Integer.max(c, d), e);
		int max = Integer.max(max1,max2);
		
		int min1 = Integer.min(Integer.min(a, b), e);
		int min2 = Integer.min(Integer.min(c, d), e);
		int min = Integer.min(min1,min2);

		System.out.printf("a: %d b: %d c: %d d: %d e: %d\n",a,b,c,d,e);
		System.out.printf("MAX : %d MIN : %d", max, min);

		sc.close();

	}

}
