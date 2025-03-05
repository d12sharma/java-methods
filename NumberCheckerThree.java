import java.util.Arrays;

class NumberCheckerThree {
    public static void main(String[] args) {
        int number = 1221; // Example number
        
        // Finding count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Storing digits in an array
        int[] digitsArray = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        // Reversing the digits array
        int[] reversedArray = reverseDigitsArray(digitsArray);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // Checking if number is palindrome
        boolean isPalindrome = checkPalindrome(digitsArray, reversedArray);
        System.out.println("Is palindrome? " + isPalindrome);

        // Checking if number is a duck number
        boolean isDuck = checkDuckNumber(digitsArray);
        System.out.println("Is duck number? " + isDuck);
    }

    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean checkPalindrome(int[] original, int[] reversed) {
        return Arrays.equals(original, reversed);
    }

    // Method to check if a number is a Duck Number (contains '0' but doesn't start with it)
    public static boolean checkDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // Start from index 1 to avoid leading zero
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
