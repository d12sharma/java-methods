import java.util.Arrays;

class RandomNumberAnalysis {
    public static void main(String[] args) {
        int size = 5; // Number of random numbers to generate
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Display the generated random numbers
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Get the average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000); 
        }
        return numbers;
    }

    // Method to find average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max}; // Returning array with average, min, and max
    }
}
