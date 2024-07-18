package days14;

/**
 * @author jam
 * @date 2024. 7. 18. - 오전 10:37:11
 * @subject
 * @content
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		/*
		 * [클래스들 간의 관계]
		 * 1. has-a 관계(포함관계)
		 * 		~은 ~을 가지다.
		 * 		A 클래스가 B라는 클래스를 포함하는 관계
		 * 		ex) Car - Engine 클래스
		 * 2. is-a 관계(상속관계)
		 * 		~은 ~ 이다.
		 * */
		Engine engine = new Engine();
		
		// 의존성 주입(DI)
		Car myCar = new Car(engine);	// 1) 생성자 주입
//		myCar.setEngine(engine);		// 2) setter 주입
		
		myCar.speedUp(10);
//		int currentSpeed = myCar.getEngine().speed; // getter
//		System.out.println("현재 속도 : "+currentSpeed);
		
		
		
	}// main
}// class
