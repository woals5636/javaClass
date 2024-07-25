package days18;

import java.text.MessageFormat;

/**
 * @author jam
 * @date 2024. 7. 24. - 오전 11:30:39
 * @subject
 * @content
 *
 */
public class Ex02_04 {

	public static void main(String[] args) {
		// [ MessageFormat 형식화 클래스 ]
		// 데이터 -> 특정형식으로 출력.
		String name = "권맑음";
		int age = 26;
		boolean gender = true;
		double height = 178.67;
		char grade = 'A';

		// 이름:권맑음, 나이:26살, 성별:남자, 키:178.67, 등급:A 입니다.
		/*
		 * System.out.printf("이름:%s, 나이:%d살, 성별:%s, 키:%.2f, 등급:%c 입니다.\n" , name, age,
		 * gender?"남자":"여자", height, grade );
		 */
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}, 키:{3}, 등급:{4} 입니다.";
		// MessageFormat mf = new MessageFormat(pattern );
		// String s = mf.format(pattern, name, age, gender?"남자":"여자", height, grade );

		String s = MessageFormat.format(pattern, name, age, gender ? "남자" : "여자", height, grade);
		System.out.println(s);

	}// main
}// class
