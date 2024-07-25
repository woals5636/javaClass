package days17;

import java.util.Date;

/**
 * @author jam
 * @date 2024. 7. 23. - 오후 4:17:44
 * @subject
 * @content
 *
 */
public class Ex08_04 {
	public static void main(String[] args) {
		// 개강일로부터 지금(현재)까지 지난 일수 계산.
		Date o = new Date(2024 - 1900, 7 - 1, 1, 9, 0, 0);
//		2024. 7. 1. 오전 9:00:00
//		System.out.println(o.toLocaleString());

		Date t = new Date();
		System.out.println(t.toLocaleString());

		long diffMs = t.getTime() - o.getTime();
//		System.out.println(diffMs + "ms");
//		System.out.println(diffMs/1000 + "s");
//		System.out.println(diffMs/1000/60 + "m");
//		System.out.println(diffMs/1000/60/60 + "h");
//		System.out.println(diffMs/1000/60/60/24 + "d");

		d_day(t,o);
		
		

	}// main

	private static void d_day(Date t, Date o) {

		long diffMs = t.getTime() - o.getTime();

		long [] tArr = {1000*60*60*24, 1000*60*60, 1000*60, 1000};
		
		for (int i = 0; i < tArr.length; i++) {
			long d = diffMs / tArr[i];
			diffMs = diffMs % tArr[i];
			System.out.println(d+"d: ");
		}
		/*
		long d = diffMs / (1000*60*60*24);
		diffMs = diffMs % (1000*60*60*24);
		System.out.println(d+"d: ");

		long h = diffMs / (1000*60*60);
		diffMs = diffMs % (1000*60*60);
		System.out.println(h+"h: ");

		long m = diffMs / (1000*60);
		diffMs = diffMs % (1000*60);
		System.out.println(m+"m: ");

		long s = diffMs / (1000);
		long ms = diffMs = diffMs % (1000);
		System.out.println(s+"s: "+ms+"ms");
		*/

	}
}// class
