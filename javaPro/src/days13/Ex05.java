package days13;

/**
 * @author jam
 * @date 2024. 7. 17. - 오후 12:34:22
 * @subject [생성자(constructor)]
 * @content	1. 일종의 메서드이다.
 * 			2. 메서드명 == 클래스명
 * 			3. 리턴자료형 없음
 *			4. 역할 : 필드 초기화
 *			5. 호출시기 :	인위적으로 호출 불가
 *						객체 생성할 때 자동으로 호출
 *						new 클래스명();
 *			6. 오버로딩 가능
 *			7. 디폴트 생성자( default constructor ) : 매개변수가 없는 생성자
 *			8. 생성자는 상속되지 않는다.
 *			9. 생성자는 접근지정자 사용가능 , 기타제어자 사용불가
 *			10. 컴파일러에 의해서 생성자가 1개도 없는 경우에 자동으로 디폴트 생성자를 생성한다.
 */
public class Ex05 {
	
	public Ex05() {
		
	}
	
	public Ex05(String msg) {
		
	}

	public static void main(String[] args) {
		// 객체(클래스) 배열
		Point2[]points = {
				new Point2(10,20),
				new Point2(1,2)
		};


//		Point2 p1 = new Point2(10,20	);
//		p1.dispPoint();
//
//		Point2 p2 = new Point2(1,2	);
//		p2.dispPoint();
//
//		p1.plusPoint(p2);		

	}// main
}// class
