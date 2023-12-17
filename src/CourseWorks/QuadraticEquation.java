package CourseWorks;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите коэффициент а:");
        double a = scanner.nextDouble();

        System.out.println("Пожалуйста, введите коэффициент b:");
        double b = scanner.nextDouble();

        System.out.println("Пожалуйста, введите коэффициент c:");
        double c = scanner.nextDouble();

        final double epsilon = 1.0e-10;

        if (Math.abs(a) > epsilon) {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > epsilon) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.printf("Квадратное уравнение имеет два корня: х1 = %f х2 = %f.", x1, x2);
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.printf("Квадратное уравнение имеет один корень: х0 = %f.", x);
            } else {
                System.out.println("Квадратное уравнение не имеет корней.");
            }
        } else if (Math.abs(b) > epsilon) {
            double x = -c / b;
            System.out.println("Корень линейного уравнения равен " + x);
        } else {
            if (Math.abs(c) > epsilon) {
                System.out.println("Линейное уравнение не имеет корней.");
            } else {
                System.out.println("Уравнение имеет бесконечное количество корней.");
            }
        }
    }
}