package days17;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jam
 * @date 2024. 7. 23. - 오후 2:36:18
 * @subject
 * @content
 *
 */
public class Ex07 {
	public static void main(String[] args) {
		/*
		 * 1. 정규 표현식(regular expression == regex)
		 *  - 미리 정의된 기호
		 *  - 문자열 속에 원하는 패턴(조건)과 일치하는 문자열을 찾아내기 위해서 사용된다.
		 *  - boolean자료형 String.matches(regex)
		 *  - java.util.regex 패키지
		 *  		ㄴ Pattern Class
		 *  		ㄴ Matcher Class
		 * 
		 * */
		
		String [] data = {
	            "bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
	                , "combat", "count", "date", "disc", "fx"
	                };
		// 1) c 문자로 시작하는 문자열 찾아서 출력
		String regex = "^c.*";	//	c로 시작하는 모든
//		String regex = "c.*";
		for (int i = 0; i < data.length; i++) {
//			if(data[i].startsWith("c")) {System.out.println(data[i]);}
			if(data[i].matches(regex)) {System.out.println(data[i]);}
			
			
		}
		
//		String regex ="c.*";
		
	      regex = "c[a-zA-Z]*";  // 'c'로 시작하고 뒤에 영문자(대소문자)가 0개 이상 오는 경우
	      regex = "c[a-zA-Z0-9]*";  // 'c'로 시작하고 뒤에 영문자(대소문자) 또는 숫자가 0개 이상 오는 경우
	      regex = "c\\w*";  // 'c'로 시작하고 뒤에 단어 문자(영문자, 숫자, 또는 밑줄)가 0개 이상 오는 경우
	      regex = "c.";  // 'c'로 시작하고 뒤에 아무 문자(줄바꿈 문자는 제외) 1개가 오는 경우
	      regex = "c\\.";  // 'c'와 실제 마침표(.)가 오는 경우
	      regex = "c[0-9]";  // 'c'로 시작하고 뒤에 숫자 1개가 오는 경우
	      regex = "c\\d";  // 'c'로 시작하고 뒤에 숫자 1개가 오는 경우 (\\d는 숫자를 의미)
	      regex = "^c.*t$";  // 'c'로 시작하고 't'로 끝나는 문자열 (중간에 어떤 문자들이 0개 이상 올 수 있음)
	      regex = "c[^0-9]";  // 'c'로 시작하고 뒤에 숫자가 아닌 문자가 오는 경우
	      regex = "c\\D";  // 'c'로 시작하고 뒤에 숫자가 아닌 문자가 오는 경우 (\\D는 숫자가 아닌 문자를 의미)
	      regex = "(b|c).{2}";  // 'b' 또는 'c'로 시작하고 뒤에 아무 문자 2개가 오는 경우
	      regex = "[bc].{2}";  // 'b' 또는 'c'로 시작하고 뒤에 아무 문자 2개가 오는 경우
	      regex = "[bcd].{2,3}";  // 'b', 'c' 또는 'd'로 시작하고 뒤에 아무 문자 2개 또는 3개가 오는 경우
	      regex = "[b-d].{2,3}";  // 'b', 'c', 'd'로 시작하고 뒤에 아무 문자 2개 또는 3개가 오는 경우
	      regex = "[A-Za-z&&[^b-d]].*";  // 'b', 'c', 'd'를 제외한 영문자(대소문자)로 시작하고 뒤에 아무 문자가 0개 이상 오는 경우
	      regex = "[A-Za-z&&[^b-d]].+";  // 'b', 'c', 'd'를 제외한 영문자(대소문자)로 시작하고 뒤에 아무 문자가 1개 이상 오는 경우
	      regex = "[A-Za-z&&[^b-d]].?";  // 'b', 'c', 'd'를 제외한 영문자(대소문자)로 시작하고 뒤에 아무 문자가 0개 또는 1개 오는 경우


	      //패턴 객체 p
	      Pattern p = Pattern.compile(regex);
	      for (int i = 0; i < data.length; i++) {
	    	  // 매쳐 객체 m
	    	  Matcher m = p.matcher(data[i]);
	    	  if (m.matches()) {
				System.out.println(data[i]);
			}
	      }
	      
	      // [문제]	비밀번호 입력 ?
	      //		비밀번호의 길이가 8~15 문자
	      //				숫자 1개 이상
	      //				소문자 1개 이상
	      //				대문자 1개 이상
	      //				특수문자 1개 이상
	      // String regex = "?????";
	      
	}// main
}// class
