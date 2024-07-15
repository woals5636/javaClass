package days06;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 8. - 오후 12:20:14
 * @subject
 * @content
 *
 */
public class Ex04_03 {

	public static void main(String[] args) {

		// 1~100 임의의 정수 100개 중에 max , min
		int[] m = new int[100];

		int max = m[0], min = m[0];

		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 100) + 1;
			max = Math.max(max, m[i]);
			min = Math.min(min, m[i]);
		}

		// 배열의 값을 출력. Arrays 클래스 toString()
		System.out.println(Arrays.toString(m));

		System.out.printf("max=%d\n", max);
		System.out.printf("min=%d\n", min);

	}

}
