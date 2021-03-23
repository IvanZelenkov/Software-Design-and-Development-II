package Chapter18Practice;

public class FindMinimumValueInArray {
    public static void main(String[] args) {
        int[] arrayInt = {7, 23, 17, 5};
        System.out.println(recursiveMinimum(arrayInt, arrayInt.length));
    }

    public static int recursiveMinimum(int[] array, int length) {
        if (length == 1) {
            return array[0];
        }
        else {
            //пусть x будет меньшим int, например это будет первый элемент(мы его получим рекрсией6 когда length будет равна 1
            int x = recursiveMinimum(array, length - 1);

            /*длина будет меняться так что будет происходить рекрсия обратно по стеку, т.е.
            1) int x = recursiveMinimum(array, 3 - 1);
            x < array[2 - 1]
            2) int x = recursiveMinimum(array, 4 - 1);
            x < array[3 - 1]
            3) int x = recursiveMinimum(array, 5 - 1);
            x < array[4 - 1]
            Т.к. 7 < 5 не сработает, то сработает else и выведет нам ответ 5*/

            if (x < array[length - 1]) {
                return x;
            }
            else {
                return array[length - 1];
            }
        }
    }
}
