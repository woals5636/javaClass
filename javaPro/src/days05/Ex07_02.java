package days05;

import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 5. - 오후 3:51:04
 * @subject
 * @content [ 가위(1), 바위(2), 보(3) 게임 ] 컴퓨터는 게임을 할 때마다 임의의 수(1~3) 발생 사용자는 1~3 입력.
 *
 *          0 ~ 100점수 : 1~45 로또번호 :
 *
 */

public class Ex07_02 {

	public static void main(String[] args) {
		int com, user;
		Scanner sc = new Scanner(System.in);
		com = (int) (Math.random() * 3) + 1;
		System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
		user = sc.nextInt();

		// rock paper scissors
		String[] rps = { "", "가위", "바위", "보" };

		System.out.printf("사용자 : %s, 컴퓨터 : %s \n", rps[user], rps[com]);

		switch (user - com) {
		case 0:
			System.out.println("무승부");
			break;
		case 1:
		case -2:
			System.out.println("사용자 승리");
			break;
		default:
			System.out.println("컴퓨터 승리");
			break;
		}
		sc.close();
	} // main

} // class
