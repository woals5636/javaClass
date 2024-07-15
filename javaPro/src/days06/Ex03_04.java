package days06;

import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 8. - 오전 11:23:26
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {

		int kor;

		Scanner sc = new Scanner(System.in);
		String strKor; // "0" ~ "100"
		//		String regex = "\\d{1,3}";	//	1자리 숫자 ~ 3자리 숫자
		String regex = "\\d{1,2}|100";	// 1자리 숫자 ~ 2자리 숫자 , 100
		//		[0-9][0-9][0-9]	// 3자리 숫자
		//		\\d\\d\\d	// 3자리 숫자
		//		\\d{3}	// 3자리 숫자
		//		\\d*	// 3자리 숫자
		//		{n,m}	// 1~3자리 숫자
		int failCount = 0;
		do {
			if ( failCount != 0 ) {
				System.out.printf("[%d]번 실패!!!\n", failCount);
				if( failCount == 3 ) {
					System.out.println("> 오늘은 그만 하자 <");
					return ;
				}
			} // if

			System.out.printf("국어 점수 입력 ? ");
			strKor = sc.next();
			failCount++;
		} while (  !strKor.matches(regex) );

		kor = Integer.parseInt(strKor);

		System.out.println(   kor );


	} // main

} // class
