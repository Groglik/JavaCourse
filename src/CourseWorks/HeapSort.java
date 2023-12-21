package CourseWorks;

import java.util.Arrays;

public class HeapSort {
    public static void sieveArray(int[] array, int startIndex, int endIndex) {
        while (true) {
            int childIndex1 = 2 * startIndex + 1;
            int childIndex2 = 2 * startIndex + 2;
            int maxChildIndex;

            if (childIndex1 > endIndex) {
                return;
            }

            if (childIndex2 <= endIndex) {
                if (array[childIndex1] > array[childIndex2]) {
                    maxChildIndex = childIndex1;
                } else {
                    maxChildIndex = childIndex2;
                }
            } else {
                maxChildIndex = childIndex1;
            }

            int maxChild = array[maxChildIndex];
            int currentNumber = array[startIndex];

            if (currentNumber > maxChild) {
                return;
            }

            array[startIndex] = maxChild;
            array[maxChildIndex] = currentNumber;
            startIndex = maxChildIndex;
        }
    }

    public static void heapSort(int[] array) {
        int endIndex = array.length - 1;
        int currentIndex = endIndex / 2 - 1;

        for (int i = currentIndex; i >= 0; i--) {
            sieveArray(array, i, endIndex);
        }

        for (int i = endIndex; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            sieveArray(array, 0, i - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 6, 13, 4, 56, 0, 16, 7, 1, -9, -100, 20, 21, 20, 20};

        System.out.println("Неотсортированный массив " + Arrays.toString(array));

        heapSort(array);

        System.out.println("Отсортированный массив   " + Arrays.toString(array));
    }
}