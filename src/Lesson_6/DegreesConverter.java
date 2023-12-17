package Lesson_6;

import java.util.Scanner;

public class DegreesConverter {
    public static double convertCelsiusToFahrenheit(double celsiusDegrees) {
        return (celsiusDegrees * 9 / 5) + 32;
    }

    public static double convertCelsiusToKelvin(double celsiusDegrees) {
        return celsiusDegrees + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в Цельсиях:");
        double celsiusDegrees = scanner.nextDouble();

        System.out.printf("%.2f°C это %.2f°F.%n", celsiusDegrees, convertCelsiusToFahrenheit(celsiusDegrees));
        System.out.printf("%.2f°C это %.2fK.", celsiusDegrees, convertCelsiusToKelvin(celsiusDegrees));
    }
}