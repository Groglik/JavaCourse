package Lesson_4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        System.out.println("Введите номер команды:");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                System.out.printf("%d + %d = %d", number1, number2, number1 + number2);
                break;
            case 2:
                System.out.printf("%d - %d = %d", number1, number2, number1 - number2);
                break;
            case 3:
                System.out.printf("%d * %d = %d", number1, number2, number1 * number2);
                break;
            case 4:
                System.out.printf("%d / %d = %f", number1, number2, (double) number1 / number2);
                break;
            default:
                System.out.println("Неизвестная команда.");
        }
    }
}