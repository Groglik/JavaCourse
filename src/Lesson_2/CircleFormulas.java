package Lesson_2;

public class CircleFormulas {
    public static void main(String[] args) {
        // Задание первое - вычисление площади круга и длины окружности.
        int radius1 = 12;
        double circleArea1 = Math.PI * Math.pow(radius1, 2);
        double circumference1 = 2 * Math.PI * radius1;

        System.out.println("The first task:");
        System.out.println("Area of a Circle = " + circleArea1);
        System.out.println("Circumference of a Circle = " + circumference1);

        // Задание второе - вычисление радиуса окружности.
        double circleArea2 = 20.0;
        double radius2 = Math.sqrt(circleArea2 / Math.PI);

        System.out.println();
        System.out.println("The second task:");
        System.out.println("Radius of a Circle = " + radius2);

        // Задание третье - вычисление площади сектора окружности.
        int radius3 = 21;
        int angle3 = 90;
        double circleSectorArea3 = angle3 * Math.PI * Math.pow(radius3, 2) / 360;

        System.out.println();
        System.out.println("The third task:");
        System.out.println("Area of Sector of a Circle = " + circleSectorArea3);
    }
}
