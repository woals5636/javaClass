package days20;

import java.util.ArrayList;

import days13.Person;

/**
 * @author jam
 * @date 2024. 7. 26. - 오후 2:34:26
 * @subject
 * @content
 *
 */
public class Ex08 {
	public static void main(String[] args) {

		/*
		 * [ 제네릭(Generics) ]
		 * 1. jdk 1.5 - 제네릭
		 * 	  jdk 1.8 - 람다식
		 * 2. 제네릭이란?
		 * 		다양한 타입의 객체를 다루는 메서드, 컬렉션
		 * 		클래스에서 컴파일 시에 타입을 체크해 주는 기능
		 * 3. 왜 ? 객체의 타입을 컴파일 시에 체크하는 이유?
		 * 	1) 객체의 타입 안전성을 높이기 위해...
		 * 	2) 형 변환의 번거로움을 줄이기 위해...
		 * 	제네릭의 장점.
		 * 
		 * 
		 * */

		/*
		ArrayList list = new ArrayList();
		list.add(100); // int
		list.add(3.14); // double
		list.add(true); // boolean
		list.add('a'); // char
		list.add("name"); // String
		list.add(new Person()); // 

		int i =  (int) list.get(0);
		double d =  (double) list.get(1);
		boolean b = (boolean) list.get(2);
		Person p = (Person) list.get(5);
		*/

		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("관리자");

		// list.add(100);

		String name = list.get(0);


	}// main
}// class
