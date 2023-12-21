package CourseWorks;

public class Palindrome {
    public static boolean isPalindrome(String line) {
        line = line.toLowerCase();

        int leftIndex = 0;
        int rightIndex = line.length() - 1;

        while (leftIndex <= rightIndex) {
            while (!Character.isLetter(line.charAt(leftIndex))) {
                if (leftIndex >= rightIndex) {
                    return false;
                }

                leftIndex++;
            }

            while (!Character.isLetter(line.charAt(rightIndex))) {
                rightIndex--;
            }

            char symbolFromLeft = line.charAt(leftIndex);
            char symbolFromRight = line.charAt(rightIndex);

            if (symbolFromLeft != symbolFromRight) {
                return false;
            }

            leftIndex++;
            rightIndex--;

            if (leftIndex == rightIndex) {
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String line = "Аргент00000ина **м   а///нит    негра";

        if (isPalindrome(line)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}