package days10;

import java.util.Arrays;

/**
 * @author jam
 * @date 2024. 7. 12. - 오후 3:16:24
 * @subject
 * @content
 *
 */
public class Ex04_05 {

	public static void main(String[] args) {
		// [정렬(Sort)]
		// 일정한 순서로 다시 배열하는 것.
		// 오름차순 정렬([asc]ending) 12345   a~z   ㄱ~ㅎ
		// 내림차순 정렬([desc]ending) 54321  z~a   ㅎ~ㄱ
		// [버블정렬]
		// [선택정렬]
		// 삽입정렬
		// 병합정렬
		int [] m = { 3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		//		Arrays.sort(m);
		bubbleSort(m);
//		selectionSort(m);
		System.out.println(Arrays.toString(m));


	}

	private static void selectionSort(int[] m) {
		//[3, 5, 2, 4, 1]
		// [0]
		//    [1]
		//       [2]
		//          [4][5]

		// 0-1 0-2 0-3 0-4  i=0  j=1~4
		//     1-2 1-3 1-4  i=1  j=2~4
		//         2-3 2-4  i=2  j=3~4
		//             3-4  i=3  j=4
		for (int i = 0; i < 4; i++) {
			for (int j = i+1; j <=4; j++) {
				System.out.printf("%d-%d ", i, j);
				if( m[i] > m[j]) {
					System.out.print(" change " );
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}
	}

	// [버블정렬]
	// 오름차순 정렬(asc) 12345
	private static void bubbleSort(int[] m) {
		//[3, 5, 2, 4, 1]
		// 0-1 1-2 2-3 3-4  i=0   j=3
		// 0-1 1-2 2-3      i=1   j=2
		// 0-1 1-2          i=2   j=1
		// 0-1              i=3   j=0
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 3-i; j++) {
				System.out.printf("%d-%d ", j , j+1 );
				if( m[j] > m[j+1]) {
					System.out.print(" change " );
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}


	}

}
