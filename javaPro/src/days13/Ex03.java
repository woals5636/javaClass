package days13;

/**
 * @author jam
 * @date 2024. 7. 17. - 오전 11:13:19
 * @subject
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		// 1. [메서드 리턴자료형	 참조형(클래스) 경우]
		Point p1 = new Point();
		System.out.println("p1의 주소값 : "+p1);
		p1.x = 10;
		p1.y = 20;
		p1.dispPoint();
		
		Point p2 = new Point();
		System.out.println("p2의 주소값 : "+p2);
		p2.x = 1;
		p2.y = 2;
		p2.dispPoint();
		
//		p1.plusPoint(p2);
//		x = x + p.x; -> (p1) x = (p1) x + (p2) x
//		y = y + p.y; -> (p1) y = (p1) y + (p2) y
//		p1.dispPoint();
		
		Point p3 = p1.plusPoint(p1, p2);
		System.out.println("p3의 주소값 : "+p3);
		p3.dispPoint();
		
//		p1.plusPoint(p1, p2).dispPoint();
//		p2.plusPoint(p1, p2).dispPoint();
		
		
		// 2. [메서드 매개변수	 참조형(클래스) 경우]
		
	}// main
}// class
