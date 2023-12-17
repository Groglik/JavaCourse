package Lesson_9;

public class SortingCheck {
    public static boolean isAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDescendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        int[] array2 = {9, 8, 7, 6, 5, 5, 4, 3, 2, 1};

        System.out.println("Массив отсортирован по возрастанию " + isAscendingOrder(array1));
        System.out.println("Массив отсортирован по убыванию " + isDescendingOrder(array2));
    }
}