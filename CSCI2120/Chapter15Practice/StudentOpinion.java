package Chapter15Practice;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class StudentOpinion {
    private static Formatter output;

    public static void main(String[] args) {
        int[] responses = gatherResponses();

        openFile();
        addRecords(responses);
        closeFile();
    }

    public static int[] gatherResponses() {
        Scanner scanner = new Scanner(System.in);

        final int AMOUNT = 5;
        int[] responses = new int[AMOUNT];

        for (int i = 0; i < responses.length; i++) {
            System.out.printf("%dª rating: ", i + 1);
            responses[i] = scanner.nextInt();
        }
        scanner.close();
        return responses;
    }

    public static void openFile() {
        try {
            output = new Formatter("/Users/ivanzelenkov/Desktop/Java_2120/src/Chapter15Practice/numbers.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addRecords(int[] responses) {
        for (int i = 0; i < responses.length; i++)
            output.format("%d%n", responses[i]);

    }

    public static void closeFile() {
        if (output != null)
            output.close();
    }

}
