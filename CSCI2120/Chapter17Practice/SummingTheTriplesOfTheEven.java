package Chapter17Practice;

import java.util.stream.IntStream;

public class SummingTheTriplesOfTheEven {
    public static void main(String[] args) {
        System.out.printf("Sum of the triples of the even ints from 2 through 10 is: %d%n",
                IntStream.rangeClosed(1, 10).
                        map(x -> x % 2 == 0 ? x * 3 : 0).
                        sum());
    }
}