package days06;

/**
 * @author jam
 * @date 2024. 7. 8. - 오후 3:11:17
 * @subject 이름(Label)이 붙은 반복문
 * @content break 문 continue 문
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		// 구구단 2단 ~ 9단
		EXIT: for (int dan = 2; dan <= 9 ; dan++) {		
		// System.out.printf("[%d단]\n",dan);
			for (int i = 1; i <= 9 ; i++) {
				if( i == 5) {
					break /*EXIT*/;
				}
				if( i == 5) {
					continue /*EXIT*/;
				}
				System.out.printf("%d*%d=%d\t", dan, i, dan * i);
			}
			System.out.println();
		}

		/*
	      int dan = 2;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      dan = 3;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      dan = 4;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      :
	      dan = 9;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
		 */

	}// main

}// class