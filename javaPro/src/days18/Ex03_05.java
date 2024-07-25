package days18;

import java.time.LocalDate;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 2:18:07
 * @subject
 * @content
 *
 */
public class Ex03_05 {
	
	public static void main(String[] args) {
		// 날짜와 시간을 비교 : isAfter(), isBefore(), isEqual()
		
		// 홍길동의 생일 1999.1.20
		// 올해 홍길동의 생일이 지났나?
		LocalDate today = LocalDate.now();
		LocalDate h_birthday = LocalDate.of(1999, 1, 20);
		// 1999->2024 수정
		h_birthday = h_birthday.withYear(today.getYear());
		System.out.println(h_birthday);
		
		System.out.println(today.isEqual(h_birthday));
		System.out.println(today.isBefore(h_birthday));
		System.out.println(today.isAfter(h_birthday));
		
		System.out.println(today.compareTo(h_birthday));	// 0 양수 음수
		
		
	}// main
	
}// class
