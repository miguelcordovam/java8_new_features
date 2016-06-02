package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

    private static void print(List<String> names) {
        names.forEach(s -> System.out.println(s));
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Charles", "Peter", "Erika", "Anne", "Edward", "Michael");

        // old
//		Collections.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.compareTo(s2);
//			}
//		});

        //new approach, more readable, concise, reads like the problem statement

//		Collections.sort(names, (String s1, String s2) -> s1.compareTo(s2)) ;

//		Collections.sort(names, (s1, s2) -> s1.compareTo(s2)) ;

        // Use sort()
        names.sort((s1, s2) -> s1.compareTo(s2));

        print(names);


    }

}
