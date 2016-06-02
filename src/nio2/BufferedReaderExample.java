package nio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try (BufferedReader bReader = new BufferedReader(new FileReader("miki.txt"))) {

            bReader.lines().forEach(line -> System.out.println("Line: " + line));

        } catch (IOException e) {
            System.out.println("Message: " + e.getMessage());
        }

    }
}
