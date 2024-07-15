package days04;

/**
 * @author jam
 * @date 2024. 7. 4. - 오후 4:11:45
 * @subject
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		// continue 문
		int sum = 0;
		//	for (int i = 1; i <= 10; i++) {
		//	if(i==5)continue;
		//		System.out.printf("%d+",i);
		//		sum+=i;
		//	} // for
		//	System.out.printf("=%d",sum);

		// (3)
		int i = 0;
		while (++i <= 10) {
			if (i == 5) continue;
			System.out.printf("%d+", i);
			sum += i;
		} // while
		System.out.printf("=%d", sum);

		
		/* (2)
		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				i++;
				continue;
			}
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} // while
		System.out.printf("=%d", sum);
		 */
		
		/* (1)
		int i = 1;
		while (i <= 10) {
			if (i != 5) {
				System.out.printf("%d+", i);
				sum += i;
				i++;
			}
		} // while
		System.out.printf("=%d", sum);
		 */
	} // main

} // class