package days16;

/**
 * @author jam
 * @date 2024. 7. 22. - 오후 3:41:01
 * @subject
 * @content
 *
 */
public class Ex05_03 {
	public static void main(String[] args) {

		String[] urlArr = { "www.naver.com", "http://www.naver.com", "http://www.naver.com", "http://www.daum.net" };

//		for (int i = 0; i < urlArr.length; i++) {
//			if(urlArr[i].startsWith("http://")) {
//				System.out.println(urlArr[i]);
//			}
//		}

//		String regex = "^http://";	^ -> NOT 과 동일한의미
//		String regex = "^com$://";
		
		for (int i = 0; i < urlArr.length; i++) {
			if (urlArr[i].endsWith(".com")) {
				System.out.println(urlArr[i]);
			}
		}

	}// main
}// class
