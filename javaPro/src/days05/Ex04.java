package days05;

public class Ex04 {
//	(1 ~ 10 홀수 합)
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i += 2) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.print(""
				+ "\n1 ~ 10까지의 홀수의 합 : " + sum);
	}
	
	
//	(1 ~ 10 짝수 합)
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 0; i <= 10; i += 2) {
//			System.out.printf("%d+", i);
//			sum += i;
//		}
//		System.out.print(""
//				+ "\n1 ~ 10까지의 짝수의 합 : " + sum);
//	}
}
