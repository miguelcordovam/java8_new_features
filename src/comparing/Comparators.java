package comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparators {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Charles", "Peter", "Erik", "Erika", "Anne", "Edward", "Michael", "Emily", "Jessica");

        //using Comparator.comparing byLength

		names.sort(Comparator.comparingInt((String s) -> s.length()));
        System.out.println("Comparing length: ");
        names.forEach(s -> System.out.println(s));

        // reversing
        System.out.println("Comparing using reversed: ");
        names.sort(Comparator.comparingInt((String s) -> s.length()).reversed());
		names.forEach(s -> System.out.println(s));
    }
}
