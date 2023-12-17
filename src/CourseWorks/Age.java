package CourseWorks;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите свой возраст:");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы.");
        } else if (age > 112) {
            System.out.println("Вы слишком стары.");
        } else {
            int ageLastDigit = age % 10;
            int ageLastTwoDigits = age % 100;

            if (ageLastTwoDigits != 11 && ageLastDigit == 1) {
                System.out.printf("Вам %d год.", age);
            } else if ((ageLastTwoDigits >= 11 && ageLastTwoDigits <= 20) || ageLastDigit >= 5 || ageLastDigit == 0) {
                System.out.printf("Вам %d лет.", age);
            } else {
                System.out.printf("Вам %d года.", age);
            }
        }
    }
}