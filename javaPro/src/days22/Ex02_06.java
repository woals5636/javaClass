package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author jam
 * @date 2024. 7. 30. - 오전 11:37:38
 * @subject
 * @content
 *
 */
public class Ex02_06 {
	public static void main(String[] args) {
		// 85.86KB
		String parent = ".\\src\\days22";
		String child = "시간표_(5강의실)(디지털컨버전스)AWS 클라우드와 Kafka를 활용한 Java(자바) Full-Stack 개발자 양성과정(E).xlsx";
		// 10KB	양성과정(E)_1.xlsx
		// 10KB	양성과정(E)_2.xlsx
		File file = new File(parent,child);

		// > 파일 크기 : 87926(bytes)
		System.out.println("> 파일 크기 : "+file.length()+"(bytes)");

		final int VOLUME = 10 * 1024;	// 10KB

		String baseName = getBaseFileName(child);	//	~~~~~~양성과정(E)
		String ext = getExtension(child);	//	.xlsx

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		int code = 0;
		int index = 0;	//	~~~양성과정(E)"_3".xlsx		"_3" -> index
		int i = 0;	//	읽어온 byte 수

		try (
				FileInputStream fis= new FileInputStream(file);
				BufferedInputStream bis= new BufferedInputStream(fis);
				) {

			while ((bis.read()) != -1) {
				if(i%VOLUME == 0) {
					if(i != 0) bos.close();	// 파일 저장.
					
					// ~~양성과정(E)_1.xlsx
					child = String.format("%s_%d%s", baseName,++index,ext);
					
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				}// if
				
				bos.write(code);
				
				i++;
			}//	while

			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}//	try catch

	}// main

	// 확장자를 반환하는 메서드
	public static String getExtension(String fileName) {
		int pos = fileName.indexOf(".");
		return fileName.substring(pos);
	}
	// 확장자를 제외한 파일명을 반환하는 메서드
	public static String getBaseFileName(String fileName) {
		int pos = fileName.indexOf(".");
		return fileName.substring(0,pos);
	}

}// class
