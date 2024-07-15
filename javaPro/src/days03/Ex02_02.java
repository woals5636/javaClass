package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jam
 * @date 2024. 7. 3. - 오전 11:34:19
 * @subject
 * @content
 *
 */

public class Ex02_02 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름 입력 ? ");	
		String name= br.readLine();
		
		//Type mismatch: cannot convert from String to byte
		// 타입(형)변환 필요
		// "20" -> 20
		// String -> byte
		System.out.print("> 나이 입력 ? ");	
		
		String input = br.readLine(); // String 타입으로 입력 받아서
		byte age = Byte.parseByte(input); // String 타입을 Byte 타입으로 형변환
		/* int age = Integer.parseInt(input); String -> Integer  */
		
		/*
		 * Wrapper Class
		 * 기본 자료타입(primitive type)을 객체로 다루기 위해서 사용하는
		 * 클래스기본 자료타입(primitive type)을 객체로 다루기 위해서 사용하는 클래스
		*/
		
		System.out.printf("이름=\"%s\",나이=%d",name,age);
		
	}

}
