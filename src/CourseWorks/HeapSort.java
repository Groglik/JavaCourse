package CourseWorks;

import java.util.Arrays;

public class HeapSort {
    public static void sieving(int[] array, int startIndex, int endIndex) {
        while (true) {
            int childIndex1 = 2 * startIndex + 1;
            int childIndex2 = 2 * startIndex + 2;
            int maxChildIndex;

            if (childIndex1 < endIndex && childIndex2 < endIndex) {
                if (array[childIndex1] > array[childIndex2]) {
                    maxChildIndex = childIndex1;
                } else {
                    maxChildIndex = childIndex2;
                }
            } else if (childIndex1 < endIndex) {
                maxChildIndex = childIndex1;
            } else if (childIndex2 < endIndex) {
                maxChildIndex = childIndex2;
            } else {
                break;
            }

            int maxChild = array[maxChildIndex];
            int currentNumber = array[startIndex];

            if (currentNumber < maxChild) {
                array[startIndex] = maxChild;
                array[maxChildIndex] = currentNumber;
                startIndex = maxChildIndex;
            } else {
                break;
            }
        }
    }

    public static void heapSort(int[] array) {
        int endIndex = array.length - 1;
        int arrayHalf = (endIndex) / 2;
        int currentIndex = arrayHalf - 1;

        while (currentIndex >= 0) {
            sieving(array, currentIndex,  endIndex);
            currentIndex--;
        }

        while (0 < endIndex) {
            int temp = array[0];
            array[0] = array[endIndex];
            array[endIndex] = temp;

            endIndex--;
            sieving(array, 0,  endIndex);
        }
    }

    public static void main(String[] args) {
        int[] array2 = {12, 6, 13, 4, 56, 0, 16, 7, 1, -9, -100, 20, 21, 20, 20};
        System.out.println("Неотсортированный массив " + Arrays.toString(array2));

        heapSort(array2);
        System.out.println("Отсортированный массив   " + Arrays.toString(array2));
    }
}