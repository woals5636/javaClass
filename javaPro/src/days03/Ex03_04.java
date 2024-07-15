package days03;

import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 3. - 오후 2:42:51
 * @subject Scanner
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		byte kor, eng, math;
		short total;
		double avg;

		// 김재민 98 87 77
		System.out.print("> 이름, 국어, 영어, 수학 입력 ? \n");

		name = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		math = sc.nextByte();

		total = (short) (kor + eng + math); // 강제 형 변환

		avg = (double) total / 3;

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name, kor, eng, math, total, avg);
		
		sc.close();

	}

}
