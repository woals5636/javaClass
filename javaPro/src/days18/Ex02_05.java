package days18;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author jam
 * @date 2024. 7. 24. - 오전 11:40:59
 * @subject
 * @content
 *
 */
public class Ex02_05 {
	public static void main(String[] args) throws ParseException {
	      
	      String output = "이름:권맑음, 나이:26살, 성별:남자, 키:178.67 입니다.";
	      String pattern = "이름:{0}, 나이:{1}, 성별:{2}, 키:{3} 입니다.";
	      MessageFormat mf = new MessageFormat(pattern);
	      Object [] objs = mf.parse(output);
	      for (Object v : objs) {
	    	  System.out.println(v);
		}
		
	}// main
}// class
