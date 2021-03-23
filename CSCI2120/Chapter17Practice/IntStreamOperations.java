package Chapter17Practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // display original values
        System.out.print("Original values: ");
        System.out.println(
                IntStream.of(values).
                mapToObj(String::valueOf).
                collect(Collectors.joining(" ")));

        // count, min, max, sum and average of the values

        System.out.printf("%nCount: %d%n",
                IntStream.of(values).
                        count());

        System.out.printf("Min: %d%n",
                IntStream.of(values).
                        min().
                        getAsInt());

        System.out.printf("Max: %d%n",
                IntStream.of(values).
                max().
                getAsInt());

        System.out.printf("Sum: %d%n",
                IntStream.of(values).
                        sum());

        System.out.printf("Average: %.2f%n",
                IntStream.of(values).
                        average().
                        getAsDouble());

        System.out.println(IntStream.of(values).summaryStatistics());//contains (count, sum, min, average, max) methods

        // sum of values with reduce method
        /*Adding two Integer objects is much more sophisticated than adding two int primitives. You can find more details in this post.
        So the best case is when you have a primitive array int[] and sum its elements into an accumulator of type int. Thus no boxing involved here.*/
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values).
                        reduce(0, (x, y) -> x + y));

        System.out.printf("Sum via reduce method: %d%n",
                IntStream.of(values).
                        reduce(0, Integer::sum));

        // product of values with reduce method
        System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values).
                        reduce((x, y) -> x * y).
                        getAsInt());

        // sum of squares of values with map and sum methods
        System.out.printf("Sum of squares via map and sum: %d%n",
                IntStream.of(values).
                map(x -> x * x).
                sum());

        // displaying the elements in sorted order
        System.out.printf("Values displayed in sorted order: %s%n",
                IntStream.of(values).
                        sorted().
                        mapToObj(String::valueOf).
                        collect(Collectors.joining(" ")));


    }
}
