package days20;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.*;	//	Collections 자동생성 line 35~

/**
 * @author jam
 * @date 2024. 7. 26. - 오전 11:49:53
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		// Arrays 클래스 : 배열을 사용하기 쉽도록 기능이 구현된 클래스
		// int[] m = { 3, 5, 2, 4, 1 };
		// Arrays.sort(m);
		// Arrays.binarySearch(m,5);
		// Arrays.toString(m)
		// Arrays.fill(m, -1);
		// System.out.println(Arrays.toString(m));

		// Collections 클래스
		// Collections.reverseOrder()
		ArrayList<Integer> list = new ArrayList<Integer>();
		// list.add(3);
		// list.add(5);
		// list.add(2);
		// list.add(4);
		// list.add(1);
		
		addAll(list, 3,5,2,4,1);
		System.out.println(list);
		rotate(list, 2);	//	오른쪽으로 2칸씩 회전
		System.out.println(list);
		swap(list,1,4);		//	자리바꿈
		System.out.println(list);
		shuffle(list);		//	임의의 자리 변경
		System.out.println(list);
		sort(list);			//	오름차순 정렬
		System.out.println(list);
		
//		sort(list,(a,b)->b-a);		// 내림차순 정렬
		sort(list,reverseOrder());	// 내림차순 정렬
		System.out.println(list);
		
		fill(list, -1);				// 모든 값을 -1로 채운다
		System.out.println(list);
		

	}// main

}// class
