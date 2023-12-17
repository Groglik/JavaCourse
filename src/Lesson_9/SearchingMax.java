package Lesson_9;

public class SearchingMax {
    public static int getMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int e : array) {
            maxNumber = Math.max(maxNumber, e);
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        int[] array = {-1, -6, -9, -2, -20, -88, -7, -100, -3, -5, -12};

        System.out.println("Максимальное число в массиве является " + getMaxNumber(array));
    }
}