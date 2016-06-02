package streams;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class FlatteningStreams {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squareNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(toList());
        System.out.println(squareNumbers);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> pairs = numbers1.stream()
                .flatMap((Integer i) -> numbers2.stream()
                        .map((Integer j) -> new int[]{i, j}))
                .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
                .collect(toList());

        pairs.forEach(pair -> System.out.println(pair[0] + " , " + pair[1]));

    }

}
