package days21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author jam
 * @date 2024. 7. 29. - 오전 11:14:38
 * @subject test.txt -> test_copy.txt
 * @content FileInputStream FileOutputStream
 * 
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		//
		String sourceFile = "C:\\Users\\User\\Documents\\test.txt";
		String copyFile = "C:\\\\Users\\\\User\\\\Documents\\\\test_copy.txt";

		fileCopyBinaryStream(sourceFile, copyFile);
	} // main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);) {
			int code;
			while ((code = fis.read()) != -1) {
				System.out.printf("%08d\n", Integer.parseInt(Integer.toBinaryString(code)));
				fos.write(code);

			} // while
			fos.flush();
			System.out.println("파일 복사 완료!!!");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

} // class
