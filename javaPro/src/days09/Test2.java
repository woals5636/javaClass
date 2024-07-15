package days09;

import java.util.Scanner;

public class Test2 {
//1. 머니(money)를 입력받아서 각 화폐단위의 갯수를 출력하는 코딩을 하세요.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		각 화폐 1개씩일때 합 : 66666
		int money = sc.nextInt();
		int unit = 50000;
		int count = 0;
		boolean sw = false;
		
		while(unit >= 1) {
			System.out.printf("화폐단위 : %d\t", unit);
			count = money/unit;
			System.out.printf("갯수 : %d\t",count);
			money = money%unit;
			System.out.printf("잔액 : %d\t",money);
			System.out.println();
			
			if(sw==false) {
				unit /= 5;				
			}else {
				unit /= 2;	
			}
			sw = !sw;
		}
	}// main
}// class
