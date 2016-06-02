package dateandtime.durationperiod;

import java.time.*;

public class PeriodExample {

    public static void main(String[] args) {

        Period oneDay = Period.ofDays(1);
        System.out.println(oneDay);

        LocalDateTime beforeDST = LocalDateTime.of(2014, Month.MARCH, 8, 12, 00);
        ZonedDateTime newYorkTime = ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York"));

        System.out.println("Before: " + newYorkTime);
        System.out.println("After: " + newYorkTime.plus(oneDay));

    }

}
