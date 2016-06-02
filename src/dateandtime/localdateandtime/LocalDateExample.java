package dateandtime.localdateandtime;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.TemporalAdjusters.next;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate now, bDate, nowPlusMonth, nextTuesday;

        now = LocalDate.now();

        System.out.println("Now: " + now);

        bDate = LocalDate.of(1995, 5, 23);
        System.out.println("Java's bday: " + bDate);
        System.out.println("Is Java's bday in the past? " + bDate.isBefore(now));
        System.out.println(bDate.isLeapYear());
        System.out.println(bDate.getDayOfWeek());

        nowPlusMonth = now.plusMonths(1);
        System.out.println("The date a month from now " + nowPlusMonth);

        nextTuesday = now.with(next(DayOfWeek.TUESDAY));
        System.out.println("Next tuesday's date: " + nextTuesday);

        System.out.println(getFormattedDate(new Timestamp(100000000000l)));
    }

    private static String getFormattedDate(Timestamp createdDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");

        LocalDateTime dateTime = createdDate.toLocalDateTime();

        return dateTime.format(formatter);
    }
}