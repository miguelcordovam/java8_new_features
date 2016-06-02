package dateandtime.localdateandtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now, nowPlus, nowHrsMins, lunch, bedtime;

        now = LocalTime.now();
        System.out.println("Time time is: " + now);

        nowPlus = now.plusHours(1).plusMinutes(15);
        System.out.println(nowPlus);

        nowHrsMins = now.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("Truncate to minutes: " + nowHrsMins);
        System.out.println("It is the " + now.toSecondOfDay()/60 + "th minute");

        lunch = LocalTime.of(18, 30);
        System.out.println(lunch.isAfter(now));

        long minsToLunch = now.until(lunch, ChronoUnit.MINUTES);
        System.out.println(minsToLunch);

        bedtime = LocalTime.of(21, 0);
        long hrsToBedTime = now.until(bedtime, ChronoUnit.HOURS);
    }

}
