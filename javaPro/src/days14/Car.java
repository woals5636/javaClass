package days14;

public class Car {

	//field
	String name;
	String gearType;
	int door;
	private Engine engine;
	//Engine engine = new Engine();	// 결합력이 높은 코딩	//has-a 관계
	
	
	//constructor
	Car(){
		this.engine = new Engine();
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	// getter setter
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//method
	void speedUp(int fuel) {
		this.getEngine().moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.getEngine().lessFuel(fuel);
	}
	void stop() {
		this.getEngine().stop();
	}
}
