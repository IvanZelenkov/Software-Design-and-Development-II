package Chapter17Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SummarizingCharacters {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("");

        Files.lines(Paths.get("/Users/ivanzelenkov/Desktop/Java_2120/src/Chapter17Practice/Chapter2Paragraph.txt")).
                flatMap(line -> {
                    line = line.replaceAll("\\W+", "");
                    return pattern.splitAsStream(line);
                }).
                collect(Collectors.groupingBy(String::toUpperCase, TreeMap::new, Collectors.counting())).
                forEach((letter, count) -> {
                    System.out.printf("%s: %d%n", letter, count);
                });
    }
}