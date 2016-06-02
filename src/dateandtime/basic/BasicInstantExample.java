package dateandtime.basic;

import java.time.Instant;

public class BasicInstantExample {

	public static void main(String[] args) {

		System.out.println(Instant.ofEpochSecond(3, 10));
		System.out.println(Instant.ofEpochSecond(3));
		System.out.println(Instant.ofEpochSecond(3, 0));
		System.out.println(Instant.ofEpochSecond(2, 1_000_000_000));
		System.out.println(Instant.ofEpochSecond(4, -1_000_000_000));

		System.out.println(Instant.now());
	}

}
