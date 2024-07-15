package days05;

import java.util.Scanner;

public class Ex03_02 {

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
} // class
