package days17;

import java.util.Calendar;

/**
 * @author jam
 * @date 2024. 7. 23. - 오후 5:09:18
 * @subject
 * @content
 *
 */
public class Ex09 {
	public static void main(String[] args) {
		// jdk 1.0	java.util.Date 클래스
		//					ㄴ java.sql.Date 자식클래스
		
		// jdk 1.1	java.util.Calendar 클래스
		Calendar c = Calendar.getInstance();
		// System.out.println(c.toString());
		// 년
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(1));
		System.out.println(c.get(Calendar.YEAR));
		// 월
		System.out.println(c.get(2)+1);
		System.out.println(c.get(Calendar.MONTH)+1);
		// 일
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		// 시간
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		// 분
		System.out.println(c.get(Calendar.MINUTE));
		// 초
		System.out.println(c.get(Calendar.SECOND));
		// 밀초
		System.out.println(c.get(Calendar.MILLISECOND));
		// 요일
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		// 오전,오후
		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.AM_PM));
		// 마지막날짜
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}// main
}// class
