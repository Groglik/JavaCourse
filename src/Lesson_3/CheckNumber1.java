package Lesson_3;

import java.util.Scanner;

public class CheckNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите одно целое число:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число - положительное");
        } else if (number == 0) {
            System.out.println("Данное число - ноль");
        } else {
            System.out.println("Данное число - отрицательное");
        }
    }
}
