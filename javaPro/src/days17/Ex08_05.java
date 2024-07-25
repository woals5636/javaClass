package days17;

import java.util.Date;

public class Ex08_05 {
	public static void main(String[] args) {
		// 설문조사
		// 시작일 24.6.25	09:00:00
		// 종료일 24.7.25	18:00:00
		
		// 1.	24.6.20	12:00:00	설문시작 전 투표 불가
		// 2.	24.7.20	12:00:00	설문 진행 중.
		// 3.	24.7.25	19:00:00	설문종료 후 투표 불가
		// 4.	24.8.20	12:00:00	설문종료 후 투표 불가
		
		Date start = new Date(2024-1900,6-1,25,9,0,0);
//		System.out.println(start.toLocaleString());
		Date end = new Date(2024-1900,7-1,25,18,0,0);
//		System.out.println(end.toLocaleString());
		
		long startT = start.getTime();
		long endT = end.getTime();
		
		long surveyT = endT-startT;
//		System.out.println(surveyT);
		
		Date s1 = new Date(2024-1900,6-1,25,9,0,0);
		Date s2 = new Date(2024-1900,7-1,20,9,0,0);
		Date s3 = new Date(2024-1900,7-1,25,18,0,0);
		Date s4 = new Date(2024-1900,8-1,20,12,0,0);
		
		long [] able = {s1.getTime()-startT,s2.getTime()-startT,s3.getTime()-startT,s4.getTime()-startT};
		
		for (int i = 0; i < able.length; i++) {
			if(surveyT > able[i] && 0 < able[i]) {
				System.out.println("가능");
			}else {
				System.out.println("불가");
			}
		}
		
		
	}// main
}// class
