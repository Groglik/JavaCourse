package CourseWorks;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            for (int j = i - 1; j >= 0; j--) {
                if (temp >= array[j]) {
                    array[j + 1] = temp;
                    break;
                }

                array[j + 1] = array[j];

                if (j == 0) {
                    array[j] = temp;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 6, 13, 4, 56, 0, 16, 7, 1, -9, -100};
        System.out.println("Неотсортированный массив " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Отсортированный массив " + Arrays.toString(array));
    }
}