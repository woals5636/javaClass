package days09;

import java.util.Calendar;
import java.util.Scanner;

//3. 주민등록 번호를 입력받아서 만 나이를 계산하는 메서드만 선언하세요.

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String rrn = sc.nextLine();
		
		int age = krAgeCal(rrn);
	
		System.out.println(age);
		
	}// main

	public static int krAgeCal(String rrn) {
		
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
		int thisMonth = cal.get(Calendar.MONTH)+1;
		int thisDay = cal.get(Calendar.DATE);
		int thisMD = thisMonth*100+thisDay;
		
//		int birthYear = Integer.parseInt(rrn.substring(0, 2));
		int birthYear = birthYear(rrn); // 8번째 오는 숫자에 따라서 century 값 + 주민등록번호 1자리 및 2자리
		int birthMonth = Integer.parseInt(rrn.substring(2, 4));
		int birthDay = Integer.parseInt(rrn.substring(4, 6));
		int birthMD = birthMonth*100+birthDay;
		int birthGen = Integer.parseInt(rrn.substring(7, 8));
		
		
		int age = thisYear - birthYear;
		if(thisMD>=birthMD) {
			age++;
		}
		
		return age;
	}
	
	public static int birthYear(String rrn) {

		int birthYear = Integer.parseInt(rrn.substring(0, 2));
		int birthGen = Integer.parseInt(rrn.substring(7, 8));
		int century;
		
		switch (birthGen) {
		case 1:case 2:case 5:case 6:	
			century=1900;
			break;
		case 3:case 4:case 7:case 8:
			century=2000;
			break;
		default:
			century=1800;
			break;
		}

		birthYear += century;
		
		return birthYear;
	}
	
	
	
}// class
