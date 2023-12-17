package CourseWorks;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int startIndex = 0; startIndex < array.length - 1; startIndex++) {
            int minNumberIndex = startIndex;

            for (int i = startIndex + 1; i < array.length; i++) {
                if (array[minNumberIndex] > array[i]) {
                    minNumberIndex = i;
                }
            }

            int temp = array[startIndex];
            array[startIndex] = array[minNumberIndex];
            array[minNumberIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 13, 84, 56, 0, 16, 7, 1, -9, -100};
        System.out.println("Неотсортированный массив " + Arrays.toString(array));

        selectionSort(array);
        System.out.println("Отсортированный массив " + Arrays.toString(array));
    }
}