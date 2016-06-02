package dateandtime.basic;

import java.time.LocalTime;

public class BasicLocalTimeExample {

	public static void main(String[] args) {

		LocalTime time = LocalTime.of(13, 45, 20);
		
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }

}
