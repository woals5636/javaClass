package days21;

import days14.Regular;
import days15.SalesMan;

public class Ex08_03 {

	public static void main(String[] args) {

		// Regular emp = new Regular();
		Regular emp = new SalesMan();
		SalesMan emp2 = (SalesMan) emp; //ClassCastException

		System.out.println("XX");

	}

}
