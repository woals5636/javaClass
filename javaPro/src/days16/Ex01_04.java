package days16;

import java.util.InputMismatchException;
import java.util.Scanner; // 강사님 코드 적기

public class Ex01_04 {

	public static void main(String[] args) {

		int a = 0, b = 0;

		Scanner scanner = new Scanner(System.in);

		// 다중 catch 문 -> JDK 1.7 | 기호(연산자 X) 멀티 catch 문
		try {

			System.out.print("> a, b 두 정수 입력");
			a = scanner.nextInt();
			b = scanner.nextInt();
			double c = a/b;
			System.out.printf("%d / %d = %.2f\n",a,b,c);

		} catch (InputMismatchException | ArithmeticException e) { // 멀티 catch 문
			System.out.println(e.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 
			System.out.println();
		}

		System.out.println("end");





	} // main

} // class
