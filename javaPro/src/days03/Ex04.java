package days03;

import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 3. - 오후 3:06:08
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		/* 단축키
		 * tab 들여쓰기
		 * shift+tab 내어쓰기
		 * Ctrl+A 전체선택
		 * Ctrl+I 정렬?
		 */
		
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
	}
}
