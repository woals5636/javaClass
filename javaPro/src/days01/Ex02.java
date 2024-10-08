package days01;

// Alt + Shift + J	

/**
 * @author jam
 * @date 2024. 7. 1. - 오후 4:11:41
 * @subject 수업 1일차 3번째 예제
 * @content 자바 프로그램의 기본 구조 설명
 *                자바 클래스 선언 형식 설명
 *                자바 메소드(함수) 선언 형식 설명
 *                
 */

/* 이클립스 단축키
 * Alt + Shift + J 타입에 맞는 도큐먼트 주석
 * Ctrl + Shift + L 단축키 리스트
 * */


public class Ex02 {
	
	// 1) 기능 : 프로그램의 시작/종료 기능
	// 2) 매개변수 : String[] args X
	// 3) 리턴값은 없기 때문에 void
	
	public static void main(String[] args) {
		/*
		  [1. 자바 프로그램의 기본 구조 설명]
		  1) 프로그램을 시작하는 물건(객체, 개체) 필요하다.
		   = 시작 개체
		   2) 프로그램을 시작하는 기능(메소드,함수)이 구현되어 있어야 한다.
		    = main() 메소드(method)
		    
		    [2. 자바 클래스 선언 형식 설명]  *암기
		    [접근지정자] [기타제어자] class 클래스명{
		    	// {} 클래스 몸체, 블럭, 영역
		    }
		    
		    접근지정자 + 기타제어자 -> modifier
		    
		    [3. 자바 메소드(함수) 선언 형식 설명]
		    [접근지정자] [기타제어자] 리턴자료형 main 메서드명 ([매개변수...]){
		    	// 메소드 영역
		    	[return 리턴값;]
		    }
		    
		    
		    ***** 메소드(기능, 일) 3가지 파악 ******
		    1) 기능(일) 파악
		    2) 매개변수 파악
		    3) 리턴값 (리턴자료형) 파악
		 */
		
		System.out.println("김재민");
		
	}

}
