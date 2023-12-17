package Lesson_9;

import java.util.Arrays;

public class StringsArrayToUpperCase {
    public static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] array = {"hello", "world", "java", "life"};

        convertToUpperCase(array);

        System.out.println(Arrays.toString(array));
    }
}