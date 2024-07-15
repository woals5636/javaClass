package days06;

import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 8. - 오전 11:04:34
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
//		if ( one == '#' || one == '@' || one == '$' || one == '!' ) {}
		
		// 정규 표현식(REGEX)	유효성 검사. regular expression
//		boolean String.matches(String regexp);
		
		char one;
		String strOne;
		Scanner sc = new Scanner(System.in);
		System.out.print("한 문자 입력 ? ");
		strOne = sc.next();
		
//		 String regex = "[!@#$%^]";
//		 String regex = "[0123456789]";
//		 String regex = "[0-9]";
		 String regex = "[\\d]";
//		 String regex = "[A-Z]";
//		 String regex = "[A-Za-z]";
//		 String regex = "[가-힣]";
		 
		 System.out.println(strOne.matches(regex));
		
	}

}
