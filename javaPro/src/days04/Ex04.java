package days04;

/**
 * @author jam
 * @date 2024. 7. 4. - 오전 10:48:05
 * @subject
 * @content
 *
 */

public class Ex04 {

	public static void main(String[] args) {
		// 쉬프트(shift) 연산자 >> << >>>
		//	ㄴ 비트연산자
		//	ㄴ 물건을 이동시키다.(옮기다)
		System.out.println(10);
		System.out.println(Integer.toBinaryString(10));
		// 00000000 00000000 00000000 00001010
		System.out.println( 10 >> 2); //2
		// 00000000 00000000 00000000 00001010
		System.out.println( 10 >>> 2); // 2
		System.out.println( 10 << 2); //40
		// 000000 00000000 00000000 0000101000
		
		
	}

}
