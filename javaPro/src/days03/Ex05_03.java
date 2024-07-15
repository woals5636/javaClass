package days03;

/**
 * @author jam
 * @date 2024. 7. 3. - 오후 3:44:30
 * @subject	비교 연산자
 * @content	>	<	>=	<=	==	!=
 * 			비교 연산의 결과는 boolean 이다. ( true / false )
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
		
//		주의할점
//		The operator ! is undefined for the argument type(s) int
//		System.out.println(i =! j);	
//		int형의 j에 !를 사용할 수 없다. 부정 연산자인 !는 참 거짓 부분만 사용 가능하다.
	}
}
