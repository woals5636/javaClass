package days07;

public class Ex06_03 {

	public static void main(String[] args) {
		// 합 구하는 hap() 메서드 선언
		// 매개변수의 갯수 2,3,```````
		int [] m = {1,2,3,4,5,6,7,8,9,10};
		int result = hap(m);
		System.out.println(result);
		
		
	}

	private static int hap(int[] m) {
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}

}
