package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 5, 7, 11, 13 };
		int sum = Arrays.stream(numbers).sum();

		System.out.println("Sum is : " + sum);

		Stream<String> stream = Stream.of("Java" , "8", "rocks");
		
		stream.map(String::toUpperCase).forEach(System.out::print);
		
	}

}
