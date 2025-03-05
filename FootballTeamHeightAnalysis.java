import java.util.Random;

class FootballTeamHeightAnalysis {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Assign random heights to players in the range 150 - 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }

        
        System.out.print("Players' heights (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Compute and display results
        System.out.println("Tallest Player: " + findTallest(heights) + " cm");
        System.out.println("Shortest Player: " + findShortest(heights) + " cm");
        System.out.println("Mean Height: " + findMeanHeight(heights) + " cm");
    }

 
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double findMeanHeight(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find the shortest height in the array
    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find the tallest height in the array
    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
