package days08;

/**
 * @author jam
 * @date 2024. 7. 10. - 오전 11:24:04
 * @subject
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) {

		// [주민등록번호] Resident registration number, RRN
		// 1. 생년월일
		// 2. 성별
		// 3. 내국인 / 외국
		// 4. 출신지역 - 개별적으로
		// 5. 나이( 만나이, 세는나이 )
		// 6. 검증
		String rrn = "940331-1234567";

		String birthday = getBirthday(rrn);
		System.out.println(birthday);

		String gender = getGender(rrn).split("/")[1]; // "1900/남/외국인"
		System.out.println(gender);


	}// main

	public static String getGender(String rrn) {
		// "1900/남/외국인"
		// "940331-1234567"
	      int gender = Integer.parseInt( rrn.substring(7, 8) );  // 1


	      char 성별 = gender%2==0 ? '여' : '남';
	      String 국적 = "내국인";
	      // [5-8]
	      if( 5 <= gender && gender <= 8 ) 국적 = "외국인";

	      int 세기 = 1800;
	      switch (gender) {
	      case 1: case 2: case 5: case 6:
	         세기 = 1900;
	         break;
	      case 3: case 4: case 7: case 8:
	            세기 = 2000;
	            break;
	      default:
	         세기 = 1800;
	         break;
	      }

	      return String.format("%d/%c/%s", 세기, 성별, 국적);
	}

	public static String getBirthday(String rrn) {
	      int year = Integer.parseInt( rrn.substring(0, 2) );  // "99"->99
	      int month = Integer.parseInt( rrn.substring(2, 4) );
	       int day = Integer.parseInt( rrn.substring(4, 6) );

	       String gender = getGender(rrn);  // "1900/남/외국인"

	       int century = Integer.parseInt( gender.split("/")[0] ) ;

	       year = century + year; // 1999

	       // "1999년 1월 23일"
	       String birthday = String.format("%d년 %d월 %d일"
	                                    , year, month, day);
	      return birthday;
	}
}// class