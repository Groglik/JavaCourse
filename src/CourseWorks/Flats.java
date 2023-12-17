package CourseWorks;

import java.util.Scanner;

public class Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество подъездов:");
        int entrancesQuantity = scanner.nextInt();

        System.out.println("Введите количество этажей в каждом подъезде:");
        int floorsQuantity = scanner.nextInt();

        System.out.println("Введите номер необходимой квартиры:");
        int flatNumber = scanner.nextInt();

        int flatsQuantityPerFloor = 4;
        int flatsQuantityPerEntrance = flatsQuantityPerFloor * floorsQuantity;
        int allFlatsQuantity = entrancesQuantity * flatsQuantityPerEntrance;

        if (flatNumber > allFlatsQuantity) {
            System.out.println("В доме нет квартиры с таким номером.");
        } else {
            int entranceNumber = (int) Math.ceil((double) flatNumber / flatsQuantityPerEntrance);
            System.out.println("Подъезд искомой квартиры " + entranceNumber);

            int floorNumber = (int) Math.ceil(flatNumber / (double) flatsQuantityPerFloor) - (entranceNumber - 1) * floorsQuantity;
            System.out.println("Этаж искомой квартиры: " + floorNumber);

            int flatPlace = flatNumber % flatsQuantityPerFloor;

            if (flatPlace == 1) {
                System.out.println("Искомая квартира ближняя слева.");
            } else if (flatPlace == 2) {
                System.out.println("Искомая квартира дальняя слева.");
            } else if (flatPlace == 3) {
                System.out.println("Искомая квартира дальняя справа.");
            } else {
                System.out.println("Искомая квартира ближняя справа.");
            }
        }
    }
}