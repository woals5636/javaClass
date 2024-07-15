package days06;

import java.util.Random;

/**
 * @author jam
 * @date 2024. 7. 8. - 오후 2:09:45
 * @subject
 * @content
 *
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// Chapter 16. 람다식
		// Chapter 17. 스트림 요소 처리
		//				1 <= < 101
		// 아래 한 줄 암기
		int [] m = new Random().ints(1,101).limit(10).toArray();
		
		//			IntStream								OptionalInt
		int max = new Random().ints(1,101).limit(10).max().getAsInt();
		System.out.println(max);
		
		// 0~100 국어점수 Math.random()
		// 1~45 로또번호 Math.random()
		
		// java.util.Random 클래스
		//	Random rnd = new Random();
		// rnd.nextInt(int bound);	0 <=  < bound
		//	int kor = rnd.nextInt(101);
		//	int lotto = rnd.nextInt(45)+1;
		//	rnd.nextBoolean()	true or false 무작위
		//	rnd.nextInt()	-21억 ~ +21억 무작위
		//	rnd.nextLong()	-900경 ~ +900경 무작위
		
	}

}
