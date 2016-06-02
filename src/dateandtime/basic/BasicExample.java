package dateandtime.basic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class BasicExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2012, 2, 18);
		
		int year = date.getYear();
		
		Month month = date.getMonth();
		
		int day = date.getDayOfMonth();
		
		System.out.println("Year : " + year);
		System.out.println("Month : " + month.name());
		System.out.println("Day : " + day);
		
		DayOfWeek dow = date.getDayOfWeek();
		System.out.println(dow);

		int len = date.lengthOfMonth();
		System.out.println(len);

		boolean leap = date.isLeapYear();
		
		System.out.println("Is leap year ? " + leap);

		LocalDate date1 = LocalDate.of(2014, 3, 18);
		LocalDate date2 = date1.withYear(2011);
		LocalDate date3 = date2.withDayOfMonth(25);
		LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 9);
		
		System.out.println(date4);
	}
}
