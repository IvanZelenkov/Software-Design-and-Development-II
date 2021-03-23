package Chapter19Practice;

import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args) {
        //одномерный целочисленный массив с 4 элементами
        int[] data = {97, 3, 100, 1};

        System.out.println(Arrays.toString(data));

        bucketSort(data);

        System.out.println(Arrays.toString(data));
    }

    public static void bucketSort(int[] data) {
        //создали двумерный список, который будет иметь 10 rows и data.length(4) columns
        int[][] bucket = new int[10][data.length];

        //создали одномерный список длиной bucket.length(10)
        int[] columnCounter = new int[bucket.length];

        //продекларировали целочисленные переменные i, j, чтобы каждый раз в будущем в цикле for того не делать
        int i, j;

        //проинициализировали целочисленную переменную digits = 1
        int digits = 1;

        do {
            //цикл for заполняет все ячейки двумерного списка bucket цифрами -1
            for (i = 0; i < bucket.length; i++) {
                for (j = 0; j < bucket[0].length; j++) {
                    bucket[i][j] = -1;
                }
            }

            //цикл for заполняет все одномерный список columnCounter цифрами 0
            for (i = 0; i < data.length; i++) {
                columnCounter[i] = 0;
            }

            //цикл for будет высчитывать row в которую будет помещаться число
            for (i = 0; i < data.length; i++) {
                //например 97: (97 / 10) % 10 = 9
                int row = (data[i] / digits) % 10;

                // Число 97 поместится в ячейку (row) списка bucket и займет column 0
                bucket[row][columnCounter[row]] = data[i];

                //инкрементим ячейку в columnCounter, потому что если например второе число, например 9
                //поместится тоже в row 7 списка bucket, но columnCounter[row] будет уже 1, след-но
                //bucket[7][1] сделает так что значение 37 поместится в row 7 и column 1 списка bucket  после числа 97
                columnCounter[row]++;
            }

            //проинициализировали целочисленную переменную counter = 0
            int counter = 0;

            //цикл for проверит каждую ячейку массива bucket которая не содержит -1 цифру
            //напомним что в цикле 32-35 мы заполнили все ячейки цифрами -1
            //если же оно заполнено цифрой 97, то сработает строка 65 if блок
            for (i = 0; i < bucket.length; i++) {
                for (j = 0; j < bucket[0].length; j++) {
                    if (bucket[i][j] != -1) {
                        //значение например 3, прейдет в список counter
                        data[counter] = bucket[i][j];

                        //counter увеличится, чтобы помещать следующий элемент в оригинальный список в следующую чейку отличающуюся от прошлой
                        //если инкрементить не будем, то все значения будут просто помещаться в одну и ту же ячейку, что не корректно
                        counter++;
                        bucket[i][j] = -1;
                    }
                }
            }
            digits *= 10;

        } while (columnCounter[0] < data.length);
    }
}
