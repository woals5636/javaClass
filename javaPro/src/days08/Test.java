package days08;

public class Test {

	public static void main(String[] args) {

		for (int i = 'A', count = 1, lineNum = 1; i <= 'z'; i++) {
			if (!Character.isAlphabetic(i))
				continue;
//			if('Z'<i&&i<'a')continue; 8번 코드와 동일
			if (count % 10 == 1)
				System.out.printf("%d: ", lineNum++);
			System.out.printf("%c(%03d)", i, i);
			if (count++ % 10 == 0) {
				System.out.println();
			}
		}

	}

}
