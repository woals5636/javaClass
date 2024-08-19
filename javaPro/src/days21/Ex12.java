package days21;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author jam
 * @date 2024. 7. 29. - 오후 3:44:29
 * @subject
 * @content
 *
 */
public class Ex12 {
	public static void main(String[] args) throws IOException {
		// Piped[Reader] / Piped[Writer]
		// ㄴ 스레드 간에 데이터를 입출력할 때 사용하는 스트림
		// [RandomAccessfile]
		// ㄴ 파일의 어느 위치에나 읽기/쓰기가 가능한 장점이 있는 스트림.
		// ㄴ getFilePoint() 파일포인트
		// seek(위치)
		// readxxx(), writeXXX()

		String s = "I Love normal Java";
		String q = "javabook";

		String name = ".\\src\\days21\\random.txt";
		String mode = "rw"; // read, write

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			long fp = raf.getFilePointer();
			System.out.println("현재 파일 포인터 : " + fp);
			raf.writeBytes(s);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available()); // 13,10 제거

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek(7);
			raf.writeBytes(q);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available()); // 13,10 제거
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" e n d ");
	}// main
}// class

