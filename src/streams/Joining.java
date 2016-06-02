package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Miguel", "Angel");

        System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.joining(",")));

        //When list is empty

        List<String> courses = new ArrayList<>();

        System.out.println(courses.stream().collect(Collectors.joining(",")));

    }

}
