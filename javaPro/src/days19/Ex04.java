package days19;

import java.util.Stack;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [스택(Stack) 구조와 큐(Queue) 구조]
		 * LIFO     push(), pop()  ,  empty(), search()
		 *                  peek()
		 * //    	────────────┐
		   // →        C	B  A│
		   //    	────────────┘
		 *
		 *
		 * */
		Stack   s = new Stack();
		s.push("박준용");
		s.push("김준석");
		s.push("김재민");
		s.push("전재윤");
		
		//	s.iterator() X
		
//		System.out.println(s.pop());	// pop() 는 공간 및 값 모두 뺌
//		System.out.println(s.peek());	// peek() 는 공간은 남겨두고 값만 뺌
//		System.out.println(s.size());
		
//		System.out.println(s.search("김재민"));
//		System.out.println(s.indexOf("김재민"));
		
		
		while (!s.empty()) {
			System.out.println(s.pop());
		}
	}
}
