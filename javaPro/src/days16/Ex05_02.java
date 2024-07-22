package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jam
 * @date 2024. 7. 22. - 오후 2:48:24
 * @subject
 * @content
 *
 */
public class Ex05_02 {
	
	public static void main(String[] args) throws IOException {
		
		// days16.Ex01.java	읽어와서
		// "예외" 문자열 있는 위치값을 모두 출력...
//		String fileName = "C:\\Class\\Workspace\\JavaClass\\Workspace\\javaPro\\src\\days16\\Ex01.java";
		String fileName = ".\\src\\\\days16\\\\Ex01.java";
		String content = getFileContent(fileName);
		
		System.out.println(content);
		
		/*
		// days11 ex03 19줄 ~ 23줄
		int index, fromIndex = 0;
		while (  (index = content.indexOf("예외",fromIndex) ) != -1  ) {
			System.out.println( index );
			fromIndex = index + 1;
		}
		*/
		
		// 예외 문자열을 모두 찾아서 삭제
//		content = content.replace("예외", "[예외]");
		content = content.replaceAll("예외", "[예외]"); // replaceAll -> 정규표현식 사용 가능
//		content = content.replace("예외", "");
		System.out.println(content);
		
		} // main

	private static String getFileContent(String fileName) throws IOException {
		FileReader reader = null;
		
		BufferedReader bufferedReader = null;
		String content = "";

		int one = -1;
		
		try {
			reader = new FileReader(fileName);
			// 보조스트림( 2차 스트림 )
			bufferedReader = new BufferedReader(reader);
			String line = null;
			int lineNumber = 1;
			while ((line = bufferedReader.readLine()) != null) {
//				System.out.printf("%d : %s\n",lineNumber++,line);
				content+=line+"\r\n";
				
			}
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					reader = null;
					
					bufferedReader.close();
					bufferedReader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // try
		}
		return content;
	}
	
}// class
