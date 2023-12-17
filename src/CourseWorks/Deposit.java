package CourseWorks;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        double initialDeposit = scanner.nextDouble();

        System.out.println("Введите процентную ставку:");
        double percentage = scanner.nextDouble();

        System.out.println("Введите срок размещения вклада(месяцы):");
        int depositMonthsAmount = scanner.nextInt();

        final int monthsAmountPerYear = 12;
        final int hundredPercent = 100;

        double percentPerMonth = percentage / monthsAmountPerYear;

        double finalDeposit = initialDeposit * Math.pow((1 + percentPerMonth / hundredPercent), depositMonthsAmount);

        double profit = finalDeposit - initialDeposit;

        System.out.printf("Сумма вклада на начало срока составила %d руб. %.0f коп.%n", (int) initialDeposit, initialDeposit * 100 % 100);
        System.out.printf("Сумма вклада на конец срока составила %d руб. %.0f коп.%n", (int) finalDeposit, finalDeposit * 100 % 100);
        System.out.printf("Прибыль от вклада на конец срока составила %d руб. %.0f коп%n", (int) profit, profit * 100 % 100);
    }
}