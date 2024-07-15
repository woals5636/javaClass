package days09;

import java.util.Iterator;

public class Ex01_03 {
	
	public static void main(String[] args) {
		
		for (int year = 2020; year <= 2025; year++) {
			for (int month = 1; month <= 12; month++) {
				Ex01.printCalendar(year,month);
			}
			System.out.println("X".repeat(60));
		}
		
	}// main
}// class
