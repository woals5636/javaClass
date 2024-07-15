package days03;

/**
 * @author jam
 * @date 2024. 7. 3. - 오후 4:06:41
 * @subject 논리 연산자
 * @content	참/거짓
 * 1) 일반 논리 연산자
 *	ㄱ. &&	일반논리 AND 연산자
 *		true && true	-> true
 *		true && false 	-> false
 *		false && true 	-> false
 *		false && false 	-> false
 *
 *	ㄴ. ||	일반논리 OR 연산자
 *		true  || true	-> true
 *		true  || false 	-> true
 *		false || true 	-> true
 *		false || false 	-> false
 *					
 *	ㄷ.	!	부정(NOT) 연산자
 *		!참	-> 거짓
 *		!거짓	-> 참
 *
 * 2) 비트 논리 연산자
 *	ㄱ. & 비트논리 AND 연산자 
 *	ㄴ. | 비트논리 OR 연산자
 *	ㄷ. ^ XOR 연산자	eXclusive(배타적인)OR
 *	ㄹ. ~ 틸드 연산자
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		System.out.println(10 & 3);
		// 10 -> 0000 1010
		//  3 -> 0000 0110
		// & 계산
		// -------------------
		//       0000 0010	->	2
		
		System.out.println(10 | 3);
		// 10 -> 0000 1010
		//  3 -> 0000 0110
		// | 계산
		// -------------------
		//       0000 1011 ->	11
		
		System.out.println(10 ^ 3);
		// 10 -> 0000 1010
		//  3 -> 0000 0110
		// ^ 계산
		// -------------------
		//       0000 1001 ->	9
		
		System.out.println(~10);
		// 10 -> 0000 1010
		//    -> 1111 0101
		//    -> 1111 0100
		//    -> 0000 1011 ->	-11
		
		// Dead code : 아래 노란 밑줄이 그어진 코드와 같은 경우에 앞에 있는 값에 의해 이미 결과값이 정해져 있어서 뒤에 있는 연산을 할 필요는 경우
//		System.out.println(3>5 && 100>1);
//		System.out.println(3<5 && 100>1);
//		System.out.println(3<5 || 100>1);
		
		//The operator ! is undefined for the argument type(s) int
		// >(비교) 우선순위가 높다
		// System.out.println(!3>5);
		
		
	}

}

