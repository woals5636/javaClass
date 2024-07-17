package days13;

public class BlockTest {
	
	static double rate = 0.0;	// 명시적 초기화
	String name;
	int age;
	
	BlockTest(){
//		this.name = "익명";
		System.out.println("> 디폴트 생성자 호출됨.");
	}
	
	BlockTest(int age){
//		this.name = "익명";
		System.out.println("> 디폴트 생성자 호출됨.");
	}
	
	{
		// 인스턴스 초기화 블럭
		// - 생성자가 오버로딩 되어져 있을 경우 중복되는 초기화 코딩이 있다면 해당 중복되는 초기화 코딩을
		//	인스턴스 초기화 블럭을 선언해서 사용한다.
		System.out.println("인스턴스 초기화 블럭{}.");
		this.name = "익명";
	}
	
	static {
		// 클래스(static) 초기화 블럭
		// - 클래스 변수를 초기화 하기 위한 블럭
		// - 객체 생성과 상관없이 프로그램의 시작할 때 한번 static 초기화 블럭이 실행된다.
		// - 인스턴스 변수는 초기화 할 수 없다.
		System.out.println("클래스(static) 초기화 블럭{}.");
		
		rate = 0.04;
	}
	
	public static void main(String[] args) {

		System.out.println("1");
		BlockTest bt1 = new BlockTest();
		
		System.out.println("2");
		BlockTest bt2 = new BlockTest();
		
		System.out.println(rate);
		
		System.out.println("end");
	}// main
}// class
