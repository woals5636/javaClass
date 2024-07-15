package days07;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		for (int k = 1; k <= 3; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = k*3-1; j <= k*3+1; j++) {
					if(j==10) {
						break;
					}
					System.out.printf("%d*%d=%02d\t", j, i, i * j);
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
