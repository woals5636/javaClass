package days03;

import java.util.Scanner;

public class Ex05_05 {

	public static void main(String[] args) {
		/* 대입연산자 =
	      int x = 100;
	      int y = x;
		 */

		// [부호연산자]
		// +3      -3
		// int x = +3 + 4;

		// -3*-1

		// [증감연산자]
		// [쉬프트연산자]
		// [복합대입연산자]
		// [삼항연산자 == 조건연산자]
		// [instanceof 비교연산자] X

		// 우선순위 기억 : & > ^ > | >  &&   > ||
		// 3 + 4 + 5 + 7          ->
		/*
	      int x = 10;
	      int y = 10;
	      int z = 10;

	      int x = 10, y = 10, z = 10;

	      int x, y, z;
	      // <-----
	      x=y=z=10;
		 */
		// p87
		/*
	      int apple = 1;
	      double pieceUit = 0.1;
	      int number = 7;
	      //                 1 - 7 * 0.1
	      double result = apple - number * pieceUit;
	      System.out.println("사과 1개에서 남은 양 : " + result);
		 */

		// 두 문자열을 비교할 때는   == 		   !=     비교 연사자를 사용하지마라
		//					equals()	!equals()

		String n1 = "jam", n2;

		Scanner scanner = new Scanner(System.in);

		System.out.print("> n2 입력 ? ");
		n2 = scanner.next();

		System.out.println( n1 == n2 );  // false
		System.out.println( n1.equals(n2) ); // 정확하게 같은 경우에는 true / 대소문자가 다른 경우에는 false
		System.out.println( n1.equalsIgnoreCase(n2) ); // 대소문자 구분없이 true

		System.out.println( n1 != n2 );  // true
		System.out.println( !n1.equals(n2) ); // true
		System.out.println( !n1.equalsIgnoreCase(n2) ); // false
		
		scanner.close();
	}
}
