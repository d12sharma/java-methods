import java.util.*;

class NumberCheccker {
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

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(digits, number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find the largest and second largest digits
        int[] largestNumbers = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestNumbers[0] + ", Second Largest: " + largestNumbers[1]);

        // Find the smallest and second smallest digits
        int[] smallestNumbers = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestNumbers[0] + ", Second Smallest: " + smallestNumbers[1]);

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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // Start from index 1 to avoid leading zeros
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int num) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
