package days14;

import java.util.Arrays;

public class Ex01 {

	   public static void main(String[] args) {
	      String n = "keNik";
	      String m= "kKnie";

	      char [] nArr  = n.toUpperCase().toCharArray();
	      char [] mArr = m.toUpperCase().toCharArray();

	      //System.out.println(n);
	      //System.out.println(m);

	      Arrays.sort(nArr);
	      Arrays.sort(mArr);

	      System.out.println( Arrays.toString(nArr));
	      System.out.println( Arrays.toString(mArr));

	      //System.out.println(  Arrays.equals(nArr, mArr)  );
	      
	      // char [] -> String
	      // String -> char[]
	      n = String.valueOf(nArr);
	      m = String.valueOf(mArr);
	      
	      System.out.println( n.equals(m) );

	   } // main

	} // class

