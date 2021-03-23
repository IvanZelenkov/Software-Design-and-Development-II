package Chapter18Practice;

import java.util.Scanner;

public class PrintArrayBackward {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();
        input.close();

        stringReverse(word.toCharArray(), 0);
    }

    public static void stringReverse(char[] array, int index) {
        if (index == array.length - 1) {
            // после того как index == 3, выведется последний char списка System.out.print(array[index]);
            System.out.print(array[index]);

            // Далее рекурсия пойдет к окончанию и увидит что дальше решений искать негде и пойдет выводить
            // обратно с System.out.print(array[index - 1]); отработает backtracking и выведет нам оставшиеся
            // символы в обратном порядке, способом декремента array[index - 1]. Как только рекурсия дойдет до
            // base case, то программа успешно завершится
        }
        else {
            stringReverse(array, ++index);
            System.out.print(array[index - 1]);
        }
    }
}