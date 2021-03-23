package Chapter19Practice;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveLinearSearch {
    // perform a linear search on the data
    public static int recursiveLinearSearch(int[] data, int searchKey, int initialIndex) {
        // loop through array sequentially
        if (initialIndex >= data.length)
            return -1;
        if (data[initialIndex] == searchKey)
            return initialIndex;

        return recursiveLinearSearch(data, searchKey, initialIndex + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10]; // create array

        for (int i = 0; i < data.length; i++) { // populate array
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.printf("%s%n%n", Arrays.toString(data)); // display array

        // get input from user
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();

        // repeatedly input an integer; -1 terminates the program
        while (searchInt != -1) {
            int position = recursiveLinearSearch(data, searchInt, 0); // perform search

            if (position == -1) { // not found
                System.out.printf("%d was not found%n%n", searchInt);
            }
            else { // found
                System.out.printf("%d was found in position %d%n%n",
                        searchInt, position);
            }

            // get input from user
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}

