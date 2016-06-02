package comparing;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class ComparingExample {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(10, "USA"));
        inventory.add(new Apple(100, "Peru"));
        inventory.add(new Apple(24, "Bolivia"));
        inventory.add(new Apple(24, "Argentina"));
        inventory.add(new Apple(666, "Hell"));
        inventory.add(new Apple(10, "Canada"));
        inventory.add(new Apple(2, "Colombia"));


        // Sorting #1
//		inventory.sort((Apple a1, Apple a2) -> Integer.compare(a1.getWeight(), a2.getWeight()));

        //Sorting #2
//		inventory.sort(comparing(Apple::getWeight));

        //Sorting #3 reversed
//		inventory.sort(comparing(Apple::getWeight).reversed());

        //Sorting #4 chained
        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getCountry));

        inventory.forEach(a -> System.out.println(a.getWeight() + " " + a.getCountry()));

    }
}
