package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioReadAllLines {
    public static void main(String[] args) {

        List<String> fileArr;
        Path file = Paths.get("miki.txt");

        try {
            fileArr = Files.readAllLines(file);

            fileArr.stream()
                    .filter(l -> l.contains("let"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
