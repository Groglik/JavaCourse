package Lesson_8;

import java.util.Scanner;

public class SymbolsCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вашу строчку:");
        String line = scanner.nextLine();

        int lettersQuantity = 0;
        int digitsQuantity = 0;
        int spacesQuantity = 0;
        int otherSymbolsQuantity = 0;

        for (int i = 0; i < line.length(); i++) {
            char lineChar = line.charAt(i);

            if (Character.isLetter(lineChar)) {
                lettersQuantity++;
            } else if (Character.isDigit(lineChar)) {
                digitsQuantity++;
            } else if (Character.isWhitespace(lineChar)) {
                spacesQuantity++;
            } else {
                otherSymbolsQuantity++;
            }
        }

        System.out.println("Количество букв в строке равно " + lettersQuantity);
        System.out.println("Количество цифр в строке равно " + digitsQuantity);
        System.out.println("Количество пробельных символов в строке равно " + spacesQuantity);
        System.out.println("Количество остальных символов в строке равно " + otherSymbolsQuantity);
    }
}