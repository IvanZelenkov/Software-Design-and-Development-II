package Chapter18Practice;

import java.math.BigInteger;

public class FibonacciCalculatorExercise2 {
    private static BigInteger TWO = BigInteger.valueOf(2);
    private static long numberOfCallers = -1;

    public static void main(String[] args) {
        for (int counter = 0; counter <= 40; counter++) {
            long timeInitial = System.currentTimeMillis();

            BigInteger result = fibonacci(BigInteger.valueOf(counter));

            long timeEnd = System.currentTimeMillis();

            long timeDifference = timeEnd - timeInitial;

            System.out.printf("Fibonacci of %d is: %-10d --> calculated in %5d milliseconds --> number of calleds: %d%n",
                    counter,
                    result, timeDifference, numberOfCallers);
        }
    }

    public static BigInteger fibonacci(BigInteger number) {
        numberOfCallers++;
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
            return number;
        }
        else {
            return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
        }
    }


}
