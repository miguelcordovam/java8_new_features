package comparing;

import util.Person;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ComparingWithFunction {

    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 21),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 40),
                new Person("Todd", 35),
                new Person("Mike", 12)
        );


        final Function<Person, String> byName = person -> person.getName();
        final Function<Person, Integer> byAge = person -> person.getAge();

//		people.stream().sorted(comparing(byName));

        printPeople("Comparing with function", people.stream()
                .sorted(comparing(byAge)
                        .thenComparing(byName)).collect(toList()));

    }

    public static void printPeople(String message, List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }

}
