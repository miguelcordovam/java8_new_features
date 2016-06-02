package streams;

import java.util.stream.Stream;

public class SubStreams {

    public static void main(String[] args) {
        Stream<Double> randoms = Stream.generate(Math::random).limit(10);
//		randoms.forEach(System.out::println);

        Stream<String> words = Stream.of(new String[]{"abc", "error", "pony"});
//		words.skip(1).forEach(System.out::print);
        Stream<String> nouns = Stream.of(new String[]{"Miguel"});

        Stream<String> combined = Stream.concat(words, nouns);
//		combined.forEach(System.out::println);

        Object[] powers = Stream.iterate(1.0, p -> p * 2)
//									.peek(e -> System.out.println("Fetching: " + e))
                .limit(20).toArray();
        Stream.of(powers).forEach(System.out::println);
    }
}
