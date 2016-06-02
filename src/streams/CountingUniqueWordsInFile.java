package streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class CountingUniqueWordsInFile {

    public static void main(String[] args) {

        long uniqueWords = 0;

        try (Stream<String> lines = Files.lines(Paths.get("test.txt"), Charset.defaultCharset())) {

            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(uniqueWords);
    }

}
