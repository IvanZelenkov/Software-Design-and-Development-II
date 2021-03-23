package Chapter14Practice;

public class ConvertingIntToCharacter {
    public static void main(String[] args) {
        for (int i = 0; i <= 255; i++)
            System.out.printf("%d = %c%n", i, i); // %c means character so we are getting characters
    }
}
