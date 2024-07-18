package days14;

// 사원클래스
// 모든 사원들이 공통적으로 가지고 있을 멤버들을 선언.
public class Employee {
	
	// field
	private String name;		//사원명
	private String addr;		//주소
	private String tel;			//연락처
	private String hiredate;	//입사일자
	
	// constructor
	public Employee() {
		super();
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨");
	}
	
	// Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	// method
	// 사원들의 정보를 출력하는 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n"
				,this.name,this.addr,this.tel,this.hiredate);
	}
	
}
