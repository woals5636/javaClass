package days04;

/**
 * @author jam
 * @date 2024. 7. 4. - 오전 11:04:39
 * @subject
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 한 학생의 국어 점수를 저장할 변수를 선언
		 int kor;
		 
		 * 5천명 학생의 국어 점수를 저장할 변수를 선언
		 * int kor1;
		 * int kor2;
		 * .
		 * .
		 * int kor5000;
		 */
		
		/*
		 * [배열]
		 * 1. 정의? 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것
		 * 2. 배열의 선언 형식
		 * 	타입[] 변수명 = new 타입[배열크기];
		 * 	타입 변수명[] = new 타입[배열크기];
		 * 3. 참조타입
		 * int [] kors = new int[3];
		 * ㄱ. 배열 선언 부분
		 */

		int [] kors = new int[3];
		kors = new int[3];

		//                       스택(stack)
		//                      [  0x100   ]
		//                        kors
		// 동적(Heap)
		//  첨자값(index)
		//  0번째요소  1번째요소 2번째요소
		// [4b][4b][4b]
		// 시작주소값
		// 0x100

		// 배열명[첨자값]
		kors[0] = 100;
		kors[1] = 90 ;
		kors[2] = 20 ;
		System.out.println( kors[0] );
		System.out.println( kors[1] );
		System.out.println( kors[2] );


		// 배열크기?       배열명.length
		System.out.println( kors.length );
		// 배열의 가장 작은 첨자값(index) == lowerBound =  0
		// 배열의 가장 큰 첨자값(index) == upperBound =  kors.length - 1

		// [주의할 점]
		// java.lang.ArrayIndexOutOfBoundsException
		kors[3] = 99;


	}

}
