import java.util.ArrayList;

/**
 *
 * In this task, I use an array to find the smallest (i.e., the first alphabetically)
 * string in an array of strings using findMinimum method and helperMethod which will
 * compare the string in array by compare method.
 *
 * @author Ivan Zelenkov
 * @version 1.0
 * @since March 21, 2021
 */
public class Recursion {

    /**
     * @param s1 The first String which will be passed.
     * @param s2 The second String which will be passed.
     * @return Returns a number that will indicate the result of string comparison.
     */
    public static int compare(String s1, String s2) {
        // ***recursion starts***
        // natural order (case insensitive)
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // ***base case***
        // if character of String s1 at index 0 is less than character of String s2 at index 0 return -1
        // if s1 still less than s2, then it will return 1 and go to check the next element of array, because s1 element still the smallest
        if (s1.charAt(0) < s2.charAt(0))
            return 1;

        // if character of String s1 at index 0 is greater than character of String s2 at index 0 return 1
        if (s1.charAt(0) > s2.charAt(0))
            return -1;
        // ***end of base case***

        // if characters in both strings are equal if statement is true
        if (s1.charAt(0) == s2.charAt(0)) {
            // if there is 1 character left in s1 return 1, because 1 will not execute if statement where (num == -1). And therefore s1 will stay as it was the smallest string
            if (s1.length() == 1)
                return 1;

            // if there is 1 character left in s2 return -1
            // return -1 because when first if gave us true, then it should check this on and above one. if s2.length() == then it says that
            // the length of s2 is reached the end, therefore of course it is less than s1, and we can absolutely right say that s2 < s1 lexicographically
            // -1 will give us in helper method's if statement true and the smallest string will be represented in string variable and after that in s1 in compare method
            else if (s2.length() == 1)
                return -1;

            // method compare will be called recursively if there are more character to compare
            return compare(s1.substring(1), s2.substring(1));
        }
        // return a zero because a method require something to return
        return 0;
    }

    /**
     * @param array The passed array with strings will be stored.
     *
     * @param string This is where the first element of the list will be stored in order to compare with the rest,
     *              i.e. I say that let the smallest element be the first element of the list and if there is something
     *              smaller, replace it.
     *
     * @param i This variable as an index will initially store the value 0, because we are comparing all the elements of the array
     *          starting at index 0. It will be incremented using recursion in the work of the method.
     *
     * @return The method will return the numeric value of the smallest element of the array.
     */
    public static String helperMethod(final ArrayList<String> array, String string, int i) {
        if (array.size() == i)
            return string;
        else {
            int num = compare(string, array.get(i));

            // if the return int number from compare method was -1, then this if statement will be true and assign a smallest string to the string variable through the index
            if (num == -1)
                string = array.get(i);

            return helperMethod(array, string, i + 1);
        }
    }

    /**
     * @param array The passed array with strings will be stored.
     * @return Method findMinimum will return the smallest string.
     */
    public static String findMinimum(ArrayList<String> array) {
        // pass (array, first element of array, start index)
        return helperMethod(array, array.get(0), 0);
    }
}
