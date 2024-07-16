package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오전 11:49:40
 * @subject
 * @content
 *
 */
public class Tv {
	
	// 멤버(구성요소)
	//  ㄴ 멤버변수(필드) - 속성(property) == 특징
	//	ㄴ [접][기] 자료형 필드명[=초기값];
	// 지역번수는 초기화하지 않으면 사용할 수 없다.
	
	public boolean power;
	public int channel = 1;
	public String color = null;
	
	// 멤버함수==메서드(method)==동작(기능)
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
}// class
