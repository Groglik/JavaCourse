package Lesson_6;

import java.util.Scanner;

public class OrderPrice {
    public static double getOrderPriceWithDiscount(double goods1Price, int goods1Amount, double goods2Price, int goods2Amount) {
        double totalGoodsPrice = goods1Price * goods1Amount + goods2Price * goods2Amount;
        int totalGoodsAmount = goods1Amount + goods2Amount;

        final double discountForOneCondition = 0.05;
        final double discountForTwoConditions = 0.1;

        final int totalGoodsAmountThreshold = 10;
        final int totalGoodsPriceThreshold = 1000;

        if (totalGoodsAmount >= totalGoodsAmountThreshold && totalGoodsPrice >= totalGoodsPriceThreshold) {
            return totalGoodsPrice - totalGoodsPrice * discountForTwoConditions;
        }

        if (totalGoodsAmount >= totalGoodsAmountThreshold || totalGoodsPrice >= totalGoodsPriceThreshold) {
            return totalGoodsPrice - totalGoodsPrice * discountForOneCondition;
        }

        return totalGoodsPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цену за один пакет сока:");
        double juicePrice = scanner.nextDouble();

        System.out.println("Введите количество пакетов сока:");
        int juicePackagesAmount = scanner.nextInt();

        System.out.println("Введите цену за один пакет молока:");
        double milkPrice = scanner.nextDouble();

        System.out.println("Введите количество пакетов молока:");
        int milkPackagesAmount = scanner.nextInt();

        System.out.printf("Стоимость заказа с учетом скидки составляет %.2f.", getOrderPriceWithDiscount(juicePrice, juicePackagesAmount,
                milkPrice, milkPackagesAmount));
    }
}