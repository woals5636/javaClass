package days06;

import java.io.IOException;

/**
 * @author jam
 * @date 2024. 7. 8. - 오전 9:32:39
 * @subject
 * @content
 *
 */

public class Ex01 {

	/*
	 
	 1. ASCII 한 줄에 10개씩 출력( 라인번호 붙이기 )
	  
	 public static void main(String[] args) {

		for(int ascii = 0,lineNum = 1; ascii < 256; ascii++) {
			if(ascii%10==0) {
				System.out.printf("%d : ",lineNum++);
			}
			System.out.printf("%c",ascii);
			if(ascii%10==9) {
				System.out.println();
			}
		}
	}
	
	2. Math.random() 메서드를 사용해서 
	1) 임의의 국어점수(0~100)을 발생하는 코딩하기
	
	public static void main(String[] args) {
		double kor = Math.random();
		
		System.out.printf("국어점수 : %d",(int)(kor*101));
		
	}
	
	2) 임의의 로또 번호(1~45)를 발생하는 코딩하기
	public static void main(String[] args) {
		double lotto = Math.random();
		
		System.out.printf("로또번호 : %d",(int)(lotto*45+1));
		
	}
	
	3) 임의의 정수(45~87)를 발생하는 코딩하기
	public static void main(String[] args) {
		double ran = Math.random();
		
		System.out.printf("로또번호 : %d",(int)(ran);
		
	}
	 */

	public static void main(String[] args) throws IOException {
		// 한 문자를 입력받아서 출력
		// BufferedReader, Scanner 클래스 "A" -> charAt() -> 'A'
		// System.in
		char one;
		System.out.print("> 한 문자 입력 ?");
//		int nextByte = System.in.read();
//		System.out.println(nextByte); // 'A' 65
		one = (char)System.in.read();
		System.out.println(one);
		
		System.in.read();	// 13
		System.in.read();	// 10
		// '\r'(13) '\n'(10) -> 건너뛰기
		System.in.skip(System.in.available());
		// 입력 받은 자료형만 출력		ex) one 에 abcde 입력시 a만 출력하고 bcde는 무시
		
		System.out.print("> 한 문자 입력 ?");
		one = (char)System.in.read();
		System.out.println(one);
		
	}
	
}

