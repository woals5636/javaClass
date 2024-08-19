package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author jam
 * @date 2024. 7. 30. - 오전 9:01:30
 * @subject
 * @content
 *
 */
public class Ex01 {
	
	public static void main(String[] args) throws IOException {
		// [ File 클래스 ]
		//	 ㄴ 파일, 디렉토리
		
		String pathname = ".\\src\\days21\\Ex01.java";
//		String pathname = "C:\\Class\\Workspace\\JavaClass\\Workspace\\javaPro\\.\\src\\days21\\Ex01.java";
		
		File file = new File(pathname);
		
		System.out.println(file.getParent());			//출력값 : .\src\days21
		System.out.println(file.getName());				//출력값 : Ex01.java
		
		System.out.println(file.getPath());				//출력값 : .\src\days21\Ex01.java
		
		// 절대 경로
		System.out.println(file.getAbsolutePath());		//출력값 : C:\Class\Workspace\JavaClass\Workspace\javaPro\.\src\days21\Ex01.java
		// 표준 경로
		System.out.println(file.getCanonicalPath());	//출력값 : C:\Class\Workspace\JavaClass\Workspace\javaPro\src\days21\Ex01.java

		System.out.println(file.isFile());		// 파일여부를 확인하는 메서드 		// 출력값 : true
		System.out.println(file.isDirectory());	// 디렉토리여부를 확인하는 메서드		// false
		System.out.println(file.length());		// 파일의 용량을 확인하는 메서드		// 단위는 byte
		System.out.println(file.exists());		// 파일의 존재여부 확인하는 메서드	// 출력값 : true
		
		// OS에서 사용하는 경로 구분자
		System.out.println(file.pathSeparator);	// 출력값 : ;
		// OS에서 사용하는 이름 구분자
		System.out.println(file.separator);	// 출력값 : \
		
		// Ex01.java
		String fileName = file.getName();
		// 확장자
		String ext;
		// 확장자를 제외한 파일명
		String name;

	}// main
	
}// class
