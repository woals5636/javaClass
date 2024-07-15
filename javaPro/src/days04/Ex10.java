package days04;

/**
 * @author jam
 * @date 2024. 7. 4. - 오후 3:40:23
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {

		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			if(i<10) {
//				System.out.printf("%d+", i);	
//			}else {
//				System.out.printf("%d", i);
//			}
//			sum += i;
//		}
//		System.out.print("="+sum);

		int i = 1;
		while (i <= 10) {
			if (i < 10) {
				System.out.printf("%d+", i);
			} else {
				System.out.printf("%d", i);
			}
			sum += i;
			i++;

		}
		System.out.print("=" + sum);

	} // main

} // class
