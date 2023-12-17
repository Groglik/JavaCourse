package CourseWorks;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int leftIndex, int rightIndex) {
        if (rightIndex + 1 - leftIndex == 2) {
            if (array[rightIndex] < array[leftIndex]) {
                int temp = array[rightIndex];
                array[rightIndex] = array[leftIndex];
                array[leftIndex] = temp;
            }

            return;
        }

        if (array.length == 0 || rightIndex - leftIndex == 1) {
            return;
        }

        int x = array[leftIndex];
        int i = leftIndex;
        int j = rightIndex;

        while (i <= j) {
            while (array[i] < x) {
                i++;
            }

            while (array[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;

                i++;
                j--;
            }
        }

        if (i < rightIndex) {
            quickSort(array, i, rightIndex);
        }

        if (j > leftIndex) {
            quickSort(array, leftIndex, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 6, 13, 4, 56, 0, 16, 7, 1, -9, -100, 20, 21, 20, 20};
        System.out.println("Неотсортированный массив " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив   " + Arrays.toString(array));
    }
}