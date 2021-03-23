package Chapter17Practice;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TimeDieRolls {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        System.out.printf("%-6s%s%n", "Face", "Frequency");

        Instant initialInstant = Instant.now();

        // roll a die 60,000,000 times and summarize the results
        random.ints(60_000_000, 1, 7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .forEach((face, frequency) ->
                        System.out.printf("%-6d%d%n", face, frequency));

        Instant finalInstant = Instant.now();

        Duration duration = Duration.between(initialInstant, finalInstant);
        System.out.printf("Duration: %d millis", duration.toMillis());
    }
}
