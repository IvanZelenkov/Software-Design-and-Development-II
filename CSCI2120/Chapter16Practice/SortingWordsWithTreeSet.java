package Chapter16Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortingWordsWithTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String[] tokens = scanner.nextLine().split(" ");
        scanner.close();

        Set<String> set = new TreeSet<String>(Arrays.asList(tokens));

        for (String word : set)
            System.out.printf("%s ", word);
    }
}
