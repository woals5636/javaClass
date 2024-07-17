package days13;

// 저축 클래스
public class Save {

	// field
	
	// 인스턴스 변수
	private String name; // 예금주
	private long money; // 예금액
	
	// 클래스변수 , 공유(shared)변수, static(정적) 변수
	private static double rate = 0.04; // 이자율 // 명시적 초기화
	
	// constructor
	public Save() {
		super();
	}

	public Save(String name, long money, double rate) {
		super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}
	
	// 정적(static) 메서드
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		Save.rate = rate;
	}

	// 인스턴스 메서드
	// method
	public void dispSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 예금율%.2f\n",name,money,rate);
	}
	
}//class
