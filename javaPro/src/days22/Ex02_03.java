package days22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author jam
 * @date 2024. 7. 30. - 오전 10:16:58
 * @subject
 * @content
 *
 */
public class Ex02_03 {
	public static void main(String[] args) {

		String pathname = ".\\src\\days21";
		String keyword = "DataInputStream";
		File parent = new File(pathname);

		File[] list = parent.listFiles((dir, name) -> name.endsWith(".java"));

		File child = null;
		int line = 0;
		String text = null;
		String path = null;
		String fileName = null;
		String strLine = null;

		for (int i = 0; i < list.length; i++) {
			child = list[i];
			fileName = child.getName();
			line = 1;

			try (
					FileReader reader = new FileReader(child);
					BufferedReader br = new BufferedReader(reader)
						) {
				while ((strLine = br.readLine()) != null) {
					strLine = strLine.replaceAll(keyword, "<span style='color:red'>" + keyword + "</span>");
					if (strLine.contains(keyword)) {
						System.out.printf("%d\t%s\t%s\n", line, strLine, fileName);
					}
					line++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}// main
}// class
