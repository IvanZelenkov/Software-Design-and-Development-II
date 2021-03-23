package Chapter17Practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CalculatingElementsInTwoDimensionalArray2 {
    public static void main(String[] args) {
        int[][] gradesArray = {
                {87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};

        Stream.of(gradesArray).
                forEach(studentGrades -> {
                    System.out.printf("%.2f%n", IntStream.of(studentGrades).
                            average().
                            getAsDouble());
                });
    }
}

