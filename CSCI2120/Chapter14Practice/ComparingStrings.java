package Chapter14Practice;

import java.util.*;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();
        input.close();

        int valueEquals = s1.compareTo(s2);

        if (valueEquals == 0)
            System.out.printf("%s equals %s", s1, s2);
        else if (valueEquals > 0)
            System.out.printf("%s more than %s", s1, s2);
        else
            System.out.printf("%s less than %s", s1, s2);

    }
}
