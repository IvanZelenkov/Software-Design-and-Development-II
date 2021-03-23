package Chapter18Practice;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray(array, array.length);
    }

    public static void printArray(int[] array, int length) {
        if (length == 1) {
            System.out.print(array[0] + " ");
        }
        else {
            printArray(array, length - 1);
            System.out.print(array[length - 1] + " ");
        }
    }
}
