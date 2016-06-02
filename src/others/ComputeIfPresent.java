package others;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresent {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Math", 15);
        students.put("English", 10);
        students.put("Spanish", 1);
        students.put("Physics", 5);
        students.put("Chemistry", 2);

        students.compute("English", (s, n) -> n * 2);

//		students.compute("Literature", (s,n) -> n*2);

        students.computeIfPresent("Math", (s, n) -> n * 2);
        students.computeIfAbsent("Literature", s -> 4);

        students.forEach((s, n) -> System.out.println(s + " - " + n));

    }

}
