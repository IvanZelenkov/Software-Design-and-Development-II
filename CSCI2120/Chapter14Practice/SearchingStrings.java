package Chapter14Practice;

import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String string = input.nextLine();

        System.out.print("The desired character: ");
        char key = input.next().charAt(0); // taking character input
        input.close();

        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(key, i) == -1) // if no desired character found
                break;
            else {
                counter++;
                i = string.indexOf(key, i);
            }
        }

        System.out.printf("\'%s\' appears %d of time (s) no text", key, counter);
    }
}
