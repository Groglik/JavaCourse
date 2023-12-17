package Lesson_12;

public class LinePartition {
    public LinePartition() {
    }

    public static void main(String[] args) {
        String line = "1, 2, 3, 4, 5";
        String[] arrayFromLine = line.split(", ");
        int sum = 0;
        String[] var4 = arrayFromLine;
        int var5 = arrayFromLine.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String number = var4[var6];
            sum += Integer.parseInt(number);
        }

        System.out.println("Сумма цифр из строки составляет " + sum);
    }
}