package Lesson_12;

import java.util.Arrays;

public class LinePartition {
    public static void main(String[] args) {
        String line = "1, 2, 3, 4, 5";

        String[] stringNumbersArray = line.split(", ");
        int[] integerNumbersArray = new int[stringNumbersArray.length];

        for (int i = 0; i < stringNumbersArray.length; i++) {
            integerNumbersArray[i] = Integer.parseInt(stringNumbersArray[i]);
        }

        int sum = 0;

        for (int integerNumber : integerNumbersArray) {
            sum += integerNumber;
        }

        System.out.println("Массив целых чисел из строки является " + Arrays.toString(integerNumbersArray));
        System.out.println("Сумма целых чисел массива составляет " + sum);
    }
}