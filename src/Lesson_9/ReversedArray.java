package Lesson_9;

import java.util.Arrays;

public class ReversedArray {
    public static void reverseArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 2, 20, 88, 7, 100, 3, 5, 12};
        System.out.println("Массив в прямом порядке " + Arrays.toString(array));

        reverseArray(array);
        System.out.println("Массив в обратном порядке " + Arrays.toString(array));
    }
}