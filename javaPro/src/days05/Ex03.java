package days05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int krScore;
		boolean flag = false;
		do {
			if(flag) {
				System.out.print("입력을 잘못 하였습니다.\n");
			}
			flag = true;
			
			System.out.print("국어점수 : ");
			krScore = sc.nextInt();

		} while (krScore<0 || krScore>100);
//		} while (!(krScore>=0 && krScore<=100)); // 위와 동일
		
//		if(90<=krScore&&krScore<=100) {System.out.println("수");}
//		if(80<=krScore&&krScore<=89) {System.out.println("우");}
//		if(70<=krScore&&krScore<=79) {System.out.println("미");}
//		if(60<=krScore&&krScore<=69) {System.out.println("양");}
//		if(00<=krScore&&krScore<=59) {System.out.println("가");}
		
		if(krScore >= 90) {
			System.out.println("수");
		}else if (krScore >= 80) {
			System.out.println("우");
		}else if (krScore >= 70) {
			System.out.println("미");
		}else if (krScore >= 60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		sc.close();
	}

	/*
	 [문제1] 국어점수를 입력받아서 수/우/미/양/가 출력(if문 사용)
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int krScore;
		do {
			System.out.print("국어점수 : ");
			krScore = sc.nextInt();
			
		} while (krScore<0 || krScore>100);
		
		if(krScore >= 90) {
			System.out.println("수");
		}else if (krScore >= 80) {
			System.out.println("우");
		}else if (krScore >= 70) {
			System.out.println("미");
		}else if (krScore >= 60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		sc.close();
	}
	 [문제2] 국어점수를 입력받아서 수/우/미/양/가 출력(switch문 사용)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int krScore;
		do {
			System.out.print("국어점수 : ");
			krScore = sc.nextInt();

		} while (krScore < 0 || krScore > 100);
		char grade;
		switch (krScore / 10) {
		case 10:
		case 9:
			grade = '수';
			break;
		case 8:
			grade = '우';
			break;
		case 7:
			grade = '미';
			break;
		case 6:
			grade = '양';
			break;
		default:
			grade = '가';
			break;
		}
		System.out.println(grade);
		sc.close();
	} // main
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
			 }else if(n>m){
				 for(;m<=n;m++) {
						sum+=m;
					}
			 }else if(n==m){
				 sum = n+m;
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
	
}
