package days21;

/**
 * @author jam
 * @date 2024. 7. 29. - 오전 9:27:54
 * @subject
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		/*
		 * [ 자바 IO (input + output) == 입출력 ]
		 * 
		 * 1. [컴퓨터(프로그램)]	--> 송신	[외부장치(다른프로그램)]
		 * 					<-- 수신
		 * 2. 프로그램 간에 데이터를 주고 받는 것 : 입출력
		 * 3. 두 장치를 연결해 주고 데이터를 운반하는 통로 : 스트림(Stream)
		 * 4. 스트림
		 * 		1) 사전적 의미 : 흐르는 물
		 * 		2) 단방향
		 * 			- 읽기(입력용) 스트림
		 * 			- 쓰기(출력용) 스트림
		 * 		3) 연속적인 데이터의 흐름
		 * 		4) 자바의 모든 입출력은 스트림(Stream)이라는 개념으로 이루어져 있다.
		 * 
		 * 	예)
		 * 	외부장치		--> 수신		[프로그램]		송신	--> 	모니터
		 * 
		 * 	표준입력장치	입력스트림					출력스트림
		 * 	키보드		System.in				System.out
		 * 				스트림객체					스트림객체
		 * 
		 * 5. 자바의 스트림은 2가지 종류로 구분한다.
		 * 		1) 문자일 경우에는 문자(텍스트) 스트림
		 * 			최상위 부모 클래스 : Reader, Writer
		 * 							FileReader, FileWriter
		 * 							파일을 문자로 입출력하는 입력, 출력스트림
		 * 
		 * 			1문자 == 유니코드 2바이트 == char
		 * 			
		 * 
		 * 		2) 바이트(이진) 스트림
		 * 			최상위 부모 클래스: InputStream, OutputStream
		 * 						   Properties 컬렉션 클래스
		 * 						   File[OutputStream]
		 * 						   파일을 이진데이터로 입출력하는 입력, 출력 스트림
		 * 
		 * 			1byte(8bit), 바이트 배열, 정수(int)
		 * 
		 * 	6. 보조스트림 : 어떤 스트림의 IO을 더 쉽도록 보조 역할을 하는 스트림
		 * 
		 * 		FilesReader reader = XX;
		 * 		BufferedReader br = new BufferedReader(매개변수)
		 * 
		 * 
		 * 
		 * */
	}// main
}// class
