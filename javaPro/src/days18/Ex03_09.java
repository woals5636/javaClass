package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 3:07:32
 * @subject
 * @content
 *
 */
public class Ex03_09 {
	public static void main(String[] args) {
		// Period	=	날짜 - 날짜
		// Duration	=	시간 - 시간
		
		/*
		// 수료일 - 오늘날짜 = 날짜 간격 ?
		LocalDate ed = LocalDate.of(2024, 12, 14);
		ed = ed.plusDays(1);
		LocalDate td = LocalDate.now();
		
		Period p = Period.between(td, ed);	//	(시작날 포함 , 마지막날 미포함)
		System.out.println(p);
		System.out.println(p.getYears());	//	남은 해
		System.out.println(p.getMonths());	//	남은 달
		System.out.println(p.getDays());	//	남은 일자
		*/
		
		// 18:00:00	퇴근 , 남은시간은?
		LocalTime et = LocalTime.of(18, 0);
		LocalTime tt = LocalTime.now();
		Duration d = Duration.between(tt, et);
		System.out.println(d);
		System.out.println(d.getNano());			//	남은 나노초	
		System.out.println(d.getSeconds());			//	남은 초	
		System.out.println(d.getSeconds()/60);		//	남은 분		
		System.out.println(d.getSeconds()/60/60);	//	남은 시간
		
	}// main
}// class
