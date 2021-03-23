package Chapter17Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageWithIntStream2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> grades = new ArrayList<>();

        while (input.hasNext()) {
            grades.add(input.nextInt());
        }
        input.close();

        System.out.printf("%s",
                grades.stream()
                        .map(grade ->
                                (grade >= 90) ? "A" :
                                (grade >= 80) ? "B" :
                                        (grade >= 70) ? "C" :
                                                (grade >= 60) ? "D" : "F").
                        collect((Collectors.joining(" "))));
    }
}