package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWalkExample {

    public static void main(String[] args) {

        try(Stream<Path> files = Files.walk(Paths.get("C:\\Miguel"))) {

            files.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
