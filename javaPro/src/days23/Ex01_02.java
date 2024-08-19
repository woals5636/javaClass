package days23;

import java.util.Optional;

/**
 * @author jam
 * @date 2024. 8. 2. - 오전 11:07:49
 * @subject
 * @content
 *
 */
public class Ex01_02 {
	public static void main(String[] args) {
		/*
		Optional<String> o1 = Optional.of("abcde");
		System.out.println(o1.get());
		
		Optional<Integer> o2 = o1.map(String::length);
		System.out.println(o2.get());
		*/
		
		/*
		int i = Optional
				.of("123")
				.filter(x->x.length()>0)
				.map(Integer::parseInt)
				.get();
		System.out.println(i);
		*/
		
		int i = Optional
			.of("")
			.filter(x->x.length()>0)
			.map(Integer::parseInt)
			.orElse(-1);
		System.out.println(i);
		
	}// main
}// class
