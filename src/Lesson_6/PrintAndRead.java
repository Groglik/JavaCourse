package Lesson_6;

import java.util.Scanner;

public class PrintAndRead {
    public static int printAndRead(String inputInvitation) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(inputInvitation);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int a = printAndRead("Введите число:");
        System.out.println("Ваше число " + a);

        System.out.println();

        int b = printAndRead("Введите Ваше нелюбимое число:");
        System.out.println("Ваше нелюбимое число " + b);

        System.out.println();

        int c = printAndRead("Какое ваше любимое число:");
        System.out.println("Ваше любимое число " + c);
    }
}