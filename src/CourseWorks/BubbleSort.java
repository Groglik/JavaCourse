package CourseWorks;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int endIndex = array.length - 1;

        for (int i = 0; i < endIndex; i++) {
            boolean isExchanged = false;

            for (int j = 0; j < endIndex - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    isExchanged = true;
                }
            }

            if (!isExchanged) {
                return;
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