package days10;

import java.util.Arrays;

public class Ex04_03 {

	public static void main(String[] args) {
		// 배열 복사
		int [] m = { 3,5,2,4,1 };
		System.out.println(Arrays.toString(m));

		int [] temp = new int[m.length+5];
/*
		// 1->5
		// 2->6
		// 3->7
		for (int i = 1; i < 4; i++) {
			temp[i+4] = m[i];
		}
*/
//		System.arraycopy(m, 1, temp, 5, 3);

		System.arraycopy(m, 1, temp, 5, 3);
		System.out.println( Arrays.toString(temp));

	}

}
