package days04;

import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		int age = sc.nextInt();
		char grade = sc.next().charAt(0);

		System.out.printf("이름=\"%s\", 나이=%d살, 등급='%c'", name, age, grade);
		
		sc.close();

	}

}
