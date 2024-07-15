package days02;

/**
 * @author jam
 * @date 2024. 7. 2. - 오후 12:25:15
 * @subject 자바 표준 출력 함수
 * @content println(), print(), printf()
 *
 */

public class Ex03_02 {

	public static void main(String[] args) {
		// 이름 변수 선언
		String name;
		// 키를 저장할 변수 선언
		double height;

		name = "김재민";
		height = 185.23;

		// [출력형식]
		// 이름은 "이창익", 키는 185.23cm 이다.
		// + -> 문자열 연결 연산자
		System.out.println("이름은 \"" + name + "\", 키는 " + height + "cm 이다.");
		// \-> escape 문자
		System.out.printf("이름은 \"%s\", 키는 %.2fcm 이다.",name,height);
		//출력형식이 있는 겨우 출력하는 메서드 : printf() -> format(형식)
	}

}
