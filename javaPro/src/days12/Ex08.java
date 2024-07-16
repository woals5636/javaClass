package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 3:44:06
 * @subject	객체(클래스) 배열
 * @content	
 * 
 */
public class Ex08 {
	public static void main(String[] args) {
		// points 객체명 X, 배열명 O
		Point [] points = new Point[5000];
		
		// 클래스 배열을 사용할 때 주의할 점
		points[0] = new Point();
		
		points[0].x = 10;
		points[0].y = 10;
		points[0].dispPoint();
		
	}// main
}// class
