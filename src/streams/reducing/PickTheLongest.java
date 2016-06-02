package streams.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickTheLongest {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Maria", "John", "Alexander",
                "Mathew");

        Optional<String> longestName = names.stream().reduce(
                (name1, name2) -> name1.length() >= name2.length() ? name1
                        : name2);

        longestName.ifPresent(System.out::println);

    }

}
