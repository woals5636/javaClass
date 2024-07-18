package days14;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jam
 * @date 2024. 7. 18. - 오전 10:05:44
 * @subject
 * @content
 *
 */
public class Ex01_02 {
	public static void main(String[] args) {
	      String n = "keNik";
	      String m= "kKnie";

	      // IntStream
	      n = n.toUpperCase()
	    		  .chars()
	    		  .sorted()
	    		  .collect(StringBuilder::new
	    				  , StringBuilder::appendCodePoint
	    				  , StringBuilder::append)
	    		  .toString();
	      
	      m = Stream.of(m.toLowerCase().split(""))
	    		  .sorted()
	    		  .collect(Collectors.joining());
	      
	      System.out.println(n.equals(m));
	      
	}// main
}// class
