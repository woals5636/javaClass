package days23;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author jam
 * @date 2024. 8. 2. - 오전 11:20:23
 * @subject
 * @content
 *
 */
public class Ex12 {
	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		// Array->Stream 변환(생성)
		// Stream.of(strArr).forEach(System.out::println);
		/*
		boolean result = Stream.of(strArr).noneMatch(s -> s.length() == 0);
		System.out.println(result);
		 */

		/*
		Optional<String> o1 = Stream
								.of(strArr)
								.filter(s->s.charAt(0)=='s')
								.findFirst();
		System.out.println(o1.get());
		 */		

		// reduce()
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b)->a+1);
		System.out.println(count);	// 8 요소의 수
		
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		
		int sum = intStream2.reduce(0, (a,b)->a+b);
		System.out.println(sum);	// 58 요소 길이의 합
		
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		OptionalInt max = intStream3.reduce(Integer::max);
		System.out.println(max.getAsInt());	// 14
		
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		OptionalInt min = intStream4.reduce(Integer::min);
		System.out.println(min.getAsInt());	// 3
		

	}// main
}// class
