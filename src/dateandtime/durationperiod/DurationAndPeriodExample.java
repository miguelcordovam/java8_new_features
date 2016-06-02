package dateandtime.durationperiod;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriodExample {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(12,5);
        LocalTime time2 = LocalTime.of(20,5);

        Duration duration = Duration.between(time1, time2);

        System.out.println(duration.getSeconds());


        LocalDate date1 = LocalDate.of(2016,5,11);
        LocalDate date2 = LocalDate.of(2016,10,11);

        Period period = Period.between(date1, date2);

        System.out.println(period);
    }
}
