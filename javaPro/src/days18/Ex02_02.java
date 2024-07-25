package days18;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author jam
 * @date 2024. 7. 24. - 오전 11:06:58
 * @subject
 * @content
 *
 */
public class Ex02_02 {
	public static void main(String[] args) throws ParseException {
		// DecimalFormat
		int money = 3276500;	// "3,276,500"
		/* 1.
		String smoney = String.format("%,d", money);
		System.out.println(smoney);
		*/
		
		String a = Integer.toString(money);
		System.out.printf("%,s",a);
		
		/* 2.
//		String pattern = "#,###";
//		String pattern = "#,###.00";	// 3,276,500.00
		String pattern = "\u00A4#,###.00";	// ₩3,276,500.00
		DecimalFormat df = new DecimalFormat(pattern);
		String smoney = df.format(money);
		System.out.println(smoney);
		*/
		
//		String s = "3,123.23";
//		
//		/* 1.
//		s = s.replace(",", "");
//		double d = Double.parseDouble(s);
//		System.out.println(d);
//		*/
//		
//		String pattern = "#,###.00";
//		DecimalFormat df = new DecimalFormat(pattern);
//		double d = (double) df.parse(s);
//		System.out.println(d);
//		
	}// main
}// class
