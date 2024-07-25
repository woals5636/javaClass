package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 2:25:10
 * @subject
 * @content
 *
 */
public class Ex03_06 {
	public static void main(String[] args) {
		
		//
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		
		// LocalDateTime -> LocalDate, LocalTime 
		LocalDate d2 = dt.toLocalDate();
		LocalTime t2 = dt.toLocalTime();
		
		// LocalDate + LocalTime -> LocalDateTime
		LocalDateTime ldt2 = d.atTime(t);
		LocalDateTime ldt3 = t.atDate(d);
		
	}// main
}// class
