package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 12:13:10
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
//		System.out.println(ld.toString());			// 2024-07-24
		LocalDate ld2 = LocalDate.of(2024, 7, 24);	// 2024-07-24
//		System.out.println(ld2.toString());

		LocalTime lt = LocalTime.now();
//		System.out.println(lt);						//	12:16:36.316027
		LocalTime lt2 = LocalTime.of(12, 16, 32);
//		System.out.println(lt2);					//	12:16:32
		
		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt);					//	2024-07-24T12:18:23.762475600
		LocalDateTime ldt2 = LocalDateTime.of(ld,lt);
		System.out.println(ldt2);					//	2024-07-24T12:19:55.435725800
		
	}// main

}// class
