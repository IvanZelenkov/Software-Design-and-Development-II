package Chapter18Practice;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(3, 9));
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        else {
            return gcd(y, x % y);
        }
    }
}
