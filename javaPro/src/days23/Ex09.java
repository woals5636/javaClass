package days23;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author jam
 * @date 2024. 8. 2. - 오전 9:16:34
 * @subject
 * @content
 *
 */
public class Ex09 {
	public static void main(String[] args) {
		// Arrays.stream(null)
		Stream<Student> s = Stream.of(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
				);
		// Stream<Integer> is = s.mapToInt(Student::getTotalScore);  
		IntStream is = s.mapToInt(Student::getTotalScore);
		
		// 요역 통계량
		IntSummaryStatistics stat = is.summaryStatistics();
		// 7
		System.out.println("count = " + stat.getCount());
		// 1420
		System.out.println("sum = " + stat.getSum());
		//
		System.out.println("average = "+ stat.getAverage());
		//
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		
		
		
		/*
		s
		.sorted(
				Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder())
				)
		.forEach(System.out::println);
		 */
		
	}// main
}// class
