package days09;

import java.util.Calendar;
import java.util.Date;

/**
 * @author jam
 * @date 2024. 7. 11. - 오후 12:06:44
 * @subject
 * @content
 *
 */
public class Ex01_02 {
	public static void main(String[] args) {

		// 1. 요일
		// 2. 마지막 날짜
		// Calendar 클래스 사용

		Calendar c = Calendar.getInstance();
		c.set(2020, 5-1, 1);
		
		System.out.println(c);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		

//		
//		Date d = new Date(2022-1900,7-1,1);
//		//		The method toLocaleString() from the type Date is deprecated	훗날 없어짐 / 사용 권장하지 않음
//		d.setMonth(d.getMonth()+1);
//		d.setDate(d.getDate()-1);
//		System.out.println(d.toLocaleString());
//		
//		int lastDay = d.getDate();
//
	}// main
}// class
