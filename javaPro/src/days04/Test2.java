package days04;

import java.util.Scanner;
// 두 정수(n,m) 을 입력받아서 두 정수 사이의 합을 출력(for문, while문)
public class Test2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 System.out.println("두 정수를 입력하세요");
		 
		 System.out.print("정수 n : ");
		 int n = sc.nextInt();

		 System.out.print("정수 m : ");
		 int m = sc.nextInt();

		 int sum = 0;
		 
		 if(n<m) {
			for(;n<=m;n++) {
				sum+=n;
			}
		 }else if(n>m){
			 for(;m<=n;m++) {
					sum+=m;
				}
		 }else if(n==m){
			 sum = n+m;
		 }
		 System.out.println(sum);
		 
	 }
}
