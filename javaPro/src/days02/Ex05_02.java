package days02;

/**
 * @author jam
 * @date 2024. 7. 2. - 오후 3:24:28
 * @subject 논리형 boolean
 * @content
 *
 */

public class Ex05_02 {
	public static void main(String[] args) {

		// 남자, 여자 성별을 나타내는 변수 선언
		//  true   false
		//   1       0
		// "male" "female"
		boolean gender = true;
		
		System.out.printf("성별=%B\n",gender);
				
		int x = 10;
		System.out.printf("%d\n",x); // 10진법
		System.out.printf("%o\n",x); // 8진법
		System.out.printf("%x\n",x); // 16진법
		
		System.out.printf("%1$d %1$o %1$x",x);
		
	}
}
