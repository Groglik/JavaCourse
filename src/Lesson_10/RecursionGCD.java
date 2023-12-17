package Lesson_10;

import java.util.Scanner;

public class RecursionGCD {
    public static int getGCD(int numberA, int numberB) {
        if (numberA == 0 && numberB == 0) {
            return -1;
        }

        if (numberB == 0) {
            return numberA;
        }

        return getGCD(numberB, numberA % numberB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        if (getGCD(number1, number2) == -1) {
            System.out.println("Невозможно вычислить наибольший общий делитель.");
        } else {
            System.out.printf("Наибольший общий делитель чисел %d и %d равен %d.", number1, number2, getGCD(number1, number2));
        }
    }
}