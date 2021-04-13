/**
 * If you do not use recursion, you will receive 0 points. You can delete the
 * content of the methods before you start your work.
 */
public class Recursion {
    public static String reverse(String s) {
        if (s.length() <= 1)
            return s;
        else
            return reverse(s.substring(1)) + s.charAt(0);
            /*Every time reverse() method works, it sets the same string,
             but without the first element. And when the base condition is reached,
             the recursion begins to collapse(return on stack), and the previous
             unused symbol will be appended to each subsequent result.
             */
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        // if first and last elements are not equal => false
        else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                // isPalindrome will be called recursively, and
                // s.substring(1, s.length() - 1) will move indexes
                // inside of the string to the middle one, therefore
                // it will check if it is palindrome
                // "madam" -->|m|-->|a|-->|d|<--<|a|--|m|<--
                return isPalindrome(s.substring(1, s.length() - 1));
            }
        }
        return false;
    }

    public static int length(String s) {
        if (s.equals(""))
            return 0;
        else
            return 1 + length(s.substring(1));
    }
}