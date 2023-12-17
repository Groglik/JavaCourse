package Lesson_10;

import java.util.Scanner;

public class Exponentiation {
    public static long recursiveRaiseToPower(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return recursiveRaiseToPower(number, power - 1) * number;
    }

    public static long raiseToPower(int number, int power) {
        long multiplicationResult = 1;

        for (int i = 1; i <= power; i++) {
            multiplicationResult *= number;
        }

        return multiplicationResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        System.out.println("Введите степень:");
        int power = scanner.nextInt();

        // Через рекурсию
        System.out.printf("Возведение числа %d в степень %d, с помощью рекурсии, равно %d%n%n", number, power, recursiveRaiseToPower(number, power));

        // Через цикл
        System.out.printf("Возведение числа %d в степень %d, с помощью цикла, равно %d", number, power, raiseToPower(number, power));
    }
}