package days09;

/**
 * @author jam
 * @date 2024. 7. 11. - 오후 12:30:56
 * @subject	재귀함수(	recursive function	)
 * @content	순환, 되풀이되는, 재귀하는
 * 			함수 안에서 자기 자신을 다시 호출하는 함수를 "재귀 함수"라고 한다.
 *
 */
public class Ex03 {
	
	public static void main(String[] args) {
		
		disp();
		
		
	}// main

	private static void disp() {
		System.out.println(" disp() . . .");
		disp();
	}
}// class
