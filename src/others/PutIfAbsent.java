package others;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsent {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Math", 15);
        students.put("English", 10);
        students.put("Spanish", 1);
        students.put("Physics", 5);
        students.put("Chemistry", 2);

        students.remove("Math", 15);

        students.putIfAbsent("History", 50);

        students.forEach((s, n) -> System.out.println(s + " - " + n));

    }

}
