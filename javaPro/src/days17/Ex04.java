package days17;

import days13.Person;

/**
 * @author jam
 * @date 2024. 7. 23. - 오후 12:21:43
 * @subject
 * @content
 *
 */
public class Ex04 {
	
	public static void main(String[] args) {
		// 박싱(boxing) , 언박싱(unboxing)
		
		int i = 100;	//	Primitive type int
		// 기본형 -> 자동으로 래퍼클래스 형변환
		// 		오토 박싱(auto boxing)
		Integer j = i;	//	Reference type WrapperClass Integer
		System.out.println(j);
		
		// 래퍼클래스 -> 자동으로 기본형 형변환
		//		오토 언박싱(Auto unboxing)
		int k = j;
		
		test(1);		// int -> Integer -> Object
		test(true);		// boolean -> Integer -> Object
		test(3.14);		// double -> Integer -> Object
		test('t');		// char -> Integer -> Object
		test('t',"aaa",19,1.23,true,new Person());		// 가변인자(Object...)를 사용하여 모든 자료형이 자동 형변환
		
	}// main
	
	public static void test(Object... o) {
		//
	}
	
}// class
