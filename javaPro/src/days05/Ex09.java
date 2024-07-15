package days05;

public class Ex09 {

	public static void main(String[] args) {
		String todo = "Auto-generated method stub";
		System.out.println(todo.length());
		int size = todo.length();
		char [] todoCharArr = new char[size];
		String target = "";
		for(int i = 0; i < size; i++) {
			todoCharArr[i] = todo.charAt(i);
			target += todoCharArr[i];
		}
		
		System.out.println(target);
			
	}

}
