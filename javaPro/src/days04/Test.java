package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = br.readLine();
		byte age = Byte.parseByte(br.readLine());
		char rating = br.readLine().charAt(0);
				
		System.out.print("이름, 나이, 등급을 입력하세요 ? ");
		System.out.printf("이름=\"%s\", 나이=%d살, 등급='%c'",name,age,rating);
		
	}

}
