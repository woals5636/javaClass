package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 4:17:54
 * @subject
 * @content
 *
 */
public class Ex09 {
	
	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;

	static final int STUDENT_COUNT = 30;
	static Student [] students = new Student[STUDENT_COUNT];
	
	static Scanner scanner = new Scanner(System.in);
	static int count = 0; // 입력받은 학생수
	static char con = 'y';	// 추가 입력 여부
	
	public static void main(String[] args) throws IOException {
		// days10.Ex01_02.java -> 클래스 배열 사용하여 리팩토링
		// Student.java
		
		studentInfomationInput();
		studentInfomationOutput();

	}// main

	private static void studentInfomationOutput() {

		System.out.printf("총 학생수 : %d\n",count);
		
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t",i+1);
			students[i].dispInfo();
		}
		
		
	} //studentInfomationOutput

	public static void studentInfomationInput() throws IOException {
		
		do {
			System.out.printf("> %d번 학생 이,국,영,수 입력 ? ", count+1);

			name = getName();	//scanner.next();
			kor = getScore();	//scanner.nextInt();
			eng = getScore();	//scanner.nextInt();
			mat = getScore();	//scanner.nextInt();
			tot = kor+eng+mat;
			avg = (double)tot/3;
			rank = 1;

			students[count] = new Student();
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;
			students[count].rank = rank;

			count++;
			// 입력 계속 ?
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');

		processRank();
	} //studentInfomationInput
	
	private static void processRank() {
		for (int i = 0; i < count; i++) {
			students[i].rank=1;
			for (int j = 0; j < count; j++) {
				if(students[i].tot < students[j].tot) {
					students[i].rank++;
				}
			}
		}
	}


	private static String getName() {
		Random rnd = new Random();
		String [] lastNames = {"김","이","박","최","권","홍"};
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];
		
		char[] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
			
		}
		// char[] -> String
		String firstName = String.valueOf(firstNames);
		
		name += firstName;
		
		return name;
	}

	public static int getScore() {
		return (int)(Math.random()*101);
	}
}// class
