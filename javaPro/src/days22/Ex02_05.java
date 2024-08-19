package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author jam
 * @date 2024. 7. 30. - 오전 10:49:46
 * @subject
 * @content	https://needjarvis.tistory.com/742
 *			람다와 스트림 이해에도 도움됨
 */
public class Ex02_05 {
	public static void main(String[] args) throws IOException {

		/*
		 * days22
		 * 	  ㄴ	temp 폴더
		 * 		  ㄴ	a.txt 파일
		 * 		  ㄴ	b.txt 파일
		 * 		  ㄴ	subtemp 폴더
		 * 				ㄴ c.txt 파일
		 * 
		 * */

		/*
	      String pathname = ".\\src\\days22\\temp\\subtemp";
	      File f = new File(pathname);
	      f.mkdirs();
	      //
	      File atxt = new File(".\\src\\days22\\temp\\a.txt");
	      atxt.createNewFile();
	      File btxt = new File(".\\src\\days22\\temp\\b.txt");
	      btxt.createNewFile();
	      File ctxt = new File(".\\src\\days22\\temp\\subtemp\\c.txt");
	      ctxt.createNewFile();
		 */
		
		String pathname = ".\\src\\days22\\temp";
		File f = new File(pathname);
		
//		if(f.exists()) {
//			// System.out.println(f.delete());
//			// delete() 메소드는 하위 디렉토리 및 파일이 없어야 삭제할 수 있다.
//			// 재귀함수를 사용하여 하위 디렉토리 및 파일을 연속적으로 확인하여 모두 삭제한 후 삭제를 해야 한다.
//			
////			delete(f.listFiles());
//		}

		scanDelete(f);
        f.delete();
        System.out.println(f.getName()+" 폴더 삭제");
		
		System.out.println(" e n d ");
		

	}// main
	
	public static void scanDelete(File f) {
	      File[] files = f.listFiles();

	      for (File file : files) {
	         if (file.isFile()) {
	            file.delete();
	            System.out.println(file.getName()+" 파일 삭제");
	         } else {
	            scanDelete(file.getAbsoluteFile());
	            file.delete();
	            System.out.println(file.getName()+" 폴더 삭제");
	         }
	      }
	   }

	
	
}// class
