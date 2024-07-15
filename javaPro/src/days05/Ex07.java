package days05;

import java.util.Scanner;

/**
 * @author jam
 * @date 2024. 7. 5. - 오후 2:53:43
 * @subject  컴퓨터 - 사용자(USER)
 * @content  [ 가위(1), 바위(2), 보(3) 게임 ]
 *           컴퓨터는 게임을 할 때마다 임의의 수(1~3) 발생
 *           사용자는 1~3  입력.
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		int user;
		int com = (int)(Math.random() * 3) + 1;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
		user = sc.nextInt();
		
		System.out.printf("사용자 : %d, 컴퓨터 : %d \n",user,com);

		int result = user - com;

		/*
		String strUser = "가위";
		if( user == 2 ) strUser = "바위";
		else if( user == 3) strUser ="보";

		String strCom = "가위";
		if( com == 2 ) strCom = "바위";
		else if( com == 3) strCom ="보";
		
		System.out.printf("사용자 : %d, 컴퓨터 : %d \n",strUser,strCom);
		*/

		/* switch문
		switch(result) {
		case 0:
			System.out.println("무승부");
			break;
		case 1: case -2:
			System.out.println("사용자 승리");
			break;
		case -1: case 2:
			System.out.println("컴퓨터 승리");
			break;
		}
		*/
		
		// if문
		
		if(result == 1 || result == -2) {
			System.out.println("사용자 승리");
		}else if(result == -1 || result == 2) {
			System.out.println("컴퓨터 승리");
		}else {
			System.out.println("무승부");
		}
		
		sc.close();
	}

}
