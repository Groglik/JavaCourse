package Lesson_9;

import java.util.Scanner;

public class ElementSearching {
    public static int getRequiredNumberIndex(int[] array, int requiredNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == requiredNumber) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 2, 20, 88, 7, 100, 3, 5, 12};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для поиска:");
        int requiredNumber = scanner.nextInt();

        int requiredNumberIndex = getRequiredNumberIndex(array, requiredNumber);

        if (requiredNumberIndex == -1) {
            System.out.println("Запрашиваемое число не найдено");
        } else {
            System.out.println("Индекс числа равен " + requiredNumberIndex);
        }
    }
}