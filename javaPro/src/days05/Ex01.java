package days05;

//import java.util.Scanner;

public class Ex01 {

/*
1. 대문자를 소문자로 변환하는 코딩을 하세요. 

A)
(1)
public static void main(String[] args) {
		char uc = 'A';
		char lc = (char)(uc +32);
		
		
		System.out.println(lc);
	}
---------------------------------------------------------------
2.  1+2+3+..+9+10=55   출력하는 코딩( for문 사용 )
(1) for문만 사용
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			// (2)삼항 연산자 사용
			System.out.printf(i==10?"%d":"%d+",i);	
			// (1) if문 사용
			//			if(i==10) {
			//				System.out.printf("%d",i);
			//			}else {
			//				System.out.printf("%d+",i);
			//			}
			sum+=i;
		}
		// (3) 정규 표현석 \b 사용
		//		System.out.printf("\b=%d",sum);
		System.out.printf("=%d",sum);
		
(2) 배열 사용
public static void main(String[] args) {

	int sum = 0;
		
	int [] arr = {1,2,3,4,5,6,7,8,9,10};
		
	for(int x = 0; x < arr.length; x++) {
		if(x+1==arr.length) {
			System.out.printf("%d",arr[x]);
		}else {
			System.out.printf("%d+",arr[x]);
		}
		sum +=arr[x];
	}
	System.out.printf("=%d",sum);		
}
---------------------------------------------------------------
3. return 문, break 문에 대해서 설명하세요. 
return	: 
break	: 
---------------------------------------------------------------
4. for문을 사용해서  아래와 같이 출력하는 코딩을 하세요.

   [실행결과]
   01 - 헬로우 월드  
   02 - 헬로우 월드  
   03 - 헬로우 월드  
   04 - 헬로우 월드  
   05 - 헬로우 월드  
   06 - 헬로우 월드  
   07 - 헬로우 월드  
   08 - 헬로우 월드  
   09 - 헬로우 월드  
   10 - 헬로우 월드
   
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
				System.out.printf("%02d - 헬로우 월드\n",i);
		}
	}
---------------------------------------------------------------
5. 배열의 정의
	-> 동일한 자료형 + 메모리상에 연속적으로 놓이게 한 것.
5-2. 배열의 선언 형식
	-> 타입 [] 배열명 = new 타입[배열크기];
5-3. 배열의 크기를 알아오는 코딩
	-> 배열명.length
5-4. 배열의 윗첨자값(UpperBound) 알아오는 코딩
	-> 배열명.length - 1
5-5. 배열의 각 요소는 어떻게 표현하는 가
	-> 배열명[인덱스값]
---------------------------------------------------------------
6. 우리가 지금까지 배운 문자열(String)을 다루는 메서드를 모두 적으세요.
ex) charAt()

	char String.charAt()
	String [] String.split(String regex)	-> regex를 기준으로 나누어 요소에 값 기입
	String.toUpperCase()	-> 소문자를 대문자로
	String.toLowerCase()	-> 대문자를 소문자로
	String.trim()	-> 공백제거
	String.equals()	-> 동일여부 확인
	String.equalsIgnoreCase()	-> 대소문자 구분하지 않고 동일여부 확인
	String String.format("출력형식", 문자열)
---------------------------------------------------------------
7. [입력형식]
   팀원들을 입력하세요 ? 홍길동,이시훈, 송세호
   [출력형식]
   1. 팀원 : 홍길동
   2. 팀원 : 이시훈
   3. 팀원 : 송세호
   
   라고 출력하는 코딩을 하세요.
   
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("팀원들을 입력하세요 ? ");
		String [] name = sc.nextLine().split("\\s*,\\s*");

		for(int i = 0; i<name.length ; i++) {
			System.out.println(i+1+". 팀원 : "+name[i]);
		}
		sc.close();
	}
---------------------------------------------------------------
*/
	public static void main(String[] args) {

		int sum = 0;
			
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i : arr) {
			if(i+1==arr.length) {
				System.out.printf("%d",arr[i]);
			}else {
				System.out.printf("%d+",arr[i]);
			}
			sum +=arr[i];
		}
		System.out.printf("=%d",sum);		
	}

}
