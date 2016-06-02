package streams;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreams2 {

    public static void main(String[] args) {

        String[] words = {"abcde", "fun", "cheap", "love", "successful", "fullfilment", "anger", "software"};
        Stream<String> wordsStream = Stream.of(words);
        System.out.println(wordsStream.filter(word -> word.length() > 5).count());

        Stream<String> subsetWords = Arrays.stream(words, 0, 2);
        subsetWords.forEach(System.out::println);

        //Stream of constant values, infinite
        Stream<String> echos = Stream.generate(() -> "echo");
//		echos.forEach(System.out::println);

        //Stream of random numbers, infinite
        Stream<Double> randoms = Stream.generate(Math::random);
//		randoms.forEach(System.out::println);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
//		integers.forEach(System.out::println);


    }

}
