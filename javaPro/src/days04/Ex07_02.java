package days04;

/**
 * @author jam
 * @date 2024. 7. 4. - 오후 2:22:31
 * @subject	[제어문]
 * @content	1) 조건문 : if문
 * 			2) 분기문 : switch문
 * 
 * 			3) 반복문 : for문 , for-each문
 * 			4) 조건반복문 : while문 , do ~ while문
 * 			5) 기타 : break문 , continue문
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {

		int n = 11;

		if (n % 2 == 0) {
			System.out.println("짝수(even number)");
		} else{		// else -> 짝수 조건 외의 경우
			System.out.println("홀수(odd number)");		
		}
	} // main
} // class
