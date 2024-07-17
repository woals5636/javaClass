package days13;

/**
 * @author jam
 * @date 2024. 7. 17. - 오후 3:41:35
 * @subject	[static 키워드]
 * @content
 *
 */
public class Ex08 {
	public static void main(String[] args) {
		//
		/*
		Save s1 = new Save("김선우",1000,0.03);
		Save s2 = new Save("김인경",10000,0.03);
		Save s3 = new Save("김재민",5000,0.03);
		Save s4 = new Save("김준석",15000,0.03);
		Save s5 = new Save("박준용",1000,0.03);

		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
		*/
		
		/*
		//클래스 배열 선언 + 사용 수정
		Save [] sArr = new Save[5];

		sArr[0] = new Save("김선우",1000,0.03);
		sArr[1] = new Save("김인경",10000,0.03);
		sArr[2] = new Save("김재민",5000,0.03);
		sArr[3] = new Save("김준석",15000,0.03);
		sArr[4] = new Save("박준용",1000,0.03);
		 */
		
		// 클래스 변수 접근
		// 클래스명.클래스 변수
//		The field Save.rate is not visible
//		System.out.println(Save.rate);
		
		Save [] sArr = {
				new Save("김선우",1000,0.03),
				new Save("김인경",10000,0.03),
				new Save("김재민",5000,0.03),
				new Save("김준석",15000,0.03),
				new Save("박준용",1000,0.03)
		};
		
//		sArr[2].setRate(0.07);
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		}
		
	}
	/*
	 * 생성자에서 또 다른 생성자를 호출할 때의 this 용도
	 * 
	 * public Ex08() {
	 * this(100); System.out.println("1");
	 * }
	 * 
	 * public Ex08(int a) {
	 * this(1,2);
	 * System.out.println("2");
	 * }
	 * 
	 * public Ex08(int a, int b) {
	 * System.out.println("3");
	 * }
	 * 
	 * public static void main(String[] args) {
	 * new Ex08();
	 * }
	 */
}
