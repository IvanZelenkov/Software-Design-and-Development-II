package Chapter14Practice;

import java.util.Scanner;

public class TokenizingComparingStrings2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String textLine = input.nextLine();
        input.close();

        String[] tokens = textLine.split(" ");

        for (String token : tokens) {
            if (token.lastIndexOf("ED") != -1)
                System.out.println(token);
        }
    }
}
