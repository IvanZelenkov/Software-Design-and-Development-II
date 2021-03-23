package Chapter18Practice;

public class RecursivePowerMethod {
    public static void main(String[] args) {
        System.out.print(power(3,4));
    }

    public static int power(int base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        else {
            return base * power(base, exponent - 1);
        }
    }

}
