package Lesson_6;

public class Overloading {
    public static int getTypeSize(byte byteValue) {
        return 1;
    }

    public static int getTypeSize(short shortValue) {
        return 2;
    }

    public static int getTypeSize(int integerValue) {
        return 4;
    }

    public static int getTypeSize(long longValue) {
        return 8;
    }

    public static int getTypeSize(double doubleValue) {
        return 8;
    }

    public static int getTypeSize(float floatValue) {
        return 4;
    }

    public static void main(String[] args) {
        byte byteNumber = 1;
        System.out.println("Количество байт, требуемых под переменную byte составляет " + getTypeSize(byteNumber));

        short shortNumber = 1;
        System.out.println("Количество байт, требуемых под переменную short составляет " + getTypeSize(shortNumber));

        int intNumber = 1;
        System.out.println("Количество байт, требуемых под переменную int составляет " + getTypeSize(intNumber));

        long longNumber = 1L;
        System.out.println("Количество байт, требуемых под переменную long составляет " + getTypeSize(longNumber));

        double doubleNumber = 1.0;
        System.out.println("Количество байт, требуемых под переменную double составляет " + getTypeSize(doubleNumber));

        float floatNumber = 1.0F;
        System.out.println("Количество байт, требуемых под переменную float составляет " + getTypeSize(floatNumber));
    }
}