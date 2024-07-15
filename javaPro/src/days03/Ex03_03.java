package days03;

/**
 * @author jam
 * @date 2024. 7. 3. - 오후 12:42:36
 * @subject 타입(형) 변환
 * @content 1) 자동 형 변환 큰 자료형 = 작은 자료형 값
 * 			2) 강제 형 변환
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {

		// 3.14 -> double형
		// float pi = 3.14; X
		// double -> float
		// (1) float pi = (float)3.14;
		// (2) float pi = 3.14F;
		
		// 자동 형 변환(1)
		int i = 100;
		int l = i;

		// 자동 형 변환(2)
		long k = l + i; // int형 i가 자동 형 변환되어 long 형으로 계산
		

		// 자동 형 변환 x
		// 강제 형 변환 - (변환하고자 하는 타입) cast 연산자 --> 사칙연산할때 우선순위를 두게 하는() 과 같은 형태이지만 의미는 다르다
		// cast 강제 형 변환
		i = (int)100L;

	}

}
