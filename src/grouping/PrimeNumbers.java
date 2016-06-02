package grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

    public static boolean isPrime(int number) {

        int n = (int) Math.sqrt((double) number);

        return IntStream.rangeClosed(2, n).noneMatch(d -> number % d == 0);

    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {

        return IntStream.rangeClosed(2, n).boxed().collect(Collectors.partitioningBy(PrimeNumbers::isPrime));
    }

    public static void main(String[] args) {

        System.out.println(partitionPrimes(200));


    }

}
