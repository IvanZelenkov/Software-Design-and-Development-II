package Chapter18Practice;

import java.math.BigInteger;

public class FactorialCalculator {
    public static void main(String[] args) {
        // calculate the factorials of 0 through 50
        for (int counter = 0; counter <= 50; counter++) {
            System.out.printf("%d! =%d%n", counter, factorial(BigInteger.valueOf(counter)));
        }
    }

    // recursive method factorial (assumes its parameter is >= 0)
    public static BigInteger factorial(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE; // base cases 0! = 1 and 1! = 1
        } else { // recursion step
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }
    }
}
