package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author jam
 * @date 2024. 7. 16. - 오전 9:03:32
 * @subject 3반 30명 학생 (이름, 국어, 영어, 수학, 총점, 평균, 등수, 전교등수) 입력 및 출력
 * @content
 *
 */
public class Ex01 {
	

	static String name;
	static int kor, eng, mat, tot, rank, wrank;
	static double avg;

	static Scanner scanner = new Scanner(System.in);
	static final int CLASS_COUNT = 3;
	static final int STUDENT_COUNT = 30;
	
	// String [] names = new String[3*30];
	static String[][] names = new String[CLASS_COUNT][STUDENT_COUNT];

	// 면 - 국어, 영어, 수학, 총점, 등수, 전교등수
	// 행 - 반
	// 열 - 학생들
	static int[][][] infos = new int[6][CLASS_COUNT][STUDENT_COUNT];
	// ex) 2-19 수학 => infos[2][1][18]
	static double[][] avgs = new double[CLASS_COUNT][STUDENT_COUNT];

	// 입력받은 학생 수 저장할 변수
	// int count1 = 0; int count2 = 0; int count3 = 0;
	static int[] counts = new int[CLASS_COUNT];

	// 추가 입력 여부 확인하는 변수
	static char con = 'y';
	
	static Random rnd = new Random();
	static String[] lastNames = { "김", "이", "박", "최", "권", "홍" };
	
	static char[] firstNames = new char[2];
	
	public static void main(String[] args) throws IOException {

		studentInfomationInput();

	}// main
	
public static void studentInfomationInput() throws IOException {
		
	int ban;// 1반,2반,3반

	do {
		// 1. 반 입력?
		System.out.print("> 반 입력 ? ");
		ban = scanner.nextInt(); // 1 or 2 or 3

		// 2. 그 반의 학생 정보 입력 ?
		System.out.printf("> %d반의 [%d]번 학생의 국어, 영어, 수학, 총점, 등수, 전교등수", ban, counts[ban - 1] + 1);
		counts[ban - 1]++;

		name = getName();
		kor = getScore();
		eng = getScore();
		mat = getScore();
		tot = kor + eng + mat;
		avg = (double) tot / 3;
		wrank = 1;
		rank = 1;

		names[ban - 1][counts[ban - 1]] = name;
		infos[0][ban - 1][counts[ban - 1]] = kor;
		infos[1][ban - 1][counts[ban - 1]] = eng;
		infos[2][ban - 1][counts[ban - 1]] = mat;
		infos[3][ban - 1][counts[ban - 1]] = tot;
		infos[4][ban - 1][counts[ban - 1]] = rank;
		infos[5][ban - 1][counts[ban - 1]] = wrank;
		avgs[ban - 1][counts[ban - 1]] = avg;

		// 입력 계속
		System.out.print("> 학생 입력 계속 ? ");
		con = (char) System.in.read();
		System.in.skip(System.in.available());
	} while (Character.toUpperCase(con) == 'Y');

	int 총학생수 = IntStream.of(counts).sum();
	System.out.printf("\t\t학생 정보 출력( %d명 )\n", 총학생수);
	for (int i = 0; i < counts.length; i++) {
		for (int j = 0; j < counts[i]; j++) {
			System.out.printf("[%d반 학생 : %d명 ]\n",i+1,counts[i]);
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
					,i+1, names[i][j], infos[0][i][j],infos[1][i][j],infos[2][i][j],infos[3][i][j],avgs[i][j],infos[4][i][j],infos[5][i][j]);
		}		
	}

		
	} //studentInfomationInput
	

	private static String getName() {
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];

		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');

		}
		// char[] -> String
		String firstName = String.valueOf(firstNames);

		name += firstName;

		return name;
	}

	public static int getScore() {
		return (int) (Math.random() * 101);
	}

}// class
