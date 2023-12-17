package Lesson_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileConversionToUpperCase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"));
             PrintWriter writer = new PrintWriter("output.txt")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line.toUpperCase());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}