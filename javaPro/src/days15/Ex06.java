package days15;

/**
 * @author jam
 * @date 2024. 7. 19. - 오후 2:31:54
 * @subject
 * @content
 *
 */
public class Ex06 {
	
	public static void main(String[] args) {
		
		/*
		 * [final 키워드 정리]
		 * 
		 * */
		
		// final + 변수 앞에 : 상수
		final double PI = 3.141592;		
		
		FinalTest ft = new FinalTest();
		ft.test(10);
		
	}// main
	
}// class

class P{
	
	// field
	
	final int MAX_VALUE = 1; // 1)명시적 초기화
	
	final int MIN_VALUE;
	P(int minValue){	// 2)생성자 초기화
		MIN_VALUE = minValue;
	}

	final int disp() {
		return 0;
	}
	
}
class C extends P{

	C(int minValue) {
		super(minValue);
	}
	
	/*	final 메서드는 자식 클래스에서 재정의 할 수 없다
	 * @Override
	 * int disp() {
	 * 	return 100;
	 * }
	 */
}

// 1. final + class 선언 : 최종(마지막) 클래스
final class FinalTest{
	// 해당 메서드가 끝날때까지 n의 값은 상수
	void test(final int n) {
		
	}
	
}