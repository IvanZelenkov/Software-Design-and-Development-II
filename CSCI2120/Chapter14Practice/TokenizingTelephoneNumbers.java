package Chapter14Practice;

import java.util.*;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your telephone number in form (555) 555-5555:");
        String number = input.nextLine();
        input.close();

        String[] tokens = number.split("[()\\s\\-]");

        for (String token : tokens) {
            System.out.print(token);
        }
    }
}

