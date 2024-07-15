package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

   public static void main(String[] args) throws IOException {
      /*
       *  + : 문자열 연결 연산자, 덧셈 연산자, 부호연산자
       *  ------------------------->
         1.  + 연산의 결과를 적으세요.
            ㄱ. 3 + 5 + 0     // 8
            ㄴ. 3 + 5 + "0" String // "80"
               ㄷ. 3 + 5 + '0' char   // 56
            2. 이름, 나이, 등급('A','B','C','D','F')을 입력받아서 출력
           [입력형식]
           이름, 나이, 등급을 입력하세요 ? _
           [출력형식]
           이름="홍길동", 나이=23살, 등급='B'
       * */
        /*
      String s = "안녕하세요";
      System.out.println( s.charAt(0) );
      System.out.println( s.charAt(1) );
      System.out.println( s.charAt(2) );
      System.out.println( s.charAt(3) );
      System.out.println( s.charAt(4) );
      */

      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      String name;
      byte age;
      char grade;

      System.out.print("이름 입력하세요 ?");
      name = bufferedReader.readLine();
      System.out.print("나이 입력하세요 ?");
      // String -> byte 타입변환
       age = Byte.parseByte( bufferedReader.readLine() );
      // cast 연산자로 타입변환 -  숫자타입, 클래스 간의 형변환
      //age = (byte)bufferedReader.readLine() ;
      System.out.print("등급 입력하세요 ?");
      // String -> char
      //  A  식별자
      // "A" 문자열 = 'A'+'\0'
      // 'A' 문자
      /*
      String strGrade = bufferedReader.readLine(); // "A널"
      grade = strGrade.charAt(0);
      */
      grade = bufferedReader.readLine().charAt(0);

      System.out.printf("이름=\"%s\", 나이=%d살, 등급='%c'"
            , name , age, grade);

   } // main

} // class
