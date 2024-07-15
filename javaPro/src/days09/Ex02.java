package days09;

import java.util.Iterator;

/**
 * @author jam
 * @date 2024. 7. 11. - 오전 10:23:44
 * @subject 년도를 입력받아서 윤년/평년 체크
 * @content
 *
 */
public class Ex02 {
//	연도의 숫자가 100의 배수인 해(1900년, 2100년, 2200년, …)는 예외적으로 평년으로 한다.
//	단, 그 가운데 400의 배수인 해(1600년, 2000년, 2400년, …)는 윤년으로 한다.
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 2020; i++) {
			if (isLeapYear(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("1~2020 윤년 : " + count);
	}// main

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

}// class
