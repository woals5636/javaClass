package days20;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days12.Student;

/**
 * @author jam
 * @date 2024. 7. 17. - 오전 9:52:16
 * @subject
 * @content
 *
 */

public class Ex01 {

   public static void main(String[] args) throws IOException {

      final int CLASS_COUNT = 3;
      final int STUDENT_COUNT = 30;
      
      ArrayList<Student> c1List= new ArrayList<>(STUDENT_COUNT);
      ArrayList<Student> c2List= new ArrayList<>(STUDENT_COUNT);
      ArrayList<Student> c3List= new ArrayList<>(STUDENT_COUNT);
      
      ArrayList<ArrayList<Student>> sList = new ArrayList<ArrayList<Student>>();
      sList.add(c1List);	// c1List.size()
      sList.add(c2List);	// c2List.size()
      sList.add(c3List);	// c3List.size()

      char con = 'y';
      String name;
      int kor, eng, mat,tot,rank,wrank;
      double avg;

      Scanner scanner = new Scanner(System.in);
      int cIdx;
      
      do {
         System.out.printf("> 반 입력 ? ");
         cIdx = scanner.nextInt()-1; // 0 or 1 or 2 [2] 
         
         ArrayList<Student> cList = sList.get(cIdx);
         
         System.out.printf("> %d반의 [%d]번 학생의 이름, 국어, 영어, 수학 입력?",  cIdx+1, cList.size()+1);

         name = getName();  // scanner.next();
         kor =  getScore(); // scanner.nextInt();
         eng =  getScore(); // scanner.nextInt();
         mat =  getScore(); // scanner.nextInt();
         tot = kor + eng + mat;
         avg = (double)tot / 3;
         wrank = rank = 1;

         Student s = new Student();

         s.name = name;
         s.kor=kor;
         s.eng=eng;
         s.mat=mat;
         s.tot=tot;
         s.rank=rank;
         s.wrank=wrank;
         s.avg=avg;

         cList.add(s);

         // 입력 계속 ?
         System.out.print("> 입력 계속 ? ");
         con = (char)System.in.read();
         System.in.skip(System.in.available());
      } while ( Character.toUpperCase(con) == 'Y'   );

		// 등수 처리
		for (int i = 0; i < sList.size(); i++) {
			for (int j = 0; j < sList.get(i).size(); j++) {
				for (int i2 = 0; i2 < sList.size(); i2++) {
					for (int j2 = 0; j2 < sList.get(i2).size(); j2++) {
						if (sList.get(i).get(j).tot < sList.get(i2).get(j2).tot) {
							sList.get(i).get(j).wrank++;
							if (i == i2) {
								sList.get(i).get(j).rank++;
							}
						}
					}
				}
			}
		}

      // 출력
//      System.out.println(c1List.size());
//      System.out.println(c2List.size());
//      System.out.println(c3List.size());
      Iterator<ArrayList<Student>> ir = sList.iterator();
      while (ir.hasNext()) {
         ArrayList<Student> cList = ir.next();
         System.out.println("=".repeat(50));
         System.out.printf("총학생수 : %d명\n", cList.size());
         Iterator<Student> ir2 = cList.iterator();
         while (ir2.hasNext()) {
            Student s = ir2.next();
            System.out.println(s);
         }

      } // while
      
      
   } // main


   public static String getName() {
      // 성 128개
      Random rnd = new Random();
      String [] lastNames =  {"김","이", "박", "최", "권", "홍"};
      int index =  rnd.nextInt(lastNames.length);
      String name = lastNames[index];

      // 이름 : 2문자
      char [] firstNames = new char[2];
      for (int i = 0; i < firstNames.length; i++) {
         firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1) + '가');
      }
      // char[] -> String
      String firstName = String.valueOf(firstNames);

      name += firstName;
      return name;
   }



   public static int getScore() {
      return (int)(Math.random()*101);
   }





} // class

