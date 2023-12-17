package Lesson_9;

public class ArrayEvenNumbersArithmeticMean {
    public static double getEvenNumbersArithmeticMean(int[] array) {
        int evenNumbersSum = 0;
        int evenNumbersQuantity = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenNumbersSum += e;
                evenNumbersQuantity++;
            }
        }

        return (double) evenNumbersSum / evenNumbersQuantity;
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 2, 20, 88, 7, 100, 3, 5, 12};

        System.out.println("Среднее арифметическое четных чисел массива равно " + getEvenNumbersArithmeticMean(array));
    }
}