package days17;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author jam
 * @date 2024. 7. 23. - 오전 11:09:06
 * @subject
 * @content 배열의 내림차순 정렬
 *
 */
public class Ex01_02 {

	   public static void main(String[] args) {
	      Integer [] m = { 3, 5, 2, 4, 1 };
	      System.out.println( Arrays.toString( m ) );

	      //Arrays.sort(m, new 비교자());
	      /*
	      Arrays.sort(m, new Comparator<Integer>() {

	         @Override
	         public int compare(Integer o1, Integer o2) {
	             return  o2 - o1;
	         }
	      });
	      */

	      /*
	      Arrays.sort(m, (Integer o1, Integer o2)->{
	          return  o2 - o1;
	      });
	      */

	      Arrays.sort(m, (o1, o2)-> o2 - o1);
	      Arrays.sort(m, (o1, o2)-> o1.compareTo(o2));


	      System.out.println( Arrays.toString( m ) );


		/*
		 * Arrays.sort(m); // ASC(오름차순 정렬) System.out.println(Arrays.toString(m));
		 * 
		 * int[] temp = new int[m.length]; for (int i = 0; i < m.length; i++) {
		 * temp[temp.length - 1 - i] = m[i]; }
		 * 
		 * System.out.println(Arrays.toString(temp));
		 */

		/*
		 * // IntStream -> Stream<Integer> Integer [] temp =
		 * Arrays.stream(m).boxed().toArray(Integer[]::new); // m 배열을 복제하여 temp 배열 생성?
		 * Arrays.sort(temp, Collections.reverseOrder()); // sort(자료형 , 비교상대) //
		 * Collections.reverseOrder() : 역순으로 정렬
		 * System.out.println(Arrays.toString(temp));
		 */

	}// main

}// class

class 비교자 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		int a = (int) o1;
		int b = (int) o2;

		return b - a;
	}

}
