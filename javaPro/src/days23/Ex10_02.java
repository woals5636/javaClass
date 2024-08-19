package days23;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author jam
 * @date 2024. 8. 2. - 오전 10:30:58
 * @subject
 * @content
 *
 */
public class Ex10_02 {
	public static void main(String[] args) {
		String[] lineArr = {
		         "Believe or not It is true",
		         "Do or do not There is no try",
		      };
		//
		Stream<String> s = Arrays.stream(lineArr);
		s.flatMap(line -> Stream.of(line.split("\\s+")))
		.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
	}// main
}// class

/*
Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");

Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);

Stream<String> strStream = strStrmStrm
.map(s -> s.toArray(String[]::new))  
.flatMap(Arrays::stream);
strStream.map(String::toLowerCase)
.distinct()
.forEach(System.out::println);
*/