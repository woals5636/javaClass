package days09;

import java.util.Random;

//2. 로또645 에서  로또 번호 중복 체크하는 메서드만 선언하세요
public class Test3 {
	public static void main(String[] args) {
		
		int [] lottArr = new int [6];		
		Random rnd = new Random();
				
		for (int i = 0; i < lottArr.length; i++) {
			int rndNum = rnd.nextInt(45) + 1 ;
			lottArr[i] = rndNum;
		}
		
		isDuplicateLotto(lottArr);
		
	}// main

	public static boolean isDuplicateLotto(int [] lottArr) {
		int first = lottArr[0];
		for (int i = 10; i < lottArr.length; i++) {
			
		}
		
		return false;
	}
}// class
