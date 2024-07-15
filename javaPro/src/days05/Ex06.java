package days05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 System.out.println("두 정수를 입력하세요");
		 
		 System.out.print("정수 n : ");
		 int n = sc.nextInt();

		 System.out.print("정수 m : ");
		 int m = sc.nextInt();

		 int sum = 0;

//		 3. 풀이
		 int min = n > m? m : n;
		 int max = Math.max(n, m);
		 for(int i = min;i<=max;i++) {
			 sum+=i;
		 }

//		 2. 풀이
//		 if(n>m) {
//			 int temp = n;
//			 n = m;
//			 m = temp;
//		 }		 
//		 for(;n<=m;n++) {
//			 sum+=n;
//		 }

//		 1.풀이
//		 if(n<m) {
//			for(;n<=m;n++) {
//				sum+=n;
//			}
//		 }else{
//			 for(;m<=n;m++) {
//					sum+=m;
//				}
//		 }
		 System.out.println(sum);
		 
		 sc.close();
	 }

}
