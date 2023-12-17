package Lesson_4;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел в ряду:");
        int numbersAmount = scanner.nextInt();

        int i = 1;

        int seriesSum = 0;

        while (i <= numbersAmount) {
            if (i % 2 != 0) {
                seriesSum += (int) Math.pow(i, 2);
            } else {
                seriesSum -= (int) Math.pow(i, 2);
            }

            i++;
        }

        System.out.printf("Сумма ряда равна %d.", seriesSum);
    }
}