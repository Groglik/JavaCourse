package CourseWorks;

public class MultiplicationTable {
    public static void printLine(int columnsQuantity) {
        for (int i = 1; i <= columnsQuantity; i++) {
            System.out.print("------");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int maxMultiplyingNumber = 12;

        int tableSize = maxMultiplyingNumber + 1;

        printLine(tableSize);
        System.out.print("|     |");

        for (int i = 1; i < tableSize; i++) {
            System.out.printf(" %3d |", i);
        }

        System.out.println();

        for (int i = 1; i < tableSize; i++) {
            printLine(tableSize);
            System.out.printf("| %3d |", i);

            for (int j = 1; j < tableSize; j++) {
                System.out.printf(" %3d |", i * j);
            }

            System.out.println();
        }

        printLine(tableSize);
    }
}