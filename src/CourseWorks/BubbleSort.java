package CourseWorks;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int exchangesQuantity = 0;

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    exchangesQuantity++;
                }
            }

            if (exchangesQuantity == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 13, 84, 56, 0, 16, 7, 1, -9, -100};
        System.out.println("Неотсортированный массив " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Отсортированный массив " + Arrays.toString(array));
    }
}