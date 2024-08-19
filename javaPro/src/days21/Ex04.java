package days21;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;

/**
 * @author jam
 * @date 2024. 7. 29. - 오전 10:07:07
 * @subject
 * @content
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		// days21.Ex01.java
		// 텍스트파일 -> 문자 or 바이너리 스트림? -> 문자 스트림 ( 바이너리도 가능하지만 2바이트를 1바이트로 바꾸어야함)
		// 파일	+ 문자 스트림 = FileReader, FileWriter
		// [ File 클래스 ] : 파일 + 디렉토리(폴더)를 다루는 여러 기능이 구현된 클래스
		//		ㄴ	파일 생성, 삭제, 수정 등등
		// String parent = ".\\src\\days21";
		File parent = new File(".\\src\\days21");
		String child = "Ex01.java";
		File file = new File(parent, child);
		System.out.println(file.length() + "(단위는 bytes)");
		System.out.println(file.isDirectory() + " / " + file.isFile());
		
		long ms = file.lastModified();
		System.out.println(ms);	//1722211964574
		// 년 월 일 시:분:초 로 출력
		
		String pattern = "yyyy년 MM월 dd일 hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String s = sdf.format(ms);
		System.out.println(s);
		

		// 파일을 열면 꼭 사용이 완료되면 종료 시켜주어야함
		try (FileReader reader = new FileReader(file)){
			int code;
			while((code = reader.read()) != -1) {
				System.out.printf("%c", (char)code);
			};
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main
}// class
