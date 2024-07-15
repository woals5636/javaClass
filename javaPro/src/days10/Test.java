package days10;

import java.util.Random;

/*1. 30명 학생의 이름,국,영,수,총,평,등를 처리하는 배열을 선언
하고 학생정보 입력 후 출력하는 코딩을 하세요. 
 ( 조건 : 학생정보 입력 및 출력하는 메서드를 만들어서 코딩
   studentInfomationInput()
   studentInfomationOutput()
 )*/
public class Test {

	public static void main(String[] args) {
		
		Random rnd = new Random();

		char [][] student = new char [3][30];
		int [][] score = new int [3][30];
		for (int i = 0; i < score.length; i++) {
			int classNum = i + 1;
			System.out.println(classNum+"반"); // 1반 ~ 3반
			System.out.print("[번호]\t이름\t국어점수\t영어점수\t수학점수\t합계점수\t평균점수\t등수\n");
			for (int j = 0; j < score[i].length; j++) {
				int name = rnd.nextInt(25)+97;	//	'a'~'z' 무작위 값을 학생이름으로
				int kor = rnd.nextInt(101);	// 무작위 국어점수
				int eng = rnd.nextInt(101);	// 무작위 영어점수
				int math = rnd.nextInt(101);	// 무작위 수학점수
				int total = kor+eng+math;	// 국+영+수 점수
				double avg = total/3;	// 평균 점수
				int rank = 1;	// 등수
				
				student[i][j] = (char) name;	//	'a'~'z' 무작위 값을 학생이름을 student 배열에 기입
				score[i][j] = total;	// 합계 점수를 score 배열에 기입
				int studentNum = j+1; // 학생 번호
				
				System.out.printf("%d\t%c\t%d\t%d\t%d\t%d\t%.2f\t%d\t\n",studentNum,name,kor,eng,math,total,avg,rank);
			}
			System.out.println();
		}
		
	}// main

}// class