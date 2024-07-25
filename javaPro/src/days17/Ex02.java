package days17;

import java.util.Arrays;

public class Ex02 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120913

	public static void main(String[] args) {
		String[] answer = solution("abc1Addfggg4556b", 6);
		System.out.println(Arrays.toString(answer));
		
	}

	public static String[] solution(String my_str, int n) {
		int length = (int) Math.ceil((double)my_str.length()/n);	//Math.ceil : 올림
		String[] answer = new String[length];

		int my_strLength = my_str.length();
		
		int i = 0;
		for (i = 0; i < length-1; i++) {
			answer[i] = my_str.substring(i*n,(i+1)*n);
		}
		answer[i] = my_str.substring(i*n,my_strLength-1);
		
		
		/* 1. 풀이
		int beginIndex = 0;
		int endIndex = n;
		int my_strLength = my_str.length();
		
//		answer[i] = my_str.substring(i*n,(i+1)*n);
		for (int i = 0; i < length; i++) {
			beginIndex = i*n;
			endIndex = (i+1)*n;
			if(endIndex > my_strLength) {
				endIndex = my_strLength;
			}
			answer[i] = my_str.substring(beginIndex,endIndex);
		}
		*/
		return answer;
	}

}
