package Lesson_4;

public class DoWhileArithmeticMean {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 5;

        int allNumbersSum = 0;
        int evenNumbersSum = 0;

        int evenNumbersAmount = 0;
        int allNumbersAmount = 0;

        int i = firstNumber;

        do {
            allNumbersSum += i;
            allNumbersAmount++;

            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersAmount++;
            }

            i++;
        } while (i <= lastNumber);

        double allNumbersArithmeticMean = (double) allNumbersSum / allNumbersAmount;
        double evenNumbersArithmeticMean = (double) evenNumbersSum / evenNumbersAmount;

        System.out.printf("Среднее арифметическое всех чисел в диапазоне от %d до %d равно %.2f.%n", firstNumber, lastNumber,
                allNumbersArithmeticMean);
        System.out.printf("Среднее арифметическое всех четных чисел в диапазоне от %d до %d равно %.2f.", firstNumber, lastNumber,
                evenNumbersArithmeticMean);
    }
}