package days12;

/**
 * @author jam
 * @date 2024. 7. 16. - 오후 3:33:34
 * @subject
 * @content
 *
 */
public class Ex07 {
	public static void main(String[] args) {
		// Call By Name
		// Call By Value
		// Call By Reference
		int x = 10, y = 20;
		
		System.out.printf("x=%d,y=%d\n",x,y);
		
		/*
		 * int temp = x;
		 * x = y;
		 * y = temp;
		 */		
		swap(x,y);
		
		System.out.printf("x=%d,y=%d\n",x,y);

	
	}// main

	private static void swap(int x, int y) {
		 int temp = x;
		 x = y;
		 y = temp;
	}
	
}// class
