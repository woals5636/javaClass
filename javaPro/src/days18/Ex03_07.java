package days18;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 2:29:49
 * @subject
 * @content
 *
 */
public class Ex03_07 {
	public static void main(String[] args) {
		
		//	1.	이번 달의 마지막 날짜 몇 일까지?
		//		이번 달의 마지막 수요일?
		//		이번 달의 첫 번째 금요일은?
		//	with(), plus(), minus() 날짜 수정 메서드 + 계산
		
		//	2.	자주 쓰일만한 날짜 계산들을 대신해 주는 메서드를 구현해 놓은 클래스 : TemporalAdjusters
		
		/*
		LocalDate d = LocalDate.now();
		System.out.println(d);
		d = d.withDayOfMonth(1);
		System.out.println(d);		//	2024-07-01
		d = d.plusMonths(1);
		System.out.println(d);		//	2024-08-01
		d = d.minusDays(1);
		System.out.println(d);		//	2024-07-31
		int lastDay = d.getDayOfMonth();
		System.out.println(lastDay);//	31
		*/		
		
		/*
		LocalDate d =LocalDate.now();
		System.out.println(d.lengthOfMonth());
		*/
		
		// Temporal + Adjusters
		//  시간상의		조정자
		
		/*
		LocalDate d = LocalDate.now();
		d = d.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(d);
		*/

		/*
		LocalDate d = LocalDate.now();
		System.out.println(d);
		// 다음 달의 첫 날
		System.out.println(d.with(firstDayOfNextMonth()));
		// 이번 달의 첫 날
		System.out.println(d.with(firstDayOfMonth()));
		// 이번 달의 첫 번째 월요일
		System.out.println(d.with(firstInMonth(MONDAY)));

		// 지난 주 월요일
		System.out.println(d.with(previous(MONDAY)));
		System.out.println(d.with(previousOrSame(MONDAY)));
		*/
		
	}// main

}// class
