package days08;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * @author jam
 * @date 2024. 7. 10. - 오전 11:24:04
 * @subject
 * @content
 *
 */
public class Ex03_02 {
	public static void main(String[] args) {

		// [주민등록번호] Resident registration number, RRN
		// 5. 나이( 만나이, 세는나이 )
		String rrn = "940331-1234567";

		// 한국식 나이 = 올해년도 - 출생년도 + 1
		// 만 나이 =(생일지나면) 올해년도 - 출생년도 or (생일 안지나면) 올해년도 - 출생년도 - 1

		int koreaAge = getKoreaAge(rrn); // 한국식 나이
		System.out.printf("> 한국식(세는) 나이 : %d 살.\n",koreaAge);
		int americanAge = getAmericanAge(rrn); // 만 나이
		System.out.printf("> 만 나이 : %d 살.\n",americanAge);
		
		
		
	}// main

	// 연 나이
	private static int getYearAge(String rrn) {
		int birthYear = Integer.parseInt(Ex03.getBirthday(rrn).substring(0, 4));

		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
		return thisYear - birthYear;
	}

	// 세는 나이(한국 나이)
	private static int getKoreaAge(String rrn) {

		return getYearAge(rrn)+1;
	}

	// 만 나이
//	private static int getAmericanAge(String rrn) {
//	      int americanAge = getYearAge(rrn);
//	      // 오늘 날짜가 생일 날짜 지나지 않았다면  -1
//	      int thisMonth = 7, thisDay = 10;
//	      int birthMonth, birthDay;
//	      birthMonth = Integer.parseInt( rrn.substring(2, 4) );
//	      birthDay = Integer.parseInt( rrn.substring(4, 6) );
//
//	      if( !(thisMonth >= birthMonth && thisDay >= birthDay ) ) {
//	         americanAge--;
//	      }
//	      return americanAge;
//	   }
	
	private static int getAmericanAge(String rrn) {
		int americanAge = getYearAge(rrn);
		// 오늘 날짜가 생일 날짜 지나지 않았다면 -1
		Calendar cal = Calendar.getInstance();
		int thisMonth = cal.get(Calendar.MONTH)+1;	//	Calendar.MONTH 은 0부터 시작하기 때문에 +1
		int thisDay = cal.get(Calendar.DATE);
		int thisMD = thisMonth*100 + thisDay;
		
		int birthMD = Integer.parseInt(rrn.substring(2, 6));
	
		if(!(thisMD-birthMD>=0)) {
			americanAge--;
		}
		
		return americanAge;
	}

}// class