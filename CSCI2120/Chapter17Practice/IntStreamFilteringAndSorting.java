package Chapter17Practice;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class IntStreamFilteringAndSorting {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        System.out.print(
                random.ints(50, 1, 999).
                filter(x -> x % 2 != 0).
                sorted().
                mapToObj(String::valueOf).
                collect(Collectors.joining(" ")));
    }
}
