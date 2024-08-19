package days22;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author jam
 * @date 2024. 7. 30. - 오전 9:44:36
 * @subject
 * @content
 *
 */
public class Ex02_02_02 {
	public static void main(String[] args) {
		
		String pathname = ".\\src\\days21";
		//	days21 폴더 안에서 확장자가 .java인 자바파일만 조회
		File file = new File(pathname);
		/*
		File[] list = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		*/
		
		File[] list = file.listFiles((dir,name)-> name.endsWith(".java"));
		
		for (int i = 0; i < args.length; i++) {
			File f = list[i];
			System.out.println(f.getName());
		}
		
	}// main
}// class
