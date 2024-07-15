package days02;

/**
 * @author jam
 * @date 2024. 7. 2. - 오후 4:32:08
 * @subject  진법변환 설명
 * @content  자바 문자 타입
 *           char 유니코드 2byte
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		char ch = 'A';
		// 문자코드표
		// 5: 10 수업시작~

		// String  %s
		// float, double %f
		// byte, short, int, long   %d %o %x %X
		// boolean   %b  %B
		// char      %c  %C
		// 대문자
		System.out.printf("\'%c\' - %d\n", ch , (int)ch);
		System.out.printf("\'%c\' - %d\n", 'Z' , (int)'Z');
		// 소문자
		System.out.printf("\'%c\' - %d\n", 'a' , (int)'a');
		System.out.printf("\'%c\' - %d\n", 'z' , (int)'z');
		// 숫자
		System.out.printf("\'%c\' - %d\n", '0' , (int)'0');
		System.out.printf("\'%c\' - %d\n", '9' , (int)'9');
		// 한글
		System.out.printf("\'%c\' - %d\n", '가' , (int)'가');
		System.out.printf("\'%c\' - %d\n", '힣' , (int)'힣');


		char c = 'A';
		char c2 = 65;
		char c3 = 0x0041;
		char c4 = '\u0041';  // 유니코드 2바이트 문자



		// [진법 변환]
		// 63
		// 128  64 32 16    8  4 2 1
		//  0011 1111
	    //  00 111 111
		//                      077
		//  0011 1111
		//                     0x3f

	} // main

} // class
