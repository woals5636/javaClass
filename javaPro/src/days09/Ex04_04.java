package days09;

/**
 * @author jam
 * @date 2024. 7. 11. - 오후 3:16:37
 * @subject
 * @content
 *
 */
public class Ex04_04 {
	public static void main(String[] args) {
		// 10진수 -> 16진수 출력
		// 125 0x7D
		int n = 125;
		int share, reminder; // share : 몫 reminder : 나머지
		String hex = "";

		char[] ch = {'0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 'd', 'e', 'f'};
		
		while (n != 0) {
			share = n / 16;
			reminder = n % 16;
			hex = ch[reminder]+hex;
			n = share;
		}
		System.out.print("0x" + hex);

	}// main
	
//	StringBuilder 클래스를 활용하여 10진수 정수 -> 16진수 출력
//	
//	public static void main(String[] args) {
//	      // 10 진수 정수 => 16진수 출력.
//	      int n = 125;     //  0x7D
//	      
//	      int remider, share;   
//	      
//	      // String strHex = "";
//	      StringBuilder sb = new StringBuilder();
//	      
//	      String hex = "0123456789ABCDEF";
//	      while ( n != 0 ) {   
//	         share = n / 16;
//	         remider = n % 16;
//	         // System.out.println(remider);
//	         sb.append(hex.charAt(remider));
//	         //sb.insert(0, hex)
//	          
//	         n = share;
//	      } // while
//	      
//	      System.out.println( sb.reverse()  );  
//	      
//	      
//
//	   } // main
}// class
