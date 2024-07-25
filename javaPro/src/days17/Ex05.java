package days17;

import java.io.IOException;
import java.util.Objects;

import days12.Point;

/**
 * @author jam
 * @date 2024. 7. 23. - 오후 2:02:59
 * @subject
 * @content
 *
 */
public class Ex05 {
	public static void main(String[] args) {
		// Arrays 클래스 : toString() , sort() , binarySearch()
		// Objects 클래스 : 모든 메서드는 static
		// 					Objects.메서드()
		//					객체의 비교 또는 null 체크...에 유용
		Point p1 = null;
		// p1 체크
		if( p1 == null ) {

		}

		if(Objects.isNull(p1)) {

		}

		if( p1 != null) {

		}

		/* p1 != null 과 동일 */
		if( Objects.nonNull(p1)) {

		}

		if ( p1 == null) {
			new IOException("예외 메시지를 적고");
		}
		Point pCopy = p1;		


		Point pCopy2 = Objects.requireNonNull(p1, "예외 메시지를 적고");
		
		if ( p1 != null && p1.equals(pCopy2)) {
			
		}
		
		/* p1 != null && p1.equals(pCopy2) 과 동일 */
		if ( Objects.equals(p1, pCopy2)) {
			
		}
		
	}// main
}// class