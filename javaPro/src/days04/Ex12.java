package days04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("정수(n) 입력 ? ");	
			n = sc.nextInt();
		} while (n<1);
		
		int sum = 0 ;
		for(int i = 1; i <= n; i++) {
			System.out.printf("%d+",i);
			sum+=i;
		}
		System.out.printf("=%d\n",sum);
		sc.close();
	}

}

/*
 [문제1] 국어점수를 입력받아서 수/우/미/양/가 출력(if문 사용)
 		public static void main(String[] args){
		int krScore;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("국어점수 : ");
			krScore = sc.nextInt();
			
		} while (krScore<0 && krScore>100);
		
		if(krScore >= 90) {
			System.out.println("수");
		}else if (krScore >= 80) {
			System.out.println("우");
		}else if (krScore >= 70) {
			System.out.println("미");
		}else if (krScore >= 60) {
			System.out.println("양");
		}else if (krScore >= 50) {
			System.out.println("가");
		}else {
			System.out.println("측정불가");
		}
	}
 [문제2] 국어점수를 입력받아서 수/우/미/양/가 출력(switch문 사용)
 public static void main(String[] args){
		int krScore;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("국어점수 : ");
			krScore = sc.nextInt();
			
		} while (krScore<0 && krScore>100);
		
		switch (krScore / 10) {
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		case 5:
			System.out.println("가");
			break;
		default:
			System.out.println("측정불가");
			break;
		}
 [문제3] 1~10까지의 홀수의 합(for문 사용)
 public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i += 2) {
			System.out.printf("%d+",i);
			sum += i;
		}
		System.out.print("\n1 ~ 10까지의 홀수의 합 : " + sum);
	}
 [문제4] 1~10까지의 홀수의 합(while문 사용)
 public class Test2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=10) {
			System.out.printf("%d+",i);
			sum +=i;
			i+=2;
		}
		System.out.print("\n1 ~ 10까지의 홀수의 합 : " + sum);
	}
}
[문제5] 두 정수(n,m) 을 입력받아서 두 정수 사이의 합을 출력(for문, while문)
[for문]
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
		 }else{
			 for(;m<=n;m++) {
					sum+=m;
				}
		 }
		 System.out.println(sum);
		 
	 }
[while문]
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 System.out.println("두 정수를 입력하세요");
		 
		 System.out.print("정수 n : ");
		 int n = sc.nextInt();

		 System.out.print("정수 m : ");
		 int m = sc.nextInt();

		 int sum = 0;
		 
		 if(n<m) {
			 while(n<=m) {
				 sum+=n;
				 n++;
			 }
		 }else if(n>m){
			 while(m<=n) {
				 sum+=m;
				 m++;
			 }
		 }else if(n==m){
			 sum = n+m;
		 }
		 System.out.print("두 정수 n,m의 합은 : " + sum);
		 
	 }
 */