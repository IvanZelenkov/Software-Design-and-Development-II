package Chapter17Practice;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class InfiniteStreamOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();

        IntPredicate primeNumber = number -> {
            //Этот if для всех чётных кроме двойки. Очищает от четных чисел
            if (number != 2 && number % 2 == 0)
                return false;

            //The following logic will return true if the number is prime:
            return IntStream.rangeClosed(2, (int) Math.sqrt(number)).//range will define x
                    filter(x -> x % 2 != 0).
                    noneMatch(x -> number % x == 0);//if none of the numbers is matched - false, if matched - true
        };

        IntStream.iterate(2, x -> x + 1).
                filter(primeNumber).
                limit(n).
                forEach(System.out::println);
    }
    // ОБЪЯСНЕНИЕ К СТРОКАМ 21-23
    //                                                                              ^
    /*если будет 7, то rangeClosed выдаст набор из одного числа (2)                 |
    фильтр выбросит из этого набора все чётные числа                                |
    и noneMatch выдаст true, потому что в наборе действительно нету ни одно числа, на которое 7 делится без остатка

    если будет 9, то rangeClosed выдаст набор из чисел (2, 3)
    фильтр выбросит из этого набора все чётные числа, останется (3)
    и noneMatch выдаст false, потому что в наборе есть число, на которое 9 делится без остатка

    если будет 11, то rangeClosed выдаст набор из чисел (2, 3)
    фильтр выбросит из этого набора все чётные числа, останется (3)
    и noneMatch выдаст true, потому что в наборе действительно нету ни одно числа, на которое 11 делится без остатка

    если будет 81, то rangeClosed выдаст набор из чисел (2, 3, 4, 5, 6, 7, 8, 9)
    фильтр выбросит из этого набора все чётные числа, останется (3, 5, 7, 9)
    и noneMatch выдаст false, потому что в наборе есть число, на которое 81 делится без остатка

    Этот алгоритм не про эффективность, он про стримы*/
}
