package days14;

/**
 * @author jam
 * @date 2024. 7. 18. - 오후 12:28:32
 * @subject
 * @content
 *
 */
public class Ex07 {
	public static void main(String[] args) {
		//단일 상속(single inheritance)
		//다중 상속(multiple inheritance)
		// ㄴ 자바는 다중 상속을 지원하지 않는다.
	}// main
}// class


class Tv{
	boolean power;
	
}

class VCR{	//	비디오 카세트 레코드
	boolean power;
}

// Tv+ VCR
//class TVCR extends Tv,VCR{
//	
//}
// 다중상속을 지원하지 않기 때문에 인터페이스를 사용해서 다중상속을 구현하도록 한다.