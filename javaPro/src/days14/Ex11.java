package days14;

/**
 * @author jam
 * @date 2024. 7. 18. - 오후 3:30:30
 * @subject
 * @content
 *
 */
public class Ex11 {
	public static void main(String[] args) {
		
		/*
		 * [4개 클래스]
		 *          Object
		 *      ↑            ↑
		 *    Temp        Employee    사원클래스( 공통적으로 가지고 있는 멤버 )
		 *                   ↑
		 *                 Regular    정규직 사원 클래스
		 *                   ↑
		 *                SalesMan    영업직 사원 클래스
		 *                
		 * [개념설명]
		 * 1. 상속
		 * 2. 오버로딩/오버라이딩
		 * 3. this / super 키워드 설명
		 * 4. 추상메서드, 추상 클래스 설명
		 * 5. 인터페이스 설명
		 * 6. 다형성 설명
		 * 7. 업캐스팅/다운캐스팅( 클래스들 간의 형변환 )
		 * 등등
		 *                
		 * lombok 설치
		 * */
		
		// 1. 사원 객체 생성해서 출력
//		Employee emp = new Employee("송세호","서울 강남구","010-1234-5678","2022.12.12");
//		emp.dispEmpInfo();
		
		// 2.
//		Regular emp2 = new Regular("전재윤","서울 양천구","010-3123-2311","2021.03.21",4000000);
//		emp2.dispEmpInfo(); // 기본급 출력 X
//		System.out.println(emp2.getPay());
		
		// 2-2. 다형성의 이해
		// 정규직은(R) 사원(E)이다.
		// [클래스 간의 형변환]
		// 업캐스팅( upcasting ) 자동 형변환
		Employee emp2 = new Regular("전재윤","서울 양천구","010-3123-2311","2021.03.21",4000000);
		emp2.dispEmpInfo();
//		System.out.println(emp2.getPay());
				
		// 다운캐스팅( downcasting ) 부모객체를 자식객체로 형 변환
		// cast 연산자를 사용해서 강제로 형변환
		Regular emp3 = (Regular) emp2;
		
		// 상속관계가 없는 클래스들 간의 형변환 불가
		// Point p = new Regular();
		
		
	}// main
}// class