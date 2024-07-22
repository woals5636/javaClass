package days16;

import java.util.StringTokenizer;

/**
 * @author jam
 * @date 2024. 7. 22. - 오후 5:25:16
 * @subject
 * @content
 *
 */
public class Ex08 {
	public static void main(String[] args) {
		// StringTokenizer
		String s = "이시훈, 원충희, 김준석, 송세호";
		String regex = "\\s*,\\s*";
		String [] names = s.split(regex);
		
		/* split() 권장~
		for (String name : names) {
			System.out.println(name);
		}
		*/
		s = s.replace(" ", "");
		System.out.println(s);
		StringTokenizer st = new StringTokenizer(s,",");
		
//		st.hasMoreTokens();	st.nextToken();
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		}
		
	}// main
}// class
