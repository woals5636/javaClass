package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 12:47:17
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		
		// String 불변
		String a = "xyz";
		String b = a.replace('y', '와');
		System.out.println(a);
		System.out.println(b);

		// java.time 핵심클래스 불변
		LocalDate ld = LocalDate.now();
		System.out.println(ld); // 2024-07-24

		ld = ld.withYear(2020);
		System.out.println(ld); // 2020-07-24

		ld = ld.with(ChronoField.YEAR, 2024);
		System.out.println(ld); // 2024-07-24

		// 월 12 수정
		ld = ld.withMonth(5);
		System.out.println(ld); // 2024-05-24
		ld = ld.with(ChronoField.MONTH_OF_YEAR, 12);
		System.out.println(ld); // 2024-12-24

		// 5달 빼기
		ld = ld.minusMonths(5);
		System.out.println(ld);

		// 5달 더하기
		ld = ld.plusMonths(5);
		System.out.println(ld);
		
		// truncatedTo()	절삭하다, 끝을 잘라내다.
		LocalTime lt = LocalTime.now();
		System.out.println(lt);	//	14:13:40.537434100

		// 시간 보다 작은 단위를 모두 절삭.
//		lt = lt.truncatedTo(ChronoUnit.HOURS);		// 14:00
		lt = lt.truncatedTo(ChronoUnit.MINUTES);	// 14:15
		System.out.println(lt);
		
		// 날짜 + 시간
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);	//	2024-07-24T14:16:49.207184
		
		ldt = ldt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(ldt);	//	2024-07-24T00:00
		
		
	}// main

}// class
