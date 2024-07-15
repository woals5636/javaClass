package days04;

/**
 * @author jam
 * @date 2024. 7. 4. - 오후 3:19:21
 * @subject
 * @content
 *
 */
public class Ex07_03 {

	public static void main(String[] args) {

		int n = 10;
		String result = null;
		
		switch (n % 2) { // 변수 , 수식
		case 0:
			// System.out.println("짝수(even number)");
			result = "짝수(even number)";
			break;

		case 1:
			// System.out.println("홀수(odd number)");
			result = "홀수(odd number)";
			break;
		} // switch
		System.out.println(result);
	} // main
} // class
