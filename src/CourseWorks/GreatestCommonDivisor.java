package CourseWorks;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Невозможно вычислить наибольший общий делитель.");
        } else {
            int numberA = number1;
            int numberB = number2;

            while (numberB != 0) {
                int temp = numberA;
                numberA = numberB;
                numberB = temp % numberA;
            }

            System.out.printf("Наибольший общий делитель чисел %d и %d равен %d.", number1, number2, numberA);
        }
    }
}