package Chapter17Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageWithIntStream {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> grades = new ArrayList<>();

        while (input.hasNext()) {
            grades.add(input.nextInt());
        }
        input.close();

        System.out.printf("Average: %.1f",
                grades.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0));
    }

}