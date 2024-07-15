package days10;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author jam
 * @date 2024. 7. 15. - 오전 8:16:52
 * @subject
 * @content
 *
 */

public class Ex04 {

	static int index = 0;
	static char con = 'y';
	static Scanner scanner = new Scanner(System.in);
	static int [] m = new int[2];
	static int selectedNumber ; // 선택된 메뉴 번호를 저장할 변수
	static String [] menus = {"추가","수정","삭제","검색","조회","종료"};

	public static void main(String[] args) throws IOException {

		while (true) {
			dispMenus();
			selectMenus();
			processMenus();
		} // while

	} // main

	// [enum 열거형 선언]
	static final int ADD = 1;
	static final int EDIT = 2;

	private static void processMenus() throws IOException {
		switch (selectedNumber) {
		case ADD: // 추가
			add();
			break;
		case EDIT: // 수정
			break;
		case 3: // 삭제
			// 삭제할 index = 2
			//[3, 5, 2, 4, 1, 3, 0,0]
			//[3, 5, 4, 1, 3, 0,0, 0]
			delete();
			break;
		case 4: // 검색
			search();
			break;
		case 5: // 조회 - 배열의 모든 요소 출력
			list();
			break;
		case 6: // 종료
			exit();
			break;
		default:
			break;
		} // switch
		일시정지();
	}

	private static void search() {


	}

	private static void delete() {
		System.out.println("[3. 삭제]");
		int deleteIndex ;

		String regex = String.format("[0-%d]", index-1) ;
		String inputData ;
		do {
			System.out.print("> 삭제할 index 입력 ? ");
			inputData = scanner.next();
		} while (  !inputData.matches(regex)  );
		deleteIndex = Integer.parseInt(inputData);
		//       2
		//[3, 5, 2, 4, 1, 0, 0, 0]
		for (int i = deleteIndex+1; i < index; i++) {
			m[i-1]= m[i];
		}
		m[index-1] = 0;
		index--;
	}

	private static void 일시정지() {
		System.out.print("> Enter를 누르면 계속합니다.");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n\n\n\n");
	}

	private static void list() {
		System.out.println("[5. 조회]");
		if (index == 0) {
			System.out.println("\t 추가된 요소가 없습니다.");
			return ;
		} // if

		// 출력
		for (int i = 0; i < index ; i++) {
			System.out.printf("m[%d]=%d ", i, m[i] );
		}
		System.out.println();

	}

	private static void add() throws IOException {
		//      2
		//      ↓
		//  [][]
		System.out.println("[1. 추가]");
		do {
			if( m.length == index ) {
//				System.out.println("\t 풀방...");
//				return ;
				increaseArrayM();
			}
			System.out.printf("> 정수입력 ? ");
			int n = scanner.nextInt();
			m[index++] = n;
			System.out.print("\t 요소추가 계속할거냐? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13,10
		} while ( Character.toUpperCase(con) == 'Y' );



	}

	private static void increaseArrayM() {
		int [] temp = new int[ m.length + 3 ];
//		for (int i = 0; i < m.length; i++) {
//			temp[i] = m[i];
//		}
		System.arraycopy(m, 0, temp, 0, m.length);
		m = temp;
	}

	private static void exit() {
		// return ;
		System.out.println("\n\n 프로그램 종료합니다.~");
		System.exit(-1);

	}

	private static void selectMenus() {
		String regex = "[1-6]";
		String inputData ;
		do {
			System.out.print("> 메뉴 선택하세요? "); // 1~6
			inputData = scanner.next();
		} while (  !inputData.matches(regex)  );
		selectedNumber = Integer.parseInt(inputData);
	}

	private static void dispMenus() {
		System.out.println("\t\t\t[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("[%d]%s\t", i+1, menus[i]);
		}
		System.out.println();
	}

} // class
