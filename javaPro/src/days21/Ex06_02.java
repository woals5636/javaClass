package days21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author jam
 * @date 2024. 7. 29. - 오전 11:14:38
 * @subject test.txt -> test_copy.txt
 * @content FileInputStream		FileOutputStream
 * 			BufferedInputStream	BufferedOutputStream
 * 
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {
		//
		String sourceFile = "C:\\Users\\User\\Documents\\test.txt";
		String copyFile = "C:\\\\Users\\\\User\\\\Documents\\\\test_copy.txt";

		fileCopyBinaryStream(sourceFile, copyFile);
		
		//> Ex06 복사 처리 시간 : 16386200(ns)
		//> Ex06_02 복사 처리 시간 : 330400(ns)
	} // main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();
		final int BUFFER_SIZE = 1024;

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);
				BufferedInputStream bis = new BufferedInputStream(fis,BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos,BUFFER_SIZE);
				) {
			int code;
			// 버퍼 == byte[]
			byte[] b = new byte[BUFFER_SIZE];
			int readByteNumber;
			
			while ((readByteNumber = bis.read(b)) != -1) {
//				System.out.printf("%08d\n", Integer.parseInt(Integer.toBinaryString(code)));
				bos.write(b,0,readByteNumber);
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
