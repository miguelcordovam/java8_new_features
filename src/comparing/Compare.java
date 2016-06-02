package comparing;

import util.Person;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Compare {

    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 40),
                new Person("Todd", 35),
                new Person("Mike", 12)
        );

        Comparator<Person> compareAscending = (person1, person2) -> person1.ageDifference(person2);

        Comparator<Person> compareDescending = compareAscending.reversed();

        List<Person> ascendingAge = people.stream()
                .sorted(compareDescending)
                .collect(toList());

        printPeople("Sorted in ascending order of age", ascendingAge);

        people.stream().min(Person::ageDifference).ifPresent(youngest -> System.out.println("Youngest: " + youngest));

        people.stream().max(Person::ageDifference).ifPresent(oldest -> System.out.println("Oldest: " + oldest));

    }


    public static void printPeople(String message, List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }
}
