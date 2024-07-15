package days02;

/**
 * @author jam
 * @date 2024. 7. 2. - 오후 2:20:48
 * @subject
 * @content
 *
 */

public class Ex04 {
	
//	String name; 멤버변수

	// main() 메서드의 매개변수인 String[] args도 지역변수이다.
	public static void main(String[] args) {
		// 변수 범위 p68
		// 문자열 타입(Type, 자료형) String
		// 숫자(실수) float(4byte), double(8byte)
		// 숫자(정수) int(4byte)

		// 나이를 저장하는 age 변수 선언
		// {} 범위(영역) 연산자
		{
			int age = 20; // local variable 지역변수
			System.out.printf("> age = %d\n", age);
		}
				
		/*
		 *  
		 * age cannot be resolved to a variable age = 20;
		 * 
		 * System.out.printf("> age = %d\n", age);
		 */
		}

}
