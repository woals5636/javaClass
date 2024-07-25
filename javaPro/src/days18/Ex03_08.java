package days18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author jam
 * @date 2024. 7. 24. - 오후 2:45:59
 * @subject
 * @content
 *
 */
public class Ex03_08 {
	
	public static void main(String[] args) {
		//
		LocalDate d = LocalDate.now();
		System.out.println(d);

		/*
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String sd = dtf.format(d);
		System.out.println(sd);
		 */
		
		String sd = "2024년 07월 24일";
//		String sd = "2024/07/24";
//		String sd = "2024.07.24";

		/*
		String sd = "2024-07-24";
		LocalDate ld = LocalDate.parse(sd);
		System.out.println(ld);
		*/
		
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate ld2 = LocalDate.parse(sd,dtf);
		System.out.println(ld2);
		
		
	}// main
	
}// class
