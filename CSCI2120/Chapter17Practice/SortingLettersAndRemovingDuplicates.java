package Chapter17Practice;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingLettersAndRemovingDuplicates {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        List<Character> letters = Stream.generate(() -> 65 + random.nextInt(26)).
                map(x -> (char) (int) x).
                limit(30).
                collect(Collectors.toList());

        letters.stream().
                sorted().
                forEach(letter -> System.out.printf("`%s ", letter));

        System.out.println();

        letters.stream().
                sorted(Comparator.reverseOrder()).
                forEach(letter -> System.out.printf("%s ", letter));

        System.out.println();

        letters.stream().
                sorted().
                distinct().
                forEach(letter -> System.out.printf("%s ", letter));
    }
}
