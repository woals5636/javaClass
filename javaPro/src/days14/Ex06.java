package days14;

import days12.Tv;

/**
 * @author jam
 * @date 2024. 7. 18. - 오후 12:19:43
 * @subject
 * @content
 *
 */
public class Ex06 {
	public static void main(String[] args) {
		// days12.Tv 클래스 + 상속 => 자막 기능 새로운 Tv 작성.

		CaptionTv ctv = new CaptionTv();
		ctv.power(); // 전원 ON

		ctv.channelUp();
		ctv.channelDown();
		System.out.println(ctv.channel);

		ctv.caption = true; // 자막 기능 ON
		ctv.dispCaption("Hello World~");
		ctv.dispCaption("Hi~");

		ctv.power(); // 전원 OFF
		System.out.println(" end ");


	}// main
}// class

class CaptionTv extends Tv{	

	boolean caption = false;	// 자막 기능 ON(true) / OFF(false)

	void dispCaption(String message) {
		if(caption) {
			System.out.println(message);
		}
	}
}