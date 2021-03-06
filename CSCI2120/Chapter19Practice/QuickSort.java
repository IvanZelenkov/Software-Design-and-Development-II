package Chapter19Practice;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        System.out.println(arrayToString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println(arrayToString(array));
    }

    //метод принимает массив, который будет сортироваться, и его диапазон от начала (from) до конца (to)
    private static void quickSort(int[] arr, int from, int to) {

        //здесь проверяется, есть ли что сортировать
        if (from < to) {

            /*происходит разделение массива, выбирается опорный элемент (partition)
            все элементы, которые меньше него с правой части премещаются в левую часть,
            все элементы, которые больше него с левой части перемещаются в правую часть
            этот метод возвращает индекс элемента по которому происходит разделение, т.е.
            номер того элемента, который разделяет правую и левую части двух подмассивов*/
            int divideIndex = partition(arr, from, to);

            /*далее функция сортировки рекурсивно вызывает сама себя для получения подмассивов
            в качестве параметров передается массив и границы от начала (from) до
            элемента по которому делится массив не включая его (divideIndex - 1)*/
            quickSort(arr, from, divideIndex - 1);

            /*опять функция сортировки рекурсивно вызывет себя, в качестве парметров передается
            массив и границы от начала(началом является элемент по которому делился массив, т.е. середина)
            до конца(to) */
            quickSort(arr, divideIndex, to);

            /*этот метод будет выполняться в рекурсивном стиле, снова происходит разделение массивов,
            для каждого снова вызывается quickSort и так далее. Массивы делятся на подмассивы до тех пор
            пока не останется что делить*/
        }
    }

    //метод описывающий работу разделения массива на два подмассива
    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        //здесь мы выбрали опорный элемент со списка arr, это первый элемент
        //но можно было найти его и случайным образом
        int pivot = arr[from];//т.е. int pivot = 64

        //int pivot = arr[from + (to - from) / 2];

        while (leftIndex <= rightIndex) {//при первом случае while(0 <= 12)

            //начинаем движение от начала массива к концу до тех пор,
            //пока мы не найдем в какой-то части массива элемент, который будет больше опорного
            //начинаем двигаться, находим какой-то элемент, тогда начинает двигаться правый индекс
            while (arr[leftIndex] < pivot) {//при первом случае while (64 < pivot(64)) не пройдет значит идем к следующему while
                leftIndex++;//ищем тогда
            }

            //двигается правый индекс с конца массива к началу. Точно так же ищется элемент, который будет
            //меньше опорного
            while (arr[rightIndex] > pivot) {//while(to(значение с конца списка) > pivot(64))
                rightIndex--;//то мы декрментим индекс значение справа на лево, чтобы проходится по всем значениям справа
                //налево, пока не найдем значение, которое меньше pivot(64), тогда цикл закончится!!! и arr[rightIndex]
                //остановится на элементе 36, он у нас сразу меньший в конце
            }

            //после того как найдена пара элементов один из которых в левой части больше опорного
            //и в правой части меньше опорного, то они меняются синхронно местами между собой
            //Здесь мы сравниваем ИНДЕКСЫ!!! не значения!!! не перепутать
            //В нашем первом случае 64 как arr[leftIndex] будет иметь индекс 0 как большее число, а
            // число 36, которое меньшее arr[leftIndex] будет иметь индекс 12, след-но if сработает(0 < 12)
            if (leftIndex <= rightIndex) {
                //здесь мы вызываем метод swap, который мы прописали. они меняются синхронно местами между собой
                swap(arr, rightIndex, leftIndex);

                leftIndex++;//здесь после того как мы с прошлыми числами справились, мы увеличиваем leftIndex на 1

                rightIndex--;//и rightIndex уменьшаем на 1, чтобы при следующей работе цикла while(строка 56),
                //мы к этим значения не возращались, у него уже будет другое условие while (1 <= 11), и он будет
                //брать числа и сравнивать в этом диапазоне, при 3 итерации будет while (2 <= 10)
                //и в конце, когда условие while(строка 56) будет false (7 <= 5), то программа побежит
                //к строке 97 и вернет нам leftIndex, который в методе quickSort присвоится к divideIndex
                //вот так будет работать все это.
                /*quickSort() метод будет выполняться в рекурсивном стиле, снова происходит разделение массивов,
                для каждого снова вызывается quickSort и так далее. Массивы делятся на подмассивы до тех пор
                пока не останется что делить*/
            }
        }

        //если никаких чисел меньше arr[leftIndex] не оказалось, тогда возвращаем индекс этого же числа
        return leftIndex;
    }

    //метод для обмена местами чисел
    private static void swap(int[] arr, int rightIndex, int leftIndex) {
        int temp = arr[rightIndex];
        arr[rightIndex] = arr[leftIndex];
        arr[leftIndex] = temp;
    }

    //метод для красивого вывода
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
