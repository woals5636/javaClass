package days03;

/*
[출력형식] 이름="홍길동", 나이=25 
라고 출력하는 코딩을 하세요  
조건) printf() 메서드 사용~
(이클립스 사용해서 코딩하고 결과는 복사 붙이기하세요.) 
*/

public class Test2 {

	public static void main(String[] args) {
		int x = 10 , y = 20;
		int tmp;
		
		tmp = 10;
		x = y;
		y = tmp;
		
		System.out.printf("x = %d, y= %d",x,y);
	}

}
