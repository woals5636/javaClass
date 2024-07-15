package days07;

import java.util.Arrays;

public class Ex03_02 {

	public static void main(String[] args) {

		// 주민등록번호
		String rrn = "123456-1234567";
		// 정규표현식
		String regex = "-";
		
//		"123456-*******"	
//		String [] rrnArray = rrn.split(regex);
//		System.out.println(Arrays.toString(rrnArray));
//
//		rrnArray[1] = "*".repeat(7);
//
//		System.out.println(Arrays.toString(rrnArray));
//		
//		String blurRrn = String.join(regex, rrnArray);
//		System.out.println(blurRrn);


//		"123456-1******"
		
	      // 1. 풀이
	      /*
	      String [] rrnArr = rrn.split("-");
	       char gender = rrnArr[1].charAt(0);
	       String printRrn = rrnArr[0]+"-"+ gender + "******";
	       System.out.println( printRrn );
	       */

	      // 2. 풀이
	      /*
	       char [] rrnCharArr = rrn.toCharArray();
	       System.out.println( Arrays.toString(rrnCharArr));
	       for (int i = 8; i < rrnCharArr.length; i++) {
	         rrnCharArr[i] = '*';
	      }
	       System.out.println( Arrays.toString(rrnCharArr));
	       // char [] -> String
	       String printRrn = new String(rrnCharArr);
	       System.out.println( printRrn );
	       */

	       // 3. 풀이
	      String strYear = rrn.substring(0, 2);
	      String strMonth = rrn.substring(2, 4);
	      String strDay = rrn.substring(4, 6);
	      String strGender = rrn.substring(7, 8);
	      System.out.println( strYear );
	      System.out.println( strMonth );
	      System.out.println( strDay );
	      System.out.println( strGender );

	      System.out.println(rrn.substring(0, 8) + "******" );
		
	}// main

}// class