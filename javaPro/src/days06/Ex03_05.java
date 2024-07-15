package days06;


public class Ex03_05 {

	public static void main(String[] args) {
		// 정규표현식
		// [문제] 주민등록번호 14자리를 입력받아서 ..
		String [] rrnArr = {
				"123456-1234567"
				, "123456-123456"
				, "123456-12345678"
				, "123a56-12#4567"
				, "1234561234567"
		};

		String regex = "\\d{6}-\\d{7}";

		/*
		System.out.println(rrnArr[0].matches(regex) );
		System.out.println(rrnArr[1].matches(regex) );
		System.out.println(rrnArr[2].matches(regex) );
		System.out.println(rrnArr[3].matches(regex) );
		*/
		for (int i = 0; i < rrnArr.length; i++) {
			System.out.printf("%s - %b\n",
					rrnArr[i],rrnArr[i].matches(regex) );
		}


		// [문제] 우편번호 000-000     00000
		String [] zipcodeArr = {
				"123-456"
				, "1234-123"
				, "12345"
				, "123a5"
		};

		System.out.println("=".repeat(30));

		regex = "\\d{3}-\\d{3}|\\d{5}";
		for (int i = 0; i < zipcodeArr.length; i++) {
			System.out.printf("%s - %b\n",
					zipcodeArr[i],zipcodeArr[i].matches(regex) );
		}

	}

}
