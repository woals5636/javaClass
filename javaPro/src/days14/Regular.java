package days14;

public class Regular extends Employee{
	
	// Object 상속
	// Employee 상속 : name, addr, tel, hiredate, method..
	private int basePay;	// 기본급

	public Regular() {
		super();
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}

	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		super(name, addr, tel, hiredate);
//		this.name = name;
//		this.addr = addr;
//		this.tel = tel;
//		this.hiredate = hiredate;
		this.basePay = basePay;
		
		System.out.println("> Regular 5 생성자 호출됨.");
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	
	public int getPay() {
		return this.basePay;
	}
	
}
