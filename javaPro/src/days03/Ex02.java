package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jam
 * @date 2024. 7. 3. - 오전 10:51:25
 * @subject Scanner
 * @content
 *
 */
public class Ex02 {
	public static void main(String[] args) throws IOException {
		// Ctrl + Shift + O   -> 자동 import

		// 이름을 표준입력장치(키보드)로 부터 입력 받아서 출력
		// 키보드 -> System.in -> 문자변환 -> 문자열 변환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Unhandled exception type IOException
		System.out.print("> 이름 입력 ? ");
		String name = br.readLine();

		System.out.println(name);
		// System 은 import하지 않아도 되는 이유? 컴파일시 import java.lang.* 자동으로 됨
	}

}
