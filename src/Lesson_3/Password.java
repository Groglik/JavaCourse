package Lesson_3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String userPassword = "qwerty123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите пароль:");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(userPassword)) {
            System.out.println("Пароль верный.");
        } else if (enteredPassword.length() > userPassword.length()) {
            System.out.println("Пароль не верный - длина введенного пароля больше требуемого.");
        } else if (enteredPassword.length() < userPassword.length()) {
            System.out.println("Пароль не верный - длина введенного пароля меньше требуемого.");
        } else {
            System.out.println("Пароль неверный.");
        }
    }
}