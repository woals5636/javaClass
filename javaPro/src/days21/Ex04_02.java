package days21;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 29. - 오전 10:39:57
 * @subject
 * @content
 *
 */
public class Ex04_02 {
	public static void main(String[] args) {
		
		// 실행 후
		// 1. 저장할 파일명을 입력하 ? test.txt 엔터
		// 2. 저장할 내용(데이터) 입력 ? 문자열 입력... 엔터
		//	  계속 ? y , n
		String parent = ".\\src\\days21";	// 저장경로
		String child;
		char con = 'y';	//	계속?
		String content;
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("1. 저장할 파일명 입력 ?");
			child = scanner.next();
			
			File file = new File(parent,child);
			
			do {
				try ( FileWriter writer = new FileWriter(file,true)){
					System.out.print("2. 저장할 문자열(Date) 입력 ? ");
					content = scanner.next();
					writer.write(content);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.print("계속");
				con = (char)System.in.read();
				System.in.skip(System.in.available());
			} while (Character.toUpperCase(con)=='Y');
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}// main
}// class
