package days23;

import java.io.File;
import java.util.stream.Stream;

/**
 * @author jam
 * @date 2024. 8. 2. - 오전 9:27:20
 * @subject
 * @content
 *
 */
public class Ex08 {
	public static void main(String[] args) {
		File [] fileArr = {
				new File("Ex1.java"), 
				new File("Ex1.bak"),             
				new File("Ex2.java"), 
				new File("Ex1"), 
				new File("Ex1.txt")
		};
		
		/*
		Stream<File> s = Stream.of(fileArr);
		//map() 스트림의 요소를 변환
		// 모든 파일명만 출력
		Stream<String> s2 = s.map(File::getName);
		s2.forEach(System.out::println);
		*/

		Stream<File> fs = Stream.of(fileArr);
		fs.map(File::getName)
		.filter(s -> s.indexOf('.') != -1) // 확장자 없는 파일명은 제외
		.map(s->s.substring(s.indexOf('.')+1))	// 확장자만 필터
		.distinct()
		.forEach(System.out::println);
	}
}
