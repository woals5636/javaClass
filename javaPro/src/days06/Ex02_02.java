package days06;

import java.io.IOException;

/**
 * @author jam
 * @date 2024. 7. 8. - 오전 10:24:27
 * @subject
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) throws IOException {
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if (i % 10 == 0)
				System.out.printf("%02d : ", lineNumber++);
			System.out.printf("[%c]", i);
			if (i % 10 == 9) {
				System.out.println();
				if (lineNumber % 10 ==1) {
					System.out.print(" 엔터");
					System.in.read();
					System.in.skip(System.in.available());
				}
			}
		} // for
	}// main

}// class
