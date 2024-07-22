package days16; // 강사님 코드 복사하기

import java.io.IOException;
import java.util.Scanner;

/**
 * @author jyoon
 * @date 2024. 7. 22. - 오전 10:54:36
 * @content [예외 고의로 개발자가 발생시키기]
 * @subject   throw 문 사용
 * 					  throws는 throw 문과는 다름 
 *                   예) 국어 점수를 입력 받아서 반환하는 getScore()    
 *					  메서드 선언
 *					  ㄴ 국어점수 0~100 아니라면 강제로 예외 발생ㄴ
 */

public class Ex01_07 {
	
	public static void main(String[] args) {
		
		int kor = 0;
		try {
			kor = getScore("국어");
			System.out.println(kor);
		
		} catch (ScoreOutOfBoundException e) {			
			e.printStackTrace();
		}  catch (Exception e) {			
			e.printStackTrace();
		} 
		
		
		System.out.println("end");
		
		
		
		
	} // main

	private static int getScore(String subjectName) throws ScoreOutOfBoundException {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.printf("> %s 점수 입력 ? ", subjectName);
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			// 강제로 개발자가 예외 발생시키기....
			// 사용자 예외 처리 객체
			throw new ScoreOutOfBoundException("점수 범위 (0~100) 벗어났다.");
		}
		
	}
	
	
	

} // class
