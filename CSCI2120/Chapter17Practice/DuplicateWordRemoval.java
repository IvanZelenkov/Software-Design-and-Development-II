package Chapter17Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateWordRemoval {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence: ");
        String sentence = reader.readLine();
        reader.close();

        System.out.printf("Unique words in alphabetical order: %s", Arrays.stream(sentence.split(" ")).
                map(String::toLowerCase).
                distinct().
                sorted().
                collect(Collectors.joining(" ")));
    }
}

