package streams;

import java.util.stream.Stream;

public class UniqueStreams {

    public static void main(String[] args) {

        Stream<String> words = Stream.of("happy", "happy", "sad", "sad").distinct();
        words.forEach(System.out::println);

    }

}
