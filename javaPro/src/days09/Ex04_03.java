package days09;

/**
 * @author jam
 * @date 2024. 7. 11. - 오후 3:16:37
 * @subject
 * @content
 *
 */
public class Ex04_03 {
	public static void main(String[] args) {
		// 10진수 -> 16진수 출력
		// 125 0x7D
		int n = 125;
		int share, reminder; // share : 몫 reminder : 나머지
		String hex = "";

		while (n != 0) {
			share = n / 16;
			reminder = n % 16;
			switch (reminder) {
			case 10:
				hex = 'A' + hex;
				break;
			case 11:
				hex = 'B' + hex;
				break;
			case 12:
				hex = 'C' + hex;
				break;
			case 13:
				hex = 'D' + hex;
				break;
			case 14:
				hex = 'E' + hex;
				break;
			case 15:
				hex = 'F' + hex;
				break;
			default:
				hex = reminder + hex;
				break;
			}
			n = share;
		}
		System.out.print("0x" + hex);

	}// main
}// class
