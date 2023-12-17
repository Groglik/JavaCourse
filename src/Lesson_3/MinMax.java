package Lesson_3;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите первое целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Пожалуйста, введите второе целое число:");
        int number2 = scanner.nextInt();

        int max1 = (number1 > number2) ? number1 : number2;
        System.out.println("Наибольшее число из введенных, первым способом - " + max1);

        int min1 = (number1 < number2) ? number1 : number2;
        System.out.println("Наименьшее число из введенных, первым способом - " + min1);

        System.out.println();

        int max2;
        int min2;

        if (number1 > number2) {
            max2 = number1;
            min2 = number2;
        } else {
            max2 = number2;
            min2 = number1;
        }

        System.out.println("Наибольшее число из введенных, вторым способом - " + max2);
        System.out.println("Наименьшее число из введенных, вторым способом - " + min2);
    }
}