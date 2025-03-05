import java.util.Scanner;

public class TrigonometricFunctionsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        
        // Calculate trigonometric functions
        double[] trigValues = calculateTrigonometricFunctions(angle);
        
        // Display the results
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
        
       
    }
    
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
}
