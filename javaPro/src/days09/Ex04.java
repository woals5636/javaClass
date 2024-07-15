package days09;

import java.util.Arrays;

/**
 * @author jam
 * @date 2024. 7. 11. - 오후 2:37:09
 * @subject	정수	2진수 출력	(int)
 * @content		8진수 출력
 *				16진수 출력
 */
public class Ex04 {

	public static void main(String[] args) {
		// 10 => 00000000 00000000 00000000 00001010
		int n = 10;
		int share, reminder;
		
		int [] binarArr = new int[32];
		
		int index= binarArr.length-1; // 배열의 마지막
		while (n!=0) {
			share = n/2;
			reminder = n%2;
			binarArr[index--]=reminder;
//			System.out.printf("%d",reminder);
			n = share;
		}
		
//		System.out.println(Arrays.toString(binarArr));
		for (int i = 0; i < binarArr.length; i++) {
			System.out.printf("%d",binarArr[i]);
			
			if(i%8==7) System.out.print(" ");
		}
		System.out.println();
	}

}
