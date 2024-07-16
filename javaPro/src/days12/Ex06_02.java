package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 3:25:48
 * @subject 얕은 복제
 * @content 깊은 복제
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 객체(클래스) 복제(Clone)
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		p1.dispPoint(); // > x=10, y=20
		System.out.println("p1 주소값 : " + p1);
		p1.m = new int[2];
		p1.m[0]=1;
		p1.m[1]=2;

		// 객체 복사
		Point p2 = p1;
		p2.dispPoint(); // > x=10, y=20
		System.out.println("p2 주소값 : " + p2);

		// 객체 복제
		Point p3 = new Point();
		p3.x = p1.x;
		p3.y = p1.y;
		p3.dispPoint();
		System.out.println("p3 주소값 : " + p3);
		// 얕은 복제
		p3.m = p1.m;
		// 깊은 복제
		p3.m = new int[2];
		p3.m[0] = p1.m[0];
		p3.m[1] = p1.m[1];

	}
}
