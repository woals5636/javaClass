package days15;

public interface Engine {
	// method
	public abstract void moreFuel(int fuel);
	void lessFuel(int fuel);
	void stop();

	static void statucMethod() {
		//
	}
	
	default void newMethod() {
		
	}
}
