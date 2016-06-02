package predicates;

import java.util.function.IntPredicate;

public class IntPredicateExample {

    public static void main(String[] args) {

        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));
    }

}
