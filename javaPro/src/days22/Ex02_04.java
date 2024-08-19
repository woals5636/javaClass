package days22;

import java.io.File;

/**
 * @author jam
 * @date 2024. 7. 30. - 오전 10:33:24
 * @subject
 * @content
 *
 */
public class Ex02_04 {
	public static void main(String[] args) {
		String parent = ".\\src\\days22";
		// days22 폴던 안에 upload 폴더의 유무를 확인한 후 없을 경우에는 폴더를 생성
		File uploadDir = new File(parent,"upload");
		// System.out.println(uploadDir.exists());
		if(!uploadDir.exists()) {
			// uploadDir.mkdir()	// 부모 폴더가 존재하지 않는다면 오류
			// uploadDir.mkdirs()	// 부모 폴더가 존재하지 않더라도 생성됨
			System.out.println(uploadDir.mkdirs());
		}else {
			// upload 폴더 삭제..
			System.out.println(uploadDir.delete());	//
			// uploadDir.deleteOnExit();	// 실행중인 프로그램이 종료되는 시점에 삭제를 하겠다는 메서드
		}
		
		
	}// main
}// class
