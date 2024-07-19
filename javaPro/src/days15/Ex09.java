package days15;

public class Ex09 {
	public static void main(String[] args) {
		// 클래스 간의 관계
		// 1) has-a 관계 : Engine, Car
		// 2) is-a 관계 :
		
		// HEngine
		Engine hEngine = new HEngine();
		Car c1 = new Car(hEngine);
		
		// KEngine
		Engine kEngine = new HEngine();
		Car c50001 = new Car(kEngine);
		
		Engine sEngine = new SEngine();
		c50001.setEngine(sEngine);
	}
}
