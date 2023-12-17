package Lesson_2;

import java.util.Scanner;

public class RectangleCharacteristics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника:");
        double rectangleLength = scanner.nextDouble();

        System.out.println("Введите ширину прямоугольника:");
        double rectangleWidth = scanner.nextDouble();

        double rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
        double rectangleArea = rectangleLength * rectangleWidth;

        System.out.printf("%-15s = %.2f%n", "Длина прямоугольника", rectangleLength);
        System.out.printf("%-15s = %.2f%n", "Ширина прямоугольника", rectangleWidth);
        System.out.printf("%-15s = %.2f%n", "Периметр прямоугольника", rectanglePerimeter);
        System.out.printf("%-15s = %.2f%n", "Площадь прямоугольника", rectangleArea);
    }
}