package days15;

/**
 * @author jam
 * @date 2024. 7. 19. - 오후 4:11:21
 * @subject
 * @content
 *
 */
public class Ex08 {
	public static void main(String[] args) {
		
		Idisp a1 = new A();
		Idisp b1 = new B();
//		a1.disp();
		
		print(a1);
		print(b1);
		
		
	}// main
	
	static void print( Idisp obj) {
		// TODO Auto-generated method stub
		
	}
	
}// class

interface Idisp{
	void disp();
}

class A implements Idisp{

	@Override
	public void disp() {
		// 구현
	}
	
}

class B implements Idisp{

	@Override
	public void disp() {
		// 구현
	}
	
}