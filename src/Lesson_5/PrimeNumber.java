package Lesson_5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        System.out.println("Простыми числами для введенного числа являются:");

        for (int i = 2; i <= number; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.printf("%d ", i);
            }
        }
    }
}