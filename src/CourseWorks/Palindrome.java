package CourseWorks;

public class Palindrome {
    public static boolean isPalindrome(String line) {
        line = line.toLowerCase();

        int leftIndex = 0;
        int rightIndex = line.length() - 1;

        while (leftIndex < rightIndex) {
            char letterFromLeft = line.charAt(leftIndex);
            char letterFromRight = line.charAt(rightIndex);

            if (letterFromLeft != letterFromRight) {
                return false;
            }

            do {
                leftIndex++;
            } while (!Character.isLetter(line.charAt(leftIndex)));

            do {
                rightIndex--;
            } while (!Character.isLetter(line.charAt(rightIndex)));
        }

        return true;
    }

    public static void main(String[] args) {
        String line = "Аргентина манит негра";

        if (isPalindrome(line)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}