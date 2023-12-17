package CourseWorks;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите интересующий вас порядковый номер последовательности Фибоначчи:");
        int fibonacciNumberIndex = scanner.nextInt();

        if (fibonacciNumberIndex == 1) {
            System.out.println("Число Фибоначчи под номером 1 равно 1.");
        } else if (fibonacciNumberIndex == 2) {
            System.out.println("Число Фибоначчи под номером 2 равно 1.");
        } else {
            int previousFibonacciNumber = 1;
            int followingFibonacciNumber = 1;
            int currentFibonacciNumber = 0;

            int i = 3;

            while (i <= fibonacciNumberIndex) {
                currentFibonacciNumber = previousFibonacciNumber + followingFibonacciNumber;
                previousFibonacciNumber = followingFibonacciNumber;
                followingFibonacciNumber = currentFibonacciNumber;

                i++;
            }

            System.out.printf("Число Фибоначчи под номером %d равно %d.", fibonacciNumberIndex, currentFibonacciNumber);
        }
    }
}
