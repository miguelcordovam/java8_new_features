package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(221, 12, 30, 41, 511, 620, 7, 8, 9, 10, 9, 800, 123);

        int suma = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(suma);

        int suma2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(suma2);

        Optional<Integer> sum = numbers.stream().reduce((a, b) -> (a + b));
        System.out.println(sum.get());

        //maximum value

        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println(max.get());
    }

}
