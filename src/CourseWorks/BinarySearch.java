package CourseWorks;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int necessaryNumber) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (true) {
            if (leftIndex > rightIndex) {
                return -1;
            }

            int middle = (leftIndex + rightIndex) / 2;

            if (array[middle] == necessaryNumber) {
                return middle;
            } else if (necessaryNumber > array[middle]) {
                leftIndex = middle + 1;
            } else {
                rightIndex = middle - 1;
            }
        }
    }

    public static int recursiveBinarySearch(int[] array, int leftIndex, int rightIndex, int necessaryNumber) {
        if (leftIndex > rightIndex) {
            return -1;
        }

        int middle = (leftIndex + rightIndex) / 2;

        if (array[middle] == necessaryNumber) {
            return middle;
        } else if (necessaryNumber > array[middle]) {
            return recursiveBinarySearch(array, middle + 1, rightIndex, necessaryNumber);
        }

        return recursiveBinarySearch(array, leftIndex, middle - 1, necessaryNumber);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите искомое число:");
        int number = scanner.nextInt();

        int leftIndex = 0;
        int rightIndex = array.length - 1;

        if (recursiveBinarySearch(array, leftIndex, rightIndex, number) == -1 || binarySearch(array, number) == -1) {
            System.out.printf("Числа %d нет в массиве!", number);
        } else {
            System.out.printf("Индекс числа %d равен %d%n", number, recursiveBinarySearch(array, leftIndex, rightIndex, number));
            System.out.printf("Индекс числа %d равен %d", number, binarySearch(array, number));
        }
    }
}