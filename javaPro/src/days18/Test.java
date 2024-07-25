package days18;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

	}
}

//	4. 설문조사 기간이 
//	   시작일  2024.7.20  00:00:00
//	   종료일  2024.7.24  00:00:00
//	   일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.
//
//	public static void main(String[] args) {
//		Date today = new Date();
//		Date start = new Date(2024-1900,7-1,20,00,00,00);
//		Date end = new Date(2024-1900,7-1,24,00,00,00);
//		
//		long gap1 = end.getTime()-start.getTime();
//		long gap2 = end.getTime()-today.getTime();
//		
//		if(gap1 > gap2 && gap2 > 0) {
//			System.out.println("가능");
//		}else {
//			System.out.println("불가능");
//		}
//	}

// 3. 수료일(2024.12.14. 18:00:00)로 부터 오늘까지 남은 일수 계산을 하세요.
//
//	public static void main(String[] args) {
//		Date today = new Date();
//		Date end = new Date(2024-1900,12-1,14,18,00,00);
//		
//		long gap = end.getTime()-today.getTime();
//		
//		long [] tArr = {1000*60*60*24, 1000*60*60, 1000*60, 1000};	//	일, 시간, 분, 초
//		long [] result = new long [4];
//		for (int i = 0; i < tArr.length; i++) {
//			result[i] = gap/tArr[i];
//			gap %= tArr[i];
//		}
//
//		System.out.printf("%d일 %d시간 %d분 %d초 남았습니다.",result[0],result[1],result[2],result[3]);
//		
//	}

//1.  년도 year를 입력받아서 
//입력받은 년도의 1월~12월 까지의 마지막 날짜를 출력하는 코딩을 하세요. 
//( 조건 : Date 클래스 사용 )
//( 조건 : Scanner 클래스 사용 + try~with~resource문 사용)
//
//public static void main(String[] args) {
//	System.out.print("년도를 입력하시오 : ");
//	Scanner sc = new Scanner(System.in);
//	
//	int year = sc.nextInt()-1900;
//	int month = 0;
//	
//	
//	try {
//		for (month = 0; month < 12; month++) {
//			int lastDay = getLastDay(year,month);
//			Date d = new Date(year,month,lastDay);
//			System.out.printf("%d월 : %d일\n",month+1,lastDay);
//		}
//		
//	} catch (Exception e) {
//		
//	}
//	
//}
//
//private static int getLastDay(int year, int month) {
//	Date l = new Date(year,month,1);
//	l.setMonth(month+1);
//	l.setDate(0);
//	return l.getDate();
//}