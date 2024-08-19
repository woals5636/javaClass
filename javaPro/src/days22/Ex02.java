package days22;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @author jam
 * @date 2024. 7. 30. - 오전 9:16:28
 * @subject
 * @content
 *
 */
public class Ex02 {
	
	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);		// 출력값 : C:\Class\Workspace\JavaClass\Workspace\javaPro
		
		File parent = new File(currentDirectory);
		// System.out.println(parent.isDirectory());	// 출력값 : true
		
		// 하위 폴더, 파일 조회...
		// String [] strArr = parent.list();	// 하위 디렉토리 + 파일 목록을 반환하는 메서드
		// String [] strArr = parent.list(filter) : 필터링된 하위 디렉토리 + 파일 목록을 반환하는 메서드
		// File [] fileArr = parent.listFiles()
		// File [] fileArr = parent.listFiles(filter)

//		String[] list = parent.list();
//		for (int i = 0; i < list.length; i++) {
//			System.out.print(list[i]+"/");
//			File child = new File(parent,list[i]);
//			System.out.println(child.isFile() ? "파일": "폴더");
//		} // for
		
		File [] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File child = list[i];
			String name = child.getName();
			long ms = child.lastModified();
			String pattern = "yyyy-MM-dd a h:mm";	// 출력 예시 : 2024-07-18 오후 4:13
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String date = sdf.format(ms);
			System.out.printf("%s\t%s\t%s\t%d\n",child.isFile()?"파일":"[폴더]",name,date,child.length());
			
		}
		
	}// main
}// class
