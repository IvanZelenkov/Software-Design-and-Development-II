package Chapter18Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String string = removePunctuation(input.nextLine());
        input.close();

        System.out.printf("It %s a palindrome!", testPalindrome(string, 0, string.length() - 1) ? "is" : "is not");
    }

    public static boolean testPalindrome(String phrase, int min, int max) {
        if (phrase.charAt(min) != phrase.charAt(max))
            return false;

        //когда min будет >= max, это значит что все слово просчитало и ни разу не вошлов в первый if, т.е. ни разу не выдало false, след-но это полиндром
        else if (min >= max)
            return true;

        //если буквы до сиз пор сходятся в if, то здесь мы как бы идем на сужение, чтобы все были считаны -->radar<-- -->ada<-- ->d<-
        testPalindrome(phrase, min + 1, max - 1);

        return true;
    }

    public static String removePunctuation(String phrase) {
        return phrase.replaceAll("\\p{P}}", "").replaceAll("\\s+", "");
    }
}
