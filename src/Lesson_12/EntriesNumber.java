package Lesson_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntriesNumber {
    public EntriesNumber() {
    }

    public static int getEntriesQuantity(String text, String line, int startIndex) {
        String lowerCaseText = text.toLowerCase();
        String lowerCaseLine = line.toLowerCase();

        int entriesQuantity;
        for(entriesQuantity = 0; lowerCaseText.indexOf(lowerCaseLine, startIndex) != -1; startIndex = lowerCaseText.indexOf(lowerCaseLine, startIndex) + 1) {
            ++entriesQuantity;
        }

        return entriesQuantity;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("input.txt"));

        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите строку для поиска в тексте:");
            String line = scanner1.nextLine();
            int entriesQuantity = 0;

            while(true) {
                if (!scanner.hasNextLine()) {
                    System.out.printf("Количество вхождений строки \"%s\" в этот текст: %d", line, entriesQuantity);
                    break;
                }

                String text = scanner.nextLine();
                int startIndex = 0;
                entriesQuantity += getEntriesQuantity(text, line, startIndex);
            }
        } catch (Throwable var8) {
            try {
                scanner.close();
            } catch (Throwable var7) {
                var8.addSuppressed(var7);
            }

            throw var8;
        }

        scanner.close();
    }
}