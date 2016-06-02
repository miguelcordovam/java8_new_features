package streams;

import java.util.Arrays;
import java.util.List;

public class ReducingStrings {

    public static void main(String[] args) {

        List<String> lista = Arrays.asList("How", "many", "times", "I", "had", "to", "do", "this", "manually");

        System.out.println(lista.stream().reduce((a, b) -> a + "," + b).get());

    }

}
