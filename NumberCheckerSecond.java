import java.util.Arrays;
import java.util.Scanner;

class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find digit count
        int digitCount = countDigits(number);
        System.out.println("Total digits: " + digitCount);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // Find the sum of digits
        int sumOfDigits = sumDigits(digits);
        System.out.println("Sum of Digits: " + sumOfDigits);

        // Find the sum of squares of digits
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit
        int[][] digitFrequency = findDigitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : digitFrequency) {
            System.out.println("Digit: " + row[0] + " -> Count: " + row[1]);
        }

        sc.close();
    }

    // Method to count the number of digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int num, int sumOfDigits) {
        return num % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10]; // Since digits are 0-9
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Count non-zero entries to determine array size
        int count = 0;
        for (int freq : frequency) {
            if (freq > 0) count++;
        }

        // Store digit and frequency in a 2D array
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;  // Digit
                result[index][1] = frequency[i]; // Frequency
                index++;
            }
        }
        return result;
    }
}
