package lazyevaluation;

import java.util.Arrays;
import java.util.List;

public class LazyStream {

    private static int length(String value) {
        System.out.println("getting length for :" + value);
        return value.length();
    }

    private static String toUpper(String value) {
        System.out.println("to uppercase for : " + value);
        return value.toUpperCase();
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Brad", "Kate", "Kim", "Jack", "Joe",
                "Mike", "Susan", "George", "Robert", "Julia", "Parker", "Benson");

        final String firtNameWith3Letters =
                names.stream()
                        .filter(name -> length(name) == 3)
                        .map(name -> toUpper(name))
                        .findFirst()
                        .get();

        System.out.println(firtNameWith3Letters);

    }

}
