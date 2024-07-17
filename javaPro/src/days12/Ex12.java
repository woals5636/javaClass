package days12;

import days13.Time;

/**
 * @author jam
 * @date 2024. 7. 17. - 오전 11:00:27
 * @subject
 * @content
 *
 */
public class Ex12 {
	public static void main(String[] args) {
		// days13.Time 접근지정자 테스트~
		Time t = new Time();
		t.hour = 9;
		
		t.privateTest();
//		t.test();
	}// main
}// class
