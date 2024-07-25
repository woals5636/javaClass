package days18;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 12:26:24
 * @subject
 * @content
 *
 */
public class Ex03_03 {
	
	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		/*
		System.out.println(ld);	// 2024-07-24
		// 년
		// int year = ld.get(ChronoField.YEAR);
		int year = ld.getYear();
		System.out.println(year);
		// 월
		//	int month = ld.get(ChronoField.MONTH_OF_YEAR);	// 1~12
		int month = ld.getMonthValue();	// 1~12
		//	Month month = ld.getMonth();	// JANUARY FEBRUARY .... DECEMBER
		System.out.println(month);

		// 일
		// int day = ld.get(ChronoField.DAY_OF_MONTH);
		int day = ld.getDayOfMonth();
		System.out.println(day);
		// 요일
      	int dof = ld.get(ChronoField.DAY_OF_WEEK);
      	System.out.println(dof ); //  월(1) ~ 일(7)
      	//                     Date   일(0) ~ 토(6)
      	//                  Calendar  일(1) ~ 토(7)
	
      	DayOfWeek edow  = ld.getDayOfWeek();
      	System.out.println( edow ); // MONDAY
      	System.out.println( edow.getValue() ); // 1
		 */

		LocalTime lt = LocalTime.now();
		// 시간
		int hour = lt.get(ChronoField.HOUR_OF_DAY);
		System.out.println(hour);

		hour = lt.getHour();
		System.out.println(hour);

		// 분
		int m = lt.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(m);

		m = lt.getMinute();
		System.out.println(m);
		// 초
		int s = lt.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(s);

		s = lt.getSecond();
		System.out.println(s);
		// 밀리초
		int ms = lt.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(ms);

		int ns = lt.getNano();
		System.out.println(ns);
	}// main
	
}// class
