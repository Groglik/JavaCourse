package CourseWorks;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите координаты первой точки А:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Пожалуйста, введите координаты второй точки В:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Пожалуйста, введите координаты третьей точки С:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        final double epsilon = 1.0e-10;

        if (Math.abs((x3 - x1) * (y3 - y2) - (y3 - y1) * (x3 - x2)) <= epsilon) {
            System.out.println("Введенные точки лежат на одной прямой.");
        } else {
            double aSideLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double bSideLength = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double cSideLength = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

            double triangleSemiPerimeter = (aSideLength + bSideLength + cSideLength) / 2;

            double triangleArea = Math.sqrt(triangleSemiPerimeter * (triangleSemiPerimeter - aSideLength) *
                    (triangleSemiPerimeter - bSideLength) * (triangleSemiPerimeter - cSideLength));
            System.out.println("Площадь треугольника равна " + triangleArea);
        }
    }
}