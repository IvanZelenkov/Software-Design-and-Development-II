package Chapter16Practice;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class InsertingElementsLinkedListinSortedOrder {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 25; i++) {
            linkedList.add(random.nextInt(101));
        }

        TreeSet<Integer> sortedSet = new TreeSet<>(linkedList);

        double average = 0;
        for (int number : sortedSet) {
            average += number;
        }

        System.out.println(sortedSet);
        System.out.printf("Sum: %,.0f%nAverage: %,.2f", average, average / linkedList.size());
    }
}
