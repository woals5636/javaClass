package days23;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author jam
 * @date 2024. 8. 2. - 오전 10:12:05
 * @subject
 * @content
 *
 */
public class Ex10 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] { "abc", "def", "jkl" },
				new String[] { "ABC", "GHI", "JKL" }
				);
		// new String[]{ "abc", "def", "jkl" } 요소 -> Stream<String>
		// Stream<Stream<String>> s2 =  strArrStrm.map(Arrays::stream);
		
		Stream<String> s2 = strArrStrm.flatMap(Arrays::stream);
		
		// map() -> flatmap() 차이점 이해..
		s2.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
	}// main
}// class