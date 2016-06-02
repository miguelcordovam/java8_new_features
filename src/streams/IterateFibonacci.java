package streams;

import java.util.stream.Stream;

public class IterateFibonacci {

    public static void main(String[] args) {

        Stream<int[]> fibo =
                Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]});

        fibo.limit(10)
                .forEach(s -> System.out.println(s[0] + "," + s[1]));
    }

}
