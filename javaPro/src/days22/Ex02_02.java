package days22;

import java.io.File;

/**
 * @author jam
 * @date 2024. 7. 30. - 오전 9:44:36
 * @subject
 * @content
 *
 */
public class Ex02_02 {
	public static void main(String[] args) {
	
		String pathname = ".\\src\\days21";
		//	days21 폴더 안에서 확장자가 .java인 자바파일만 조회
		
		File file = new File(pathname);
		File[] list = file.listFiles();
		int no = 1;
		
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if(f.isFile()) {
				String fileName = f.getName();
				// matches( ".*\\.java$")
				if(fileName.endsWith(".java")){
					System.out.printf("%d. %s\n",no++,fileName);
				}
			}
		}
		
		
	}// main
}// class
