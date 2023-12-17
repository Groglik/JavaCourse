package CourseWorks;

import java.util.Scanner;

public class MaxSubstring {
    public static int getMaxSubstringLength(String line) {
        line = line.toLowerCase();

        int maxSubstringLength = 0;
        int substringLength = 1;

        for (int i = 0; i < line.length() - 1; i++) {
            char currentSymbol = line.charAt(i);
            char nextSymbol = line.charAt(i + 1);

            if (currentSymbol == nextSymbol) {
                substringLength++;
            } else {
                maxSubstringLength = Math.max(maxSubstringLength, substringLength);
                substringLength = 1;
            }
        }

        return Math.max(maxSubstringLength, substringLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String line = scanner.nextLine();

        System.out.println("Максимальная длина подстроки в строке составляет " + getMaxSubstringLength(line));
    }
}