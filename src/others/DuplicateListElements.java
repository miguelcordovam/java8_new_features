package others;

import java.util.Arrays;
import java.util.List;

public class DuplicateListElements {

    public static void main(String[] args) {

        // Duplicate every element in the array

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.replaceAll(number -> number * 2);

        numbers.forEach(System.out::println);

    }

}
