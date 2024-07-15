package days09;

/**
 * @author jam
 * @date 2024. 7. 11. - 오후 4:30:02
 * @subject
 * @content
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		// int [] kor = new int[270];
		// 3학년 2반 17번 학생의 국어
		// kor[226]
		// int [][][] kor = new int[3][3][30]
		// kor[2][1][16]


		// int [] m = new int[24];
		// int [][] m = new int[4][6];
		//int [][][] m = new int[2][3][4];  // 2면 3행 4열
		int [][][]m = 	{
				{
					{1,2,3,4},
					{5,6,7,8}
				},
				{
					{1,2,3,4},
					{5,6,7,8}
				}
		};

//		System.out.println(m.length); // 면 갯수
//		System.out.println(m[0].length); // 0면의 행 갯수
//		System.out.println(m[0][0].length); // 0면 0행의 열 갯수
		
		disp(m);

	}// main

	private static void disp(int[][][] m) {
		for (int i = 0; i < m.length; i++) {  // 면 갯수

			System.out.println(i+"면");
			for (int j = 0; j < m[i].length; j++) { // 행 갯수

				for (int k = 0; k < m[i][j].length; k++) { // 열 갯수

					System.out.printf("m[%d][%d][%d]=%d\t",i,j,k,m[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}//disp
	
}// class
