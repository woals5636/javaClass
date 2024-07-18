package days14;

// static import 문
//import static java.lang.Math.random;
//import static java.lang.Math.PI;
import static java.lang.Math.*;

/**
 * @author jam
 * @date 2024. 7. 18. - 오후 3:14:02
 * @subject
 * @content
 *
 */
public class Ex10 {
	public static void main(String[] args) {
		
		/*
		 * 1. 패키지(package)
		 * - 서로 관련 있는 클래스, 인터페이스들의 묶음.
		 * 2. 클래스 효율적인 관리
		 * 3. 예)
		 * 		java.io 패키지
		 * 		java.net 패키지
		 * 			:
		 * 		java.util 패키지
		 * 4. 패키지명 + 동일한 이름의 클래스
		 * 		패키지의 충돌을 막기 위해서는 도메인명을 패키지명으로 사용하면 된다.
		 * 5. 패키지명은 물리적으로 디렉토리(폴더) 새엇ㅇ
		 * 		java.io 패키지명		java 폴더
		 * 								ㄴ io 폴더 생성 
		 * 6. 자바 파일의 첫 문장에 package 패키지명;
		 * 7. 패키지명은 소문자로 작명한다.
		 * 8. 다른 패키지의 클래스를 사용할 때는 import문을 사용해서 클래스가 포함된 패키지명을 적어준다.
		 * 9. 풀네임(full name)은 패키지명.클래스명
		 * 10. import 문이 없는 경우에는 단축키 [ Ctrl + Shift + O ] 사용하면 자동으로 import문 완성
		 * 11. import java.io.*;
		 * 		ㄴ java.io 패키지 안의 모든 클래스를 import함.
		 * 	ex)		1) com.sist			- Student.class
		 * 			2) com.sist.class5		- Member.class
		 * 
		 * 			import com.sist.*;		-> import하면 2)번은 import되지 않음
		 * 
		 * 12. import java.lang.*;	컴파일러가 자동 추가
		 * */
		
		// static import문을 사용하였기 때문에 Math.을 입력하지 않아도 된다. 
		System.out.println(PI);
		System.out.println(random());
		
	}// main
}// class
