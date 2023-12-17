import java.util.Arrays;

public class Test2 {
    public static void sieving(int startIndex, int[] array, int endIndex) {
        while (true) {
            int child1Index = 2 * startIndex + 1;
            int child2Index = 2 * startIndex + 2;
            int maxChildIndex;

            if (child1Index < endIndex && child2Index < endIndex) {
                if (array[child1Index] > array[child2Index]) {
                    maxChildIndex = child1Index;
                } else {
                    maxChildIndex = child2Index;
                }
            } else if (child1Index < endIndex) {
                maxChildIndex = child1Index;
            } else if (child2Index < endIndex) {
                maxChildIndex = child2Index;
            } else {
                break;
            }

            int maxChild = array[maxChildIndex];
            int currentNumber = array[startIndex];

            if (currentNumber < maxChild) {
                array[startIndex] = maxChild;
                array[maxChildIndex] = currentNumber;
                startIndex = maxChildIndex;
            } else {
                break;
            }
        }
    }

    public static void HeapSort(int[] array) {
        int arrayLength = array.length - 1;
        int arrayHalf = (arrayLength) / 2;
        int currentNumberIndex = arrayHalf - 1;

        while (currentNumberIndex >= 0) {
            sieving(currentNumberIndex, array, arrayLength);

            currentNumberIndex--;
        }

        while (0 < arrayLength) {
            int temp = array[0];
            array[0] = array[arrayLength - 1];
            array[arrayLength - 1] = temp;

            arrayLength--;

            sieving(0, array, arrayLength);
        }
    }

    public static void main(String[] args) {
        int[] array2 = {12, 6, 13, 4, 56, 0, 16, 7, 1, -9, -100, 20, 21, 20, 20};
        System.out.println("Неотсортированный массив " + Arrays.toString(array2));

        HeapSort(array2);
        System.out.println("Отсортированный массив   " + Arrays.toString(array2));
    }
}