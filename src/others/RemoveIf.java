package others;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

    public static void main(String[] args) {

        // Remove all elements that are less than 10

        List<Integer> grades = new ArrayList<>();
        grades.add(1);
        grades.add(10);
        grades.add(11);
        grades.add(2);
        grades.add(7);

        grades.removeIf(n -> n < 10);

        grades.forEach(System.out::println);
    }

}
