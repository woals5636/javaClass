package days07;

public class Ex01 {

	public static void main(String[] args) {
//	(가로)
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
//	(세로)		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
		
	}

}
