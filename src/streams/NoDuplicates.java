package streams;

import java.util.Arrays;
import java.util.List;

public class NoDuplicates {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 1, 2, 5, 3, 4, 5, 8, 4);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

    }

}
