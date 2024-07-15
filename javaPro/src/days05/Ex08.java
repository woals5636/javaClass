package days05;

/**
 * @author jam
 * @date 2024. 7. 5. - 오후 4:10:30
 * @subject
 * @content
 *
 */

public class Ex08 {

	public static void main(String[] args) {

//		[ASCII 코드 값 모두 출력] + for 문 사용
//		for(int i = 0; i < 256; i++) {
//			System.out.printf("%d [%c]\n",i,i);
//		}
//		
//		 9	'\t'	tab
//		 10	'\n'	LineFeed(LF)
//		 13	'\r'	CarrageReturn(CR)

		for (int i = 0, lineNum = 1; i < 256; i++) {
			if (i % 10 == 0) {
				System.out.printf("%d : ",lineNum++);
			}
//			if (i % 10 == 0) {
//				System.out.print(i / 10 + 1 + " : ");
//			}
			System.out.printf("[%c]", i);
			if (i % 10 == 9) {
				System.out.println();
			}
		}
	}// main

}// class
