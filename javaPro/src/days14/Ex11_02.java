package days14;

public class Ex11_02 {

	public static void main(String[] args) {
		/*
		 * Employee emp = new Employee();
		 * Regular emp2 = (Regular)emp;
		 * // 업캐스팅된 부모객체만이 다운캐스팅이 가능하다.
		 */

		Regular emp = new Regular();
		test(emp);

		Employee emp2 = new Employee();
		test(emp2);
	}

	public static void test(Employee emp) {
		
	}
}