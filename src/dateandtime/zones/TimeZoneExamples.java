package dateandtime.zones;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class TimeZoneExamples {

    public static void main(String[] args) {

        ZoneId USEast = ZoneId.of("America/New_York");
        LocalDate date = LocalDate.of(2014, Month.MARCH, 23);
        LocalTime time = LocalTime.of(9, 30);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        ZonedDateTime courseStart = ZonedDateTime.of(date, time, USEast);
        ZonedDateTime hereNow = ZonedDateTime.now(USEast).truncatedTo(ChronoUnit.MINUTES);

        System.out.println("Here now: " + hereNow);
        System.out.println("Course start: " + courseStart);

        ZonedDateTime newCourseStart = courseStart.plusDays(2).minusMinutes(30);
        System.out.println("New course start: " + newCourseStart);

    }
}
