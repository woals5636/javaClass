package days13;

public class Point2 {
	private int x;
	private int y;

	// 생성자를 선언하면 자동으로 생성되는 생성자가 선언되지 않는다. 때문에 2개의 인자로 선언한 생성자 외에 인자값이 없는 생성자도 선언해주어야 한다.
	
	//	constructor
	public Point2() {
	}
	
	//	constructor
	public Point2(int a, int b) {
		// 필드 초기화
		x = a;
		y = b;
	}
	
	// getter setter   단축키 Alt + Shift + S
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n",x,y);
	}

	public void plusPoint(Point2 p) {
		
		x = x + p.x;
		y = y + p.y;
	}
	
	public Point2 plusPoint(Point2 p1, Point2 p2) {
		
		x = p1.x + p2.x;
		y = p1.y + p2.y;
		
		Point2 p = new Point2();
		p.x = x;
		p.y = y;
		System.out.println("p의 주소값 : " + p);
		
		return p;
	}
	
}
