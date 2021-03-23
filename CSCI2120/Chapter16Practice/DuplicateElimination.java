package Chapter16Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            List<String> list = new ArrayList<>();

            System.out.println("Enter the first names: ");

            while(input.hasNext()) {
                list.add(input.next());
            }

            input.close();

            eliminateDuplicates(list);
    }

    public static void eliminateDuplicates(Collection<String> values) {
        Set<String> set = new HashSet<>(values);

        System.out.println("List without duplicated first names: ");

        for(String value: set) {
            System.out.printf("%s ", value);
        }

    }
}
