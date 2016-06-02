package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerRanges {

    public static void main(String[] args) {

        Stream<int[]> triples =
                IntStream.rangeClosed(1, 100).boxed().flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                                .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );

        triples.limit(5).forEach(t -> System.out.println(t[0] + "," + t[1] + "," + t[2]));

    }

}
