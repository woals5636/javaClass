package days06;

public class Ex06_02 {
	public static void main(String [] main) {
		// 구구단 2단 ~ 9단
		for (int i = 1; i <= 9 ; i++) {		
			for (int j = 2; j <= 9 ; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j * i);
				}
			System.out.println();
			}
		}
}
