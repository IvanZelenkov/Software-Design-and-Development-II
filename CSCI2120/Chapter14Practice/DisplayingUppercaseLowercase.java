package Chapter14Practice;

import java.util.*;

public class DisplayingUppercaseLowercase {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the text: ");
            String text = input.nextLine();
            input.close();

            System.out.printf("%s%n%s", text.toUpperCase(), text.toLowerCase());

    }
}
