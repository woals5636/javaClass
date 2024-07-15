package days09;

import java.util.Arrays;

public class Ex04_02 {
	public static void main(String[] args) {
		int n = 10; // 8진수 출력
		int share, reminder;	// share : 몫	reminder : 나머지
		
		String octal = "";
		
		while(n!=0) {
			share = n / 8 ;
			reminder = n % 8;
			octal = reminder + octal;
			n = share;
		}
		System.out.print(0+octal);
	}
/*
	public static void main(String[] args) {

		int n = 10; // 8진수 출력

		int share, reminder;	// share : 몫	reminder : 나머지
		
		int []arr = new int[32];
		
		int last = arr.length-1;
		
		while(n!=0) {
			share = n / 8 ;
			reminder = n % 8;
			arr[last--]=reminder;
			n = share;
		}
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j);
			if(i%8==7) {
				System.out.print(" ");
			}
		}
		
	}// main
*/
}// class
