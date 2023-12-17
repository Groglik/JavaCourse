package Lesson_4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            digitsSum += lastDigit;

            if (lastDigit % 2 != 0) {
                oddDigitsSum += lastDigit;
            }

            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }

            number /= 10;
        }

        System.out.println("Сумма всех цифр числа равна " + digitsSum + ".");
        System.out.println("Сумма всех нечетных цифр числа равна " + oddDigitsSum + ".");
        System.out.println("Самая большая цифра в числе равна " + maxDigit + ".");
    }
}