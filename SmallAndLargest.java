import java.util.Scanner;

class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        findSmallestAndLargest(number1, number2, number3);
        

        
    }

    public static void findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
		System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);
      
    }
}
