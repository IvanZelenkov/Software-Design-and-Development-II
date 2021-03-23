package Chapter18Practice;

public class FactorialCalculatorExercise {
    public static void main(String[] args) {
        for (int counter = 3; counter <= 3; counter++) // tava 21
            System.out.printf("%n%d! = %d", counter, factorial(counter));
    }

    public static long factorial(long number) {
        if (number <= 1) {
            System.out.printf("N = %d %5d! = 1", number, number);
            return 1;
        } else {
            System.out.printf("N = %d", number);
            System.out.printf("%6d! = %d * (%d - 1)!%n", number, number, number);
            long result = number * factorial(number - 1);
            System.out.printf("%nN = %d %5d * %d = %d", number, number, number - 1, result);
            return result;
        }
    }
}