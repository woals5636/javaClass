package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jam
 * @date 2024. 7. 3. - 오후 12:26:45
 * @subject
 * @content
 *
 */

public class Ex03_02 {
	public static void main(String[] args) throws IOException {

		 int i = Integer.MAX_VALUE; // == int i = 2147483647;
		 int j = 2;
		  
		 int k = i + j; // 오버플로우 발생
		 long l = (long)i + j; // int형 i를 long형으로 강제 형 변환하여 오버플로우이 발생하지 않고 정상적으로 계산됨
		 
		 System.out.printf("%d + %d = %d\n", i, j, k);

		// String 이름
		// byte 국어, 영어, 수학
		// short 총점, double 평균 계산
		// 홍길동 90 89 91 / 합계 270 / 평균 90.00

		int no = 15;
		System.out.printf("%d\n", no);
		System.out.printf("%04d\n", no);
		System.out.printf("%4d\n", no);
		System.out.printf("%-4d\n", no);
		System.out.printf("-".repeat(20));
		System.out.println();

		String nm = "홍길동";
		System.out.printf("[%10s]\n", nm);
		System.out.printf("[-%10s]", nm);
		System.out.println();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		byte kor, eng, math;
		short total;
		double avg;

		System.out.print("> 이름 입력 ? ");
		name = br.readLine();

		System.out.print("> 국어 입력 ? ");
		kor = Byte.parseByte(br.readLine());

		System.out.print("> 영어 입력 ? ");
		eng = Byte.parseByte(br.readLine());

		System.out.print("> 수학 입력 ? ");
		math = Byte.parseByte(br.readLine());

		// Type mismatch: cannot convert from int to short
		// total = kor + eng + math;
		total = (short) (kor + eng + math); // 강제 형 변환

		avg = (double) total / 3;
		// total(short형) / 3(int형) -> int형이기 때문에 avg 값에는 소수점이 없는 int형으로 계산된 값이 들어가게 된다
		// ex) 5/3 -> 1.00
		// 소수점도 정확하게 하기 위해서는 둘 중 하나를 double 형으로 강제 변환하여 준다
		// ex) 5/3 -> 1.66..

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name, kor, eng, math, total, avg);
		// \t(tab 기능)
	}
}
