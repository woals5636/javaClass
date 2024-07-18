package days14;

/**
 * @author jam
 * @date 2024. 7. 18. - 오후 2:08:11
 * @subject
 * @content
 *
 */
public class Ex08 {
	public static void main(String[] args) {

		/*
		 *         [상속 계층도]
		 *           Object
		 *   ↑                    ↑
		 * Point				Shape
		 * Ex03.java              ↑ 
		 *                     Circle, Triangle
		 * 
		 * 
		 * */
		
		// Point p = new Point(1,2);
		
		
	}// main
}// class

class Shape{
	
	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s]\n",this.color);
	}
	
	void 면적계산() {
		
	}
} // Shape

class Circle extends Shape{
	// 원점 , 반지름
	Point center; // has-a 관계
	int r; // radius 반지름
	
	Circle(){
		this(0,0,0);
	}
	Circle(int x, int y, int r){
		this.center = new Point(x,y);
		this.r = r;
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	@Override
	// 오버라이딩을 할때 접근지정자를 제외한 모든 프로토타입은 변경할 수 없다.
	// 접근지정자는 부모클래스의 접근지정자보다 넓은 범위는 가능하지만 좁은 범위는 불가능하다.
	void 면적계산() {
		// 반지름 * 반지름 * 3.14
	}
	
	
}

class Triangle extends Shape{
	
	Point[] p = null;
	
	public Triangle(Point [] p) {	// 생성자 DI(의존성 주입)
		this.p = p;
	}

	@Override
	void 면적계산() {
		// 가로 * 세로 * 0.5
	}
	
}