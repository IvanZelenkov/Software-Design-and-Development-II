package Chapter14Practice;

import java.util.*;

public class DisplayingSentenceWithItsOwnWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = input.nextLine();
        input.close();

        String[] tokens = text.split(" ");

        for(int i = tokens.length - 1; i >= 0; i--) {
            System.out.println(tokens[i]);
        }
    }
}
