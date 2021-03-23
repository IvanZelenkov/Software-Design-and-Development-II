package Chapter14Practice;

import java.util.Scanner;

public class TokenizingComparingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String textLine = input.nextLine();
        input.close();

        String[] tokens = textLine.split(" ");

        for (String word : tokens) {
            if (word.substring(0, 1).equals("b"))
                System.out.printf("%s ", word);
        }
    }
}
