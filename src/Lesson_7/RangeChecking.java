package Lesson_7;

public class RangeChecking {
    public static void main(String[] args) {
        Range range = new Range(1, 20);

        System.out.println("Диапазон начинается с " + range.getFrom());
        System.out.println("Диапазон заканчивается на " + range.getTo());
        System.out.println("Длина заданного диапазона составляет " + range.getLength());

        double number = 10;

        if (range.isInside(number)) {
            System.out.printf("Число %f входит в заданный диапазон.", number);
        } else {
            System.out.printf("Число %f не входит в заданный диапазон.%n", number);
        }

        System.out.println();

        range.setFrom(10);
        range.setTo(50);

        System.out.println("Начало нового диапазона равно " + range.getFrom());
        System.out.println("Конец нового диапазона равен " + range.getTo());
    }
}