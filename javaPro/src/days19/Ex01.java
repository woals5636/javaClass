package days19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jam
 * @date 2024. 7. 25. - 오전 10:05:23
 * @subject
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		solution("abc1Addfggg4556b", 6);
	} // main

	public static String[] solution(String my_str, int n) {
		ArrayList list = new ArrayList();

		int i = 0;
		String str = null;
		try {
			while (true) {
				str = my_str.substring(i * n, (i + 1) * n);
				System.out.println(i + " : " + str);
				list.add(str);
				i++;
			} // while
		} catch (StringIndexOutOfBoundsException e) {
			str = my_str.substring(i * n);
			if(str.length()!=0) {
				System.out.println(i + " : " + str);
				list.add(str);
			}
		}

		// 1) String[] -> ArrayList 변환(검색)
		
		// 2) ArrayList -> String [] 변환
		
		String[] answer = (String[])list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

} // class
