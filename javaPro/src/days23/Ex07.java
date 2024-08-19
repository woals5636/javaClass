package days23;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author jam
 * @date 2024. 8. 2. - 오전 9:16:34
 * @subject
 * @content
 *
 */
public class Ex07 {
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
		
		s
		.sorted(
				Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder())
				)
		.forEach(System.out::println);
		
	}// main
}// class

