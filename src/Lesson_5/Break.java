package Lesson_5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String correctLine = "qwerty";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите загаданную строку:");
            String enteredLine = scanner.nextLine();

            if (enteredLine.equals(correctLine)) {
                System.out.println("Все верно!");
                break;
            }

            System.out.println("Неверно!");
            System.out.println();
        }
    }
}
