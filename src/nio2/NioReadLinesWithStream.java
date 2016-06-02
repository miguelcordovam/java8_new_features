package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NioReadLinesWithStream {

    public static void main(String[] args) {

        try(Stream<String> lines = Files.lines(Paths.get("miki.txt"))) {

            lines.forEach(System.out::println);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
