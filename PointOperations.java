import java.util.Scanner;

class PointOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input for Two Points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate Euclidean Distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance between points: " + distance);

        // Calculate Line Equation
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }

    // Method to calculate Euclidean distance
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate equation of the line
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // Slope
        double b = y1 - (m * x1); // Y-Intercept
        return new double[]{m, b};
    }
}
