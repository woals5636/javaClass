package days14;

public class Test {

	public static void main(String[] args) {
		String n = "keNik";
		String m = "kKnie";

		char[] nArr = n.toLowerCase().toCharArray();
		char[] mArr = m.toLowerCase().toCharArray();

		int countN = 0;
		int countM = 0;

		for (int i = 0; i < nArr.length; i++) {

			if (nArr[i] == 'k' || nArr[i] == 'n') {
				countN++;
			}
		}

		for (int i = 0; i < mArr.length; i++) {

			if (mArr[i] == 'k' || mArr[i] == 'n') {
				countM++;
			}
		}

		if(countN==countM) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
