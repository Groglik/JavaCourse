package CourseWorks;

import java.util.Scanner;

public class NextDayDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите дату через пробел ДД ММ ГГ:");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (year < 1) {
            System.out.println("Год не может быть меньше единицы!");
        } else if (month < 1 || month > 12) {
            System.out.println("Месяц не может быть больше 12 или меньше единицы!");
        } else {
            int monthLastDay;

            if (month == 2) {
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                monthLastDay = isLeapYear ? 29 : 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                monthLastDay = 30;
            } else {
                monthLastDay = 31;
            }

            if (day < 1 || day > monthLastDay) {
                System.out.printf("Число не может быть больше %d или меньше единицы!", monthLastDay);
            } else {
                if (day < monthLastDay) {
                    System.out.printf("Дата следующего дня - %02d.%02d.%d.", day + 1, month, year);
                } else {
                    if (month == 12) {
                        System.out.printf("Дата следующего дня - %02d.%02d.%d.", 1, 1, year + 1);
                    } else {
                        System.out.printf("Дата следующего дня - %02d.%02d.%d.", 1, month + 1, year);
                    }
                }
            }
        }
    }
}