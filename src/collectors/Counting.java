package collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Counting {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Miguel");
        names.add("Miguel");
        names.add("Miguel");
        names.add("Cristina");
        names.add("Cristina");
        names.add("Cristina");
        names.add("Cristina");
        names.add("Miguel");
        names.add("Miguel");
        names.add("Miguel");

        Map<String, Long> counting = names.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        System.out.println(counting);

    }
}
