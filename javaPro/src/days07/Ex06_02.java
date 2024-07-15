package days07;

/**
 * @author jam
 * @date 2024. 7. 9. - 오후 3:47:58
 * @subject 메서드(함수) 사용 예제
 * @content	두 정수의 합을 구해서 출력
 *			함수 선언 - 	1) 기능 - 두 정수의 합 구하는 
 *						2) 매개변수 - 두 정수
 *						3) 리턴값 - 합
 */						
public class Ex06_02 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		c = hap(a,b);
		
		System.out.printf("%d+%d=%d\n",a,b,c);
		
		c = hap(1, 2);
		System.out.println(c);

	}// main

	public static int hap(int a, int b) {
//		int result = a+b;
//		return result;
//		return 수식;
		return a+b;
	}

}// class
