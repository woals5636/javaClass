package days16;

import java.util.Scanner;

public class CutOperation {

	public static void main(String[] args) {
		/*
		취업문제) 막대기 자르기

		각각 0이상의 정수를 길이로 하는 N개의 막대기가 있다.

		 이 막대기들 중 가장 짧은 막대기의 길이로 모든 막대기를 자르는 것을 [cut operation]이라고 하자.

		예를 들어 6개의 막대기가 있고 그 길이가 다음과 같다면

		5 4 4 2 2 8

		이 경우 [Cut Operation]을 한번 수행하면 다음과 같다.

		3 2 2 6

		(가장 짧은 길이인 2로 6개의 막대기를 잘라내고 길이가 0이 되버린 2개의 막대기는 버려진다.)

		N개의 막대기와 그 각각의 길이가 주어졌을 때 [Cut Operation]을 모든 막대기가 버려질 때(길이가 0이 될때)까지 반복하고  수행 시 마다 남은 막대기의 수를 출력하는 프로그램을 작성하라.

		입력
		첫줄에 막대기의 수 N을, 다음 줄에 각각의 막대기의 길이를 공백으로 구분해서 입력한다.

		출력
		매 줄마다 [Cut Operation]이 수행 되 때 마다 남은 막대기의 수를 출력

		제한
		1 <= N <= 1000
		1 <= 막대기의 길이 <= 1000

		입력 예제 #1
		6
		5 4 4 2 2 8

		출력 예제 #1
		6
		4
		2
		1

		입력 예제 #2
		8
		1 2 3 4 3 3 2 1

		출력 예제 #2
		8
		6
		4
		1
		*/


		int n = 0; // 막대기의 길이
		
		
		cutOperation(n);
	}

	private static int cutOperation(int n) {
		int [] nArr = new int [n];
		int m = n;
		Scanner sc = new Scanner(System.in);
		System.out.print("막대기의 갯수를 입력하시요 : ");
		n = sc.nextInt();
		System.out.print("막대기 길이를 입력하시오 : ");
		
		for (int i = 0; i < nArr.length; i++) {
		}
		
		
		
		return m; 
	}

}
