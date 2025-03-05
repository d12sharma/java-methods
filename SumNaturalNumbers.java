import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to find sum of first n natural numbers
    static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Checking if input is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (n > 0).");
            return;
        }

        // Calculating sum using recursion and formula
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        // Displaying results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Comparing results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result. Verification successful!");
        } else {
            System.out.println("Mismatch in results. There might be an error!");
        }

        scanner.close();
    }
}
