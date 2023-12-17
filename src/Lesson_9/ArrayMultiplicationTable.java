package Lesson_9;

import java.util.Scanner;

public class ArrayMultiplicationTable {
    public static int[][] getMultiplicationTable(int tableSize) {
        int[][] multiplicationTable = new int[tableSize][tableSize];

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable.length; j++) {
                multiplicationTable[j][i] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите максимальное число множителя:");
        int tableSize = scanner.nextInt();

        int[][] multiplicationTable = getMultiplicationTable(tableSize);

        for (int[] row : multiplicationTable) {
            for (int column : row) {
                System.out.printf("%4d ", column);
            }

            System.out.println();
        }
    }
}