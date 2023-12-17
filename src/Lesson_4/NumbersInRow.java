package Lesson_4;

import java.util.Scanner;

public class NumbersInRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите конечное число:");
        int lastNumber = scanner.nextInt();

        System.out.println("Введите количество чисел в строке:");
        int NumbersAmountInRow = scanner.nextInt();

        int numbersAmount = 0;
        int i = firstNumber;

        while (i <= lastNumber) {
            System.out.printf("%3d ", i);

            numbersAmount++;

            if (numbersAmount % NumbersAmountInRow == 0) {
                System.out.println();
            }

            i++;
        }
    }
}