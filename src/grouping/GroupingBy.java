package grouping;

import util.Person;

import static java.util.function.BinaryOperator.maxBy;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {

        final List<Person> people = Arrays.asList(
                new Person("John", 12),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 40),
                new Person("Sodd", 40),
                new Person("Gike", 12)
        );

        Map<Integer, List<Person>> peopleByAge =
                people.stream().collect(Collectors.groupingBy(Person::getAge));

        System.out.println(peopleByAge);

        Map<Integer, List<String>> nameOfPeopleByAge =
                people.stream().collect(groupingBy(Person::getAge, mapping(Person::getName, toList())));

        System.out.println(nameOfPeopleByAge);

        Comparator<Person> byAge = Comparator.comparing(Person::getAge);

        Map<Character, Optional<Person>> oldestPersonInEachGroup =
                people.stream()
                        .collect(groupingBy(person -> person.getName().charAt(0), reducing(maxBy(byAge))));

        System.out.println(oldestPersonInEachGroup);
    }

}
