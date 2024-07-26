package days20;

/**
 * @author jam
 * @date 2024. 7. 26. - 오후 2:01:22
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		Button callButton = new Button(new CallListener());
		callButton.touch();
		
		Button messageButton = new Button();
		messageButton.setListener(new MessageListener());
		
		messageButton.touch();
		
		

	}// main
}// class

// 버튼 - 클릭이벤트 발생 -> 처리
class Button {
	// field
	OnClickListener listener;

	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	Button() {
	}

	Button(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		this.listener.onClick();
	}

	// 중첩 인터페이스
	interface OnClickListener {
		void onClick(); // 추상메서드
	}

}

// Button.OnClickListener 구현한 클래스 선언
class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 건다.");
	}

}

class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("문자 메시지를 전송한다.");
	}

}