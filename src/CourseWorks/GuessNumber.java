package CourseWorks;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер уровня сложности - легко(1)/нормально(2)/сложно(3):");
        int level = scanner.nextInt();

        Random random = new Random();
        int rangeMax = switch (level) {
            case 1 -> 10;
            case 2 -> 30;
            case 3 -> 50;
            default -> 0;
        };

        int hiddenNumber = random.nextInt(rangeMax) + 1;
        int triesAmount = 0;

        System.out.printf("Попробуйте угадать число от 1 до %d.%n", rangeMax);

        while (true) {
            System.out.println("Ваше число:");
            int number = scanner.nextInt();

            triesAmount++;

            if (number == hiddenNumber) {
                System.out.printf("Вы угадали! Количество попыток: %d", triesAmount);
                break;
            }

            String numbersComparisonHint = number > hiddenNumber ? "меньше" : "больше";
            System.out.printf("Неверно! Загаданное число %s.%n", numbersComparisonHint);
        }
    }
}