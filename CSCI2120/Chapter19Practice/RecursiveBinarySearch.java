package Chapter19Practice;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {
    // perform a binary search on the data
    public static int recursiveBinarySearch(int[] data, int key, int low, int high) {
        if (low > high)
            return -1;

        int middle = (low + high + 1) / 2;

        if (key == data[middle])
            return key;
        else if (key < data[middle])
            return recursiveBinarySearch(data, key, low, middle - 1);
        else //if (key > data[middle])
            return recursiveBinarySearch(data, key, middle + 1, high);
    }

    // method to output certain values in array
    private static String remainingElements(
            int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();

        // append spaces for alignment
        for (int i = 0; i < low; i++) {
            temporary.append("   ");
        }

        // append elements left in array
        for (int i = low; i <= high; i++) {
            temporary.append(data[i] + " ");
        }

        return String.format("%s%n", temporary);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        // create array of 15 random integers in sorted order
        int[] data = generator.ints(15, 10, 91).sorted().toArray();
        System.out.printf("%s%n%n", Arrays.toString(data)); // display array

        // get input from user
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();

        // repeatedly input an integer; -1 terminates the program
        while (searchInt != -1) {
            // perform search
            int location = recursiveBinarySearch(data, searchInt, 0, data.length - 1);

            if (location == -1) { // not found
                System.out.printf("%d was not found%n%n", searchInt);
            }
            else { // found
                System.out.printf("%d was found in position %d%n%n",
                        searchInt, location);
            }

            // get input from user
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}
