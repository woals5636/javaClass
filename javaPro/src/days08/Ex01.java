package days08;

public class Ex01 {

	public static void main(String[] args) {

		int lottoNumber;

		int[] lotto = new int[6];

		fillLotto(lotto);

		dispLotto(lotto);

	}

	public static void fillLotto(int[] lotto) {
		int lottoNumber;
		lotto[0] = (int) (Math.random() * 45) + 1;
		
		int index = 1;
		boolean isDuplicate = false;
		while (index <= 5) {
			isDuplicate = false;
			lottoNumber = (int) (Math.random() * 45) + 1;
			System.out.println(lottoNumber);
			// 중복체크를 한 후에 중복되지 않으면
			for(int i = 0; i < index; i++) {
				if(lotto[i]==lottoNumber) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate)lotto[index++] = lottoNumber;
		}
		
//		for (int i = index; i < lotto.length; i++) {
//			lottoNumber = (int) (Math.random() * 45) + 1;
//			lotto[i] = lottoNumber;
//		}
	}

	public static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		}
		System.out.println();
	}

}
