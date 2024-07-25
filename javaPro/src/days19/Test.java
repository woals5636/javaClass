package days19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt = ldt.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(ldt);
	}
}
