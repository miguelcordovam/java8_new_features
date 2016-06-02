package predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }

    public static void main(String[] args) {

        List<String> lista = Arrays.asList("abc", "", "cdefgh", "", "bla", "", "blue", "", "sad");

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();

        List<String> nonEmpty = filter(lista, nonEmptyStringPredicate);

        nonEmpty.forEach(System.out::println);

    }
}