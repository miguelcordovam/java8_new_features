package others;

import java.util.HashMap;
import java.util.Map;

public class MapGetOrDefault {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Math", 15);
        students.put("English", 10);
        students.put("Spanish", 1);
        students.put("Physics", 5);
        students.put("Chemistry", 2);
//		students.put("Literature", null);

//		if (students.containsKey("Literature")) {
//			System.out.println(students.get("Literature"));
//		} else {
//			System.out.println(0);
//		}

        System.out.println(students.getOrDefault("Literature", 0));


    }

}
