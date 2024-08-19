package days23;

/**
 * @author jam
 * @date 2024. 8. 2. - 오전 10:40:34
 * @subject
 * @content
 *
 */
public class Ex11 {
	public static void main(String[] args) {
		// 최종 연산의 결과 타입이 Optional 인 경우가 있다.
		// Optional<T>	'T타입의 객체' WrapperClass이다.
		// 모든 타입의 참조변수를 저장할 수 있는 객체이다.
		
		// 1. Optional 객체 생성
		// 	1) of()			둘의 차이점 : of(null) 예외발생
		// 	2) ofNullable()					X
		
		// 2. Optional 객체로 부터 값을 얻어오는 방법
		// 	1) get()		null일 경우 예외 발생
		//	2) orElse() 	null일 경우 빈문자열""을 리턴
		//	   orElseGet()	null일 경우 빈문자열""이 아니라 다른값을 반환
		
		// 3. isPresent() : Optional 객체의 값이 null이면 false 아니면 true
		
		// Optional<T>
		// OptionalInt, OptionalLong, OptionalDouble
		// getAsInt()	getAslong()	  getAsDouble()
		
	}// main
}// class
