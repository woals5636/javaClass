package days13;

import java.util.Scanner;

public class Ex09 {
	// 필드
	// 클래스변수
	static String name ;

	public static void main(String[] args) {

		Math.max(0, 0);
		Math.abs(0);
		Math.random();
		//Math.PI;
		Math.pow(0, 0);

		// System.out
		// System.in

		Scanner scanner = new Scanner(System.in);



		// 클래스명.필드
		// 클래스명.메서드()
        name = "홍길동";

//        Ex09 obj = new Ex09();
//        int result = obj.sum(1,2);

         // Ex09.sum(1, 2);
        int result = sum(1,2);
	}

	static int sum(int a, int b) {
		return a+b;
	}

	public static void test() {
		Ex09.name = "김길동";
	}

}
