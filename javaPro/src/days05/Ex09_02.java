package days05;

public class Ex09_02 {

	public static void main(String[] args) {
		String todo = "Auto-generated method stub";
		
		char [] todoCharArr = todo.toCharArray();
		
//		(1)
//		String target = new String(todoCharArr);
//		System.out.println(target);
		
//		(2)
		String target = String.valueOf(todoCharArr);
		System.out.println(target);
	}

}
