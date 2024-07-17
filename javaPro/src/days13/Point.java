package days13;

public class Point {
	// field
	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {

	}

	public Point plusPoint(int temp) {
		Point p = new Point(this.x + temp , this.y + temp);
//		return p;
		return this; // 리턴값으로 사용되는 this의 3번째 용도
	}

	private void thisTest(Point p) {
		p.dispPoint();
	}
	
	// method
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}

	public void plusPoint(Point p) {

		x = x + p.x;
		y = y + p.y;
	}

	public Point plusPoint(Point p1, Point p2) {

		x = p1.x + p2.x;
		y = p1.y + p2.y;

		Point p = new Point();
		p.x = x;
		p.y = y;
		System.out.println("p의 주소값 : " + p);

		return p;
	}

}
